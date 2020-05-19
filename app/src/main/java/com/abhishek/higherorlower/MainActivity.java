package com.abhishek.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int rno;
    public void pressMe(View view)
    {
        EditText et= (EditText) findViewById(R.id.myTextField);

        int guess=Integer.parseInt(et.getText().toString());

        if(guess==rno)
        {
            Toast.makeText(MainActivity.this, "Yes you picked it right!Try Again", Toast.LENGTH_SHORT).show();
            Random random= new Random();
            rno= random. nextInt(20)+1;
        }
        else if(guess>rno)
        {
            Toast.makeText(MainActivity.this, "lower", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "higher", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random= new Random();
        rno= random. nextInt(20)+1;

    }
}
