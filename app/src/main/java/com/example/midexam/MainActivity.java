package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnExam1_clicked(View view) {
        Intent intent = new Intent(this, Exam1Activity.class);
        startActivity(intent);
    }

    public void btnExam2_clicked(View view) {
        Intent intent = new Intent(this, Exam2Activity.class);
        startActivity(intent);
    }
    public void btnExam3_clicked(View view) {
        Intent intent = new Intent(this, Exam3Activity.class);
        startActivity(intent);
    }
}
