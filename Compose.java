package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Compose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);

        Intent a = getIntent();
        String name = a.getStringExtra("NAME");


    }

    public void reply(View v){

        Intent i = new Intent(this, SettingsActivity.class);
        String message = ((EditText)findViewById(R.id.source)).getText().toString();
        i.putExtra("COOL", message);
        startActivity(i);

    }
}
