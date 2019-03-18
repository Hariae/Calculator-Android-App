package com.example.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button submitButton, addButton, subButton, mulButton, divButton;
    EditText textBox;
    int firstValue, secondValue;
    boolean isAdd=false, isSub=false, isMul=false, isDiv=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        submitButton = (Button) findViewById(R.id.button7);
        addButton = (Button) findViewById(R.id.button11);
        subButton = (Button) findViewById(R.id.button8);
        mulButton = (Button) findViewById(R.id.button9);
        divButton = (Button) findViewById(R.id.button10);
        textBox = (EditText) findViewById(R.id.editText3);

        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                firstValue = Integer.valueOf(textBox.getText().toString());
                textBox.setText("");
                isAdd = true;
            }
        });

        subButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                firstValue = Integer.valueOf(textBox.getText().toString());
                textBox.setText("");
                isSub=true;
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                firstValue = Integer.valueOf(textBox.getText().toString());
                textBox.setText("");
                isMul=true;
            }
        });

        divButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                firstValue = Integer.valueOf(textBox.getText().toString());
                textBox.setText("");
                isDiv=true;
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int answer=0;
                secondValue = Integer.valueOf(textBox.getText().toString());
                if(isAdd == true){
                    answer = firstValue+secondValue;
                }
                if(isSub == true){
                    answer = firstValue-secondValue;
                }
                if(isMul == true){
                    answer = firstValue*secondValue;
                }
                if(isDiv == true){
                    answer = firstValue/secondValue;
                }

                textBox.setText( answer+ "");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
