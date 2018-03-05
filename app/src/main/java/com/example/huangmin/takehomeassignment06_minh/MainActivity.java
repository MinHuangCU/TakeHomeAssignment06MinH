package com.example.huangmin.takehomeassignment06_minh;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText amountText;
    private EditText taxText;
    private EditText tipText;
    private Button submitButton;
    private double total;
    private double tip;
    private double tax;
    private double grandTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Tip Calculator");

        amountText=(EditText)findViewById(R.id.amount_text_view);
        taxText=(EditText)findViewById(R.id.tax_percentage_text_view);
        tipText=(EditText)findViewById(R.id.tip_percentage_text_view);
        submitButton=(Button)findViewById(R.id.submit_button);

    }

    public void submit(View view) {
        Intent intent=new Intent(this,ReceiptActivity.class);
        amountText=(EditText)findViewById(R.id.amount_text_view);
        taxText=(EditText)findViewById(R.id.tax_percentage_text_view);
        tipText=(EditText)findViewById(R.id.tip_percentage_text_view);
        submitButton=(Button)findViewById(R.id.submit_button);



        double total=Double.parseDouble(amountText.getText().toString());
        double tip=Double.parseDouble(tipText.getText().toString());
        double tax=Double.parseDouble(taxText.getText().toString());
        grandTotal =total*(tax+tip)+total;

        intent.putExtra("Total",total);
        intent.putExtra("Tip",tip);
        intent.putExtra("Tax",tax);
        startActivity(intent);


    }


}
