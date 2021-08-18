package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Padoo");
    }

    public void disable (View v){

       /* findViewById(R.id.button2).setEnabled(false);
        ((Button)findViewById(R.id.button2)).setText("Sent");*/

       View myView = findViewById(R.id.button2);
       myView.setEnabled(false);
       Button b = (Button) myView;
       b.setText("Disabled");
        /*v.setEnabled(false);
        Button b = (Button) v;
        b.setText("Disabled"); */

    }

    public void handleText(View v){
       /* EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input); */
        if (((EditText)findViewById(R.id.source)) == null) {
            Toast.makeText(this, "Please Enter a Message", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Sent", Toast.LENGTH_LONG).show();
        }
    }

   public void launchSettings(View v){
        Intent i = new Intent(this, SettingsActivity.class);
        String message = ((EditText)findViewById(R.id.source)).getText().toString();
        i.putExtra("COOL", message);
        startActivity(i);

   }

   public void compose(View s){
        Intent c = new Intent(this, Compose.class);
        String name = ((Button)s).getText().toString();
        c.putExtra("NAME",name);
        startActivity(c);

   }

}
