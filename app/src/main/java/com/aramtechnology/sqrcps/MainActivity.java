package com.aramtechnology.sqrcps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aramtechnology.sqrcps.utilities.sqrcps.Sqrcps;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1- first step read the SQRCPS text value
        String qr_text = "";
        //2- second step convert the SQRCPS to JSON object
        JSONObject  SQRCPSObject =new Sqrcps().convertToJson(qr_text);


    }
}