package com.khutorniy.vitaliy.finance;

/**
 * Created by User on 26.05.2016.
 */
public class Param {

    private String data;
    private float sum;

    Param (){

    }

    public void setData(String data, float sum) {
        this.data = data;
        this.sum = sum;
    }

    public String getData() {
        return data;
    }

    public float getSum() {
        return sum;
    }
}
