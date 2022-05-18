package com.saqib.akhbar.loginandsingup;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.FirebaseDatabase;
import com.saqib.akhbar.loginandsingup.databinding.ActivitySignInBinding;

import java.util.Objects;

public class SignInActivity extends AppCompatActivity {

    FirebaseAuth auth;
    ActivitySignInBinding binding;
    GoogleSignInClient mGoogleSignInClient;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).hide();
        auth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();



        binding.signIn.setOnClickListener(view -> auth.signInWithEmailAndPassword(binding.editTextTextEmailAddress.getText().toString(),
                binding.editTextTextPassword.getText().toString())
                .addOnCompleteListener(task -> {
                    if(task.isSuccessful()){

                        Intent intent=new Intent(SignInActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        Toast.makeText(SignInActivity.this, Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }));

        if(auth.getCurrentUser()!=null){
            Intent intent=new Intent(SignInActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }


        // Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        binding.google.setOnClickListener(view -> {
            signIn();
        });

    }



    int RC_SIGN_IN=65;
    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);

        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                Log.d("TAG", "firebaseAuthWithGoogle:" + account.getId());
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately
                Log.w("TAG", "Google sign in failed", e);
            }
        }
    }

    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        auth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("TAG", "signInWithCredential:success");
                            FirebaseUser user = auth.getCurrentUser();
                            Users users=new Users();
                            users.setPersonName(user.getDisplayName());
                            users.setEmailId(user.getUid());
                            users.setPic(user.getPhotoUrl().toString());

                            database.getReference().child("Users").child(user.getUid()).setValue(users);
                            Intent intent=new Intent(SignInActivity.this,MainActivity.class);
                            startActivity(intent);
                            finish();
                            Toast.makeText(SignInActivity.this, "Sign In with Google", Toast.LENGTH_SHORT).show();
                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("TAG", "signInWithCredential:failure", task.getException());
                            //updateUI(null);
                        }
                    }
                });
    }
}