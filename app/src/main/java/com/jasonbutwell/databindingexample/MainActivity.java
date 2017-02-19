package com.jasonbutwell.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jasonbutwell.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // We have this because we enclosed our layout.xml in a <layout> tag
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a person to store some name as some example data
        Person testPerson = new Person("Suzanne","Starshine");

        // Set the binding to point to the layout
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        // call our helper method passing in the person object we created
        setViewFields( testPerson );
    }
    
    private void setViewFields( Person person ) {

        // check to ensure that the object passed in is not null
        if ( person != null ) {
            // set the first name of the UI view element to match the persons first name
            mainBinding.firstName.setText( person.getFirstName() );

            // set the last name of the UI view element to match the persons last name
            mainBinding.lastName.setText( person.getLastName() );
        }
    }

}
