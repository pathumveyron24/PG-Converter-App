package com.industrialmaster.pgconverter;

import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;



public class MainActivity extends AppCompatActivity {
    EditText temp;
    RadioButton toC;
    RadioButton toF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temp=(EditText)findViewById(R.id.temperatureEditText);
        toC=(RadioButton)findViewById(R.id.toCelsiusRadioButton);
        toF=(RadioButton)findViewById(R.id.toFarenheitRadioButton);
    }
    public void convert(View v){
        double value = new Double(temp.getText().toString());
        if(toC.isChecked())
            value=UnitConverter.farenhit2Celsius(value);
        else
            value=UnitConverter.celsius2Farenhit(value);
        temp.setText(new Double(value).toString());

    }

}
