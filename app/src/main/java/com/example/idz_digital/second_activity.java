package com.example.idz_digital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
     TextView NameTextView;
     TextView AgeTextView;
     TextView SalaryTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        Bundle bundle = getIntent().getExtras();
        String Name = bundle.getString("Name");
        String Age = bundle.getString("Age");
        String Salary = bundle.getString("Salary");

        NameTextView = findViewById(R.id.secondActivityNameTextField);
        AgeTextView = findViewById(R.id.secondActivityAgeTextField);
        SalaryTextView = findViewById(R.id.secondActivitySalaryTextField);

        NameTextView.setText(Name);
        AgeTextView.setText(Age);
        SalaryTextView.setText(Salary);
    }
}