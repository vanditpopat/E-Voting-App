package com.example.evoting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button)findViewById(R.id.btnRegNew);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Signup.class);
                startActivity(i);
            }
        });
    }
}
