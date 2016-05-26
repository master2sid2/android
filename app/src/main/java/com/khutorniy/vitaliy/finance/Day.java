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


    public List<Param> dates = new ArrayList<>();

    Day(){

    }

    public void setDates(String date, float sum, String desc){

        Param param = new Param();

        param.setData(date,sum,desc);
        this.dates.add(param);
    }

    public String getDates(){
        return dates.get(0).getData();
    }

    public String getDesc(){
        return dates.get(0).getDesc();
    }

    public float getSum(){
        float sum = 0;

        for (Param num:dates) {
            sum = sum + num.getSum();
        }
        return sum;
    }
}
