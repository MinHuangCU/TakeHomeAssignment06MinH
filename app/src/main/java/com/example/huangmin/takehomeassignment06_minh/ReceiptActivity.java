package com.example.huangmin.takehomeassignment06_minh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiptActivity extends AppCompatActivity {
    private TextView finalInfo;
    private String finalText;
    private double total;
    private double salesTax;
    private double tipPercentage;
    private double grandTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        finalInfo=(TextView)findViewById(R.id.finalInfo_text_view);
        setTitle("Your Receipt");
        Bundle finalMessage=getIntent().getExtras();
        total=finalMessage.getDouble("Total",0);
        tipPercentage=finalMessage.getDouble("Tip",0);
        salesTax=finalMessage.getDouble("Tax",0);
        grandTotal=total*(1+salesTax+tipPercentage);
        finalText="Total: "+total;
        finalText+="\nSales Tax: "+total*salesTax;
        finalText+="\nTip: "+total*tipPercentage;
        finalText+="\nGrand Total: "+(total+total*(salesTax+tipPercentage));


        finalInfo.setText(finalText);
    }



}
