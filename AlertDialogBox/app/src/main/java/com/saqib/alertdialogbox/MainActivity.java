 package com.saqib.alertdialogbox;

 import android.app.AlertDialog;
 import android.os.Bundle;
 import android.widget.TextView;
 import android.widget.Toast;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

   TextView exitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exitBtn=findViewById(R.id.exit);
        exitBtn.setOnClickListener(view -> new AlertDialog.Builder(MainActivity.this)
                .setIcon(R.drawable.ic_baseline_warning_24)
                .setTitle("Exit")
                .setMessage("Are you sure ,You want to exit this app ..")
                .setNeutralButton("Help", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Click Yes,If you wan to exit this app", Toast.LENGTH_SHORT).show())
                .setPositiveButton("Yes", (dialogInterface, i) -> finish())
                .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.dismiss()).show()

         );
    }

     @Override
     public void onBackPressed() {

        // exitBtn.setOnClickListener(view ->
                    new AlertDialog.Builder(MainActivity.this)
                 .setIcon(R.drawable.ic_baseline_warning_24)
                 .setTitle("Exit")
                 .setMessage("Are you sure ,You want to exit this app ..")
                 .setNeutralButton("Help", (dialogInterface, i) -> Toast.makeText(MainActivity.this, "Click Yes,If you wan to exit this app", Toast.LENGTH_SHORT).show())
                 .setPositiveButton("Yes", (dialogInterface, i) -> finish())
                 .setNegativeButton("No", (dialogInterface, i) -> dialogInterface.dismiss()).show();

        // );
     }
 }