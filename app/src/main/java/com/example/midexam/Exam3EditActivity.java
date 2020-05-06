package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam3EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3_edit);
        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.btn_save);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("Text", text);
                setResult(RESULT_OK, intent);
                finish();
            }
        };
        button.setOnClickListener(listener);
    }

}
