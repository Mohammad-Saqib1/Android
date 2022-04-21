package com.saqib.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText firstNum,secondNum;
    TextView answer;
    Button plus,minus,multiply,divide;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum=findViewById(R.id.fnum);
        secondNum=findViewById(R.id.lnum);
        answer=findViewById(R.id.answer);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        setTitle("Simple Calculator");


            plus.setOnClickListener(view -> {
                float first,second,ans;
                try{
                    if(firstNum==null && secondNum==null){
                        answer.setText("");
                    }
                    else{

                        assert firstNum != null;
                        first=Float.parseFloat(firstNum.getText().toString());
                        second=Float.parseFloat(secondNum.getText().toString());
                        ans=first+second;
                        answer.setText("Answer Is : "+ans);
                    }
                }catch (Exception e){
                    Toast.makeText(this, "Please Enter Your Value", Toast.LENGTH_SHORT).show();
                }

            });
        minus.setOnClickListener(view -> {
            float first,second,ans;
            try{
                if(firstNum==null && secondNum==null){
                    answer.setText("");
                }
                else{

                    assert firstNum != null;
                    first=Float.parseFloat(firstNum.getText().toString());
                    second=Float.parseFloat(secondNum.getText().toString());
                    ans=first-second;
                    answer.setText("Answer Is : "+ans);
                }
            }catch (Exception e){
                Toast.makeText(this, "Please Enter Your Value", Toast.LENGTH_SHORT).show();
            }

        });
        multiply.setOnClickListener(view -> {
            float first,second,ans;
            try{
                if(firstNum==null && secondNum==null){
                    answer.setText("");
                }
                else{

                    assert firstNum != null;
                    first=Float.parseFloat(firstNum.getText().toString());
                    second=Float.parseFloat(secondNum.getText().toString());
                    ans=first*second;
                    answer.setText("Answer Is : "+ans);
                }
            }catch (Exception e){
                Toast.makeText(this, "Please Enter Your Value", Toast.LENGTH_SHORT).show();
            }

        });
        divide.setOnClickListener(view -> {
            float first,second,ans;
            try{
                if(firstNum==null && secondNum==null){
                    answer.setText("");
                }
                else{

                    assert firstNum != null;
                    first=Float.parseFloat(firstNum.getText().toString());
                    second=Float.parseFloat(secondNum.getText().toString());
                    ans=first/second;
                    answer.setText("Answer Is : "+ans);
                }
            }catch (Exception e){
                Toast.makeText(this, "Please Enter Your Value", Toast.LENGTH_SHORT).show();
            }

        });










    }
}