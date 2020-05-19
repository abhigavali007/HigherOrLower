package com.abhishek.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void pressMe(View view)
    {
        EditText et= (EditText) findViewById(R.id.myTextField);
        Random random= new Random();
        int rno= random. nextInt(20)+1;
        int guess=Integer.parseInt(et.getText().toString());
        if(guess==rno)
        {
            Toast.makeText(MainActivity.this, "Yes you picked it right", Toast.LENGTH_SHORT).show();
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
    }
}
