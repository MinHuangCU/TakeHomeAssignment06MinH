package com.example.huangmin.takehomeassignment06_minh;

import java.io.Serializable;

/**
 * Created by huangmin on 18/3/4.
 */

public class Receipt implements Serializable {
    private double amount;
    private double salesTax;
    private double tip;
    private double grandTotal;

    public Receipt (double amount,double salesTax,double tip,double grandTotal){
        this.amount=amount;
        this.salesTax=salesTax;
        this.tip=tip;
        this.grandTotal=grandTotal;
    }




}
