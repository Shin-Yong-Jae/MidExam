package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);
    }


        public void btnincrease_onclicked (View view){
            EditText ed1 = (EditText) findViewById(R.id.editText1);
            String str;
            str = ed1.getText().toString();
            int numInt = Integer.parseInt(str);
            numInt++;
            ed1.setText(numInt+"");
        }

        public void btndecrease_onclicked (View view){
            EditText ed1 = (EditText) findViewById(R.id.editText1);
            String str;
            str = ed1.getText().toString();
            int numInt = Integer.parseInt(str);
            numInt--;
            ed1.setText(numInt+"");
        }
    }
