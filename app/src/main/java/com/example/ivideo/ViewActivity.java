package com.example.ivideo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
    }

    public void RegisterPage(View view) {

        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    public void SignIn(View view) {

        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}
