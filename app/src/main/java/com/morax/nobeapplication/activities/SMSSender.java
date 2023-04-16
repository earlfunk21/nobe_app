package com.morax.nobeapplication.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.morax.nobeapplication.R;

public class SMSSender extends AppCompatActivity {

    private EditText phoneNumberEt;
    private EditText messageEt;
    private String phoneNumber;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smssender);

        TextView toolbarTitleTv = findViewById(R.id.toolbarTitleTv);
        toolbarTitleTv.setText("SMS Sender");

        phoneNumberEt = findViewById(R.id.phoneNumberEt);
        messageEt = findViewById(R.id.messageEt);
    }


    public void sendSMS(View view) {
        phoneNumber = phoneNumberEt.getText().toString();
        message = messageEt.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNumber, null));
        intent.putExtra("sms_body", message);
        startActivity(intent);
        Toast.makeText(SMSSender.this, "SMS Sent", Toast.LENGTH_SHORT).show();
    }


    public void clearEditTexts(View view) {
        phoneNumberEt.setText("");
        messageEt.setText("");
    }
}