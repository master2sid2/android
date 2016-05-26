package com.khutorniy.vitaliy.finance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by User on 25.05.2016.
 */
public class Day {

    protected String description;
    protected float genBalance;
    protected float curBalance;
    //private Param param = new Param();

    public List<Param> dates = new ArrayList<>();

    Day(){

    }

    public void setDates(String date, float sum){

        Param param = new Param();

        param.setData(date,sum);
        this.dates.add(param);
    }

    //public String getDates(){
    //
    //}

    public float getSum(){
        float sum = 0;

        for (Param num:dates) {
            sum = sum + num.getSum();
        }
        return sum;
    }
}
