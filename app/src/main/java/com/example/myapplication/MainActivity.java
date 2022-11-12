package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "AnhnqCommit1N", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Commmit2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Commit3NNN", Toast.LENGTH_SHORT).show();
    }
}