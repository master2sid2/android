package com.khutorniy.vitaliy.finance;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Day newDay = new Day();

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setBal(View v) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());

        EditText myDatesField = (EditText) findViewById(R.id.datesField);
        EditText MySumField = (EditText)findViewById(R.id.sumField);
        TextView MyDataTextView = (TextView)findViewById(R.id.dataTextView);
        assert MySumField != null;
        String sum = MySumField.getText().toString();
        float f = 0.0f;
        if(!sum.equals("")){
            f = Float.parseFloat(MySumField.getText().toString());
        }
        assert myDatesField != null;
        newDay.setDates(dateFormat.format(date),f,myDatesField.getText().toString());
    }

    public void getBal(View v)  {

        TextView MyDataTextView = (TextView)findViewById(R.id.dataTextView);
        TextView MySumTextView = (TextView)findViewById(R.id.sumTextView);

        assert MySumTextView != null;
        MySumTextView.setText(String.valueOf(newDay.getSum()));
        assert MyDataTextView != null;
        MyDataTextView.setText(newDay.getDates());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setIcon(0)
                    .setTitle("Внимание!")
                    .setMessage("Выйти?")
                    .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            return;
                        }
                    })
                    .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            return;
                        }
                    })
                    .show();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
