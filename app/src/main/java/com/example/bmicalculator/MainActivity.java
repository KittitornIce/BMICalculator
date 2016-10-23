package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Cal = (Button) findViewById(R.id.Cal_Button);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Calculator.class);
                EditText h = (EditText) findViewById(R.id.height_value);
                EditText w = (EditText) findViewById(R.id.weight_value);

                    //if(h != null && w != null){
                        //startActivity(intent);
                    //}else {

                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("ผิดพลาด");
                        dialog.setMessage("ป้อนข้อมูลไม่ครบ");
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {

                            }
                        });

                        dialog.show();
                    //}
            }
        });
    }
}
