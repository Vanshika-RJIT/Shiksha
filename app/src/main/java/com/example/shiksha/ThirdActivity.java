
package com.example.shiksha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    EditText t1,t2,t3,t4,t5;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1=findViewById(R.id.)
    }

    public void login(View view) {
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    public void register1(View view) {
        Intent i=new Intent(this,FourthActivity.class);
        startActivity(i);
    }
}