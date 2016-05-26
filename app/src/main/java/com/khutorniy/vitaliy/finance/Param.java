package com.khutorniy.vitaliy.finance;

/**
 * Created by User on 26.05.2016.
 */
public class Param {

    private String data;
    private float sum;
    private String description;

    Param (){

    }

    public void setData(String data, float sum, String desc) {
        this.data = data;
        this.sum = sum;
        this.description = desc;
    }

    public String getData() {
        return data;
    }

    public float getSum() {
        return sum;
    }

    public String getDesc(){
        return this.description;
    }
}
