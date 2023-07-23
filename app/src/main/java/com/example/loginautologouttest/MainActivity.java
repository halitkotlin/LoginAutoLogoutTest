package com.example.loginautologouttest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String uye_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getApplicationContext().getSharedPreferences("giris", 0);

        button = findViewById(R.id.logoutButon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
}