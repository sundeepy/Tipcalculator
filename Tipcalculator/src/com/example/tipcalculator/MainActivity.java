package com.example.tipcalculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
public class MainActivity extends Activity {
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText amt = (EditText) findViewById(R.id.bill_amt);
        final EditText tip = (EditText) findViewById(R.id.bill_per);
        final TextView result = (TextView) findViewById(R.id.res);
 
        Button calc = (Button) findViewById(R.id.button1);
        calc.setOnClickListener(new View.OnClickListener() {
 
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double amount = Double.parseDouble(amt.getText().toString());
                double tip_per = Double.parseDouble(tip.getText().toString());
                double tip_cal = (amount * tip_per) / 100;
                result.setText("Tip is : " + Double.toString(tip_cal));
            }
        });
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
}