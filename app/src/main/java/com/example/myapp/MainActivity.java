package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    TextView out;
    EditText input;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week2_2);

        out = findViewById(R.id.textView);

        input = findViewById(R.id.editText);
        str = input.getText().toString();

        Button btn = findViewById(R.id.button2 );

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i("Info", "onClick: ListenerA");
//            }
//        });
//        btn.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
////        Log.i("Info" , "onClick: ListenerB");
////        str = input.getText().toString();
////        out.setText(str);
//    }

    public void abc(View view){
        Log.i("Info", "abc: ");
        out.setText("abc");
    }
}
