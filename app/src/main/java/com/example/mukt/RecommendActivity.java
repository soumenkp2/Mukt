package com.example.mukt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RecommendActivity extends AppCompatActivity {

    AutoCompleteTextView states;
    AutoCompleteTextView city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        states = findViewById(R.id.dropdown_state);
        city = findViewById(R.id.dropdown_city);

        ArrayList<String> states_all = new ArrayList<>();


        states_all.addAll(Arrays.asList(
                        "WEST BENGAL",
                "DELHI",
                "RAJASTHAN" ,
                "MAHARASHTRA",
                "GOA",
                "ODISHA",
                "PUNJAB",
                "ANDHRA PRADESH",
                "KARNATAKA" ,
                "UTTAR PRADESH",
                "BIHAR",
                "TAMIL NADU",
                "HARYANA",
                "TRIPURA",
                "NAGALAND" ,
                "KERALA" ,
                "MADHYA PRADESH" ,
                "MANIPUR" ,
                "ASSAM",
                "MIZORAM" ,
                "CHANDIGARH" ,
                "HIMACHAL PRADESH",
                "MEGHALAYA",
                "GUJARAT" ,
                "JAMMU & KASHMIR"));

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.layout_dropdown,states_all);
        states.setAdapter(arrayAdapter);


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kolkata");
        cities.add("Malda");
        cities.add("Coochebar");

        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this,R.layout.layout_dropdown,cities);
        city.setAdapter(arrayAdapter1);



    }
}