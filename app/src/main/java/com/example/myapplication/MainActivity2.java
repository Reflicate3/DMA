package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Получить сообщение из Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Создание объекта TextView
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        // Делаем textView корневым элементов разметки activity
        setContentView(textView);
    }
}