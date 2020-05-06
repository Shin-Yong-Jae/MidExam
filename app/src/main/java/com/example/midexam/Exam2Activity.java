package com.example.midexam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Exam2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);
    }
    public void btn_onclick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirm");
        builder.setMessage("Do you want to Delete?");
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) { // 삭제 작업 실행
                TextView txt = (TextView) findViewById(R.id.textView);
                txt.setText("삭제성공");
                Toast.makeText(Exam2Activity.this, "삭제성공", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int index) { // 삭제 작업 실행
            TextView txt = (TextView) findViewById(R.id.textView);
            txt.setText("삭제실패");
            Toast.makeText(Exam2Activity.this, "삭제실패", Toast.LENGTH_SHORT).show();
        }
    });
        AlertDialog dialog = builder.create();
        dialog.show();
        }

    }

