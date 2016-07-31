package com.example.raghav_dell.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e,e1 ;
    Button b;
    RadioButton r;
    RadioGroup g ;
    double total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc();
    }
    public void calc()
    {
         e=(EditText)findViewById(R.id.editText);
         e1=(EditText)findViewById(R.id.editText2);
         b=(Button)findViewById(R.id.button);
         b.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v)
             {
                 Double basic= Double.parseDouble(e.getText().toString());
                 g=(RadioGroup)findViewById(R.id.Raghav);
                 final int selectid = g.getCheckedRadioButtonId();
                 r=(RadioButton)findViewById(selectid);
                 if(r.getText().equals("TA")) {
                     total = basic + (0.2 * basic);
                 }
                 if(r.getText().equals("DA")) {
                     total = basic + (0.5 * basic);
                 }
                 if(r.getText().equals("HRA")) {
                     total = basic + (0.1 * basic);

                 }
                 Toast.makeText(MainActivity.this, String.valueOf(total), Toast.LENGTH_SHORT).show();             }

         });
    }
}
