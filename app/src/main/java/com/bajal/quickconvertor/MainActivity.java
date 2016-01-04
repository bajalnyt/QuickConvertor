package com.bajal.quickconvertor;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {



    EditText f, c, miles, kms, gallons, liters, mpg, kmpl, mph, kmph, pounds,kilograms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ftoc
        f = (EditText) findViewById(R.id.fahrenheit);
        c = (EditText) findViewById(R.id.celsius);

        f.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(f.isFocused())
                    convertAndPopulate(f.getText().toString(),"fahrenheitToCelsius");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        c.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(c.isFocused())
                    convertAndPopulate(c.getText().toString(),"celsiusToFahrenheit");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        // mtokm
        miles = (EditText) findViewById(R.id.miles);
        kms = (EditText) findViewById(R.id.kilometers);

        miles.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(miles.isFocused())
                    convertAndPopulate(miles.getText().toString(),"milesToKm");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        kms.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(kms.isFocused())
                    convertAndPopulate(kms.getText().toString(),"kmtoMiles");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        // mtokm
        pounds = (EditText) findViewById(R.id.pounds);
        kilograms = (EditText) findViewById(R.id.kilograms);

        pounds.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(pounds.isFocused())
                    convertAndPopulate(pounds.getText().toString(),"poundsToKg");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        kilograms.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(kilograms.isFocused())
                    convertAndPopulate(kilograms.getText().toString(),"kgToPounds");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        // gtol
        gallons = (EditText) findViewById(R.id.gallons);
        liters = (EditText) findViewById(R.id.liters);

        gallons.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(gallons.isFocused())
                    convertAndPopulate(gallons.getText().toString(),"gallonToLiter");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        liters.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(liters.isFocused())
                    convertAndPopulate(liters.getText().toString(),"literToGallon");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });
        // mpg to kmpl
        kmpl = (EditText) findViewById(R.id.kmpl);
        mpg = (EditText) findViewById(R.id.mpg);

        kmpl.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(kmpl.isFocused())
                    convertAndPopulate(kmpl.getText().toString(),"kmplToMpg");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        mpg.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(mpg.isFocused())
                    convertAndPopulate(mpg.getText().toString(),"mpgToKmpl");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });
        // mph to kmph
        kmph = (EditText) findViewById(R.id.kmph);
        mph = (EditText) findViewById(R.id.mph);

        kmph.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(kmph.isFocused())
                    convertAndPopulate(kmph.getText().toString(),"kmphToMph");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });

        mph.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(mph.isFocused())
                    convertAndPopulate(mph.getText().toString(),"mphToKmph");
            }
            public void afterTextChanged(Editable s) {
            }
            public void beforeTextChanged(CharSequence arg0, int arg1,int arg2, int arg3) {
            }
        });
    }

    public void clearAllFields(View v) {
        c.setText("");
        f.setText("");
        kms.setText("");
        miles.setText("");
        kilograms.setText("");
        pounds.setText("");
        gallons.setText("");
        liters.setText("");
        kmpl.setText("");
        mpg.setText("");
        kmph.setText("");
        kmph.setText("");
    }

    private void convertAndPopulate(String value, String func) {
        //
        Log.v("Bajal", "Convertandpopulate "+func+":"+value);
        if("-".equals(value))
            return;

        if ("fahrenheitToCelsius".equals(func)) {
            if (value.length() > 0)
                c.setText(Conversions.fahrenheitToCelsius(value));
            else
                c.setText("");
        }

        else if ("celsiusToFahrenheit".equals(func)) {
            if (value.length() > 0)
                f.setText(Conversions.celsiusToFahrenheit(value));
            else
                f.setText("");
        }

        if ("milesToKm".equals(func)) {
            if (value.length() > 0)
                kms.setText(Conversions.milesToKm(value));
            else
                kms.setText("");
        }

        else if ("kmtoMiles".equals(func)) {
            if (value.length() > 0)
                miles.setText(Conversions.kmtoMiles(value));
            else
                miles.setText("");
        }

        if ("poundsToKg".equals(func)) {
            if (value.length() > 0)
                kilograms.setText(Conversions.poundsToKg(value));
            else
                kilograms.setText("");
        }

        else if ("kgToPounds".equals(func)) {
            if (value.length() > 0)
                pounds.setText(Conversions.kgToPounds(value));
            else
                pounds.setText("");
        }

        if ("literToGallon".equals(func)) {
            if (value.length() > 0)
                gallons.setText(Conversions.literToGallon(value));
            else
                gallons.setText("");
        }

        else if ("gallonToLiter".equals(func)) {
            if (value.length() > 0)
                liters.setText(Conversions.gallonToLiter(value));
            else
                liters.setText("");
        }

        if ("mpgToKmpl".equals(func)) {
            if (value.length() > 0)
                kmpl.setText(Conversions.mpgToKmpl(value));
            else
                kmpl.setText("");
        }

        else if ("kmplToMpg".equals(func)) {
            if (value.length() > 0)
                mpg.setText(Conversions.kmplToMpg(value));
            else
                mpg.setText("");
        }

        if ("mphToKmph".equals(func)) {
            if (value.length() > 0)
                kmph.setText(Conversions.mphToKmph(value));
            else
                kmph.setText("");
        }

        else if ("kmphToMph".equals(func)) {
            if (value.length() > 0)
                mph.setText(Conversions.kmphToMph(value));
            else
                mph.setText("");
        }

        else{
            //Log.v("Bajal", "No such function!");
        }

    }
}
