package com.morax.nobeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.morax.nobeapplication.activities.SMSSender;
import com.morax.nobeapplication.utils.AndroidUtils;

public class MainActivity extends AppCompatActivity {
    private EditText searchEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView toolbarTitleTv = findViewById(R.id.toolbarTitleTv);
        toolbarTitleTv.setText("Home");
        searchEt = findViewById(R.id.searchEt);
    }

    public void searchBtn(View view) {
        searchEt.setVisibility(View.VISIBLE);
        searchEt.requestFocus();
        AndroidUtils.showKeyboard(this);
    }

    public void openSMS(View view) {
        Intent intent = new Intent(this, SMSSender.class);
        startActivity(intent);
    }

    public void openGoogleMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.316720, 123.890710"));
        startActivity(intent);
    }
}