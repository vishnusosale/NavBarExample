package com.vishnu.rentongo.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;

import com.vishnu.rentongo.R;
import com.vishnu.rentongo.adapter.CustomSpinnerAdapter;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardView;


public class BusinessRegistrationActivity extends ActionBarActivity {

    Spinner citySpinner;
    Spinner localitySpinner;
    Spinner interestedInSpinner;
    Spinner categorySpinner;
    Spinner subCategorySpinner;

    String defaultTextForSpinner = "Select";
    String[] arrayForSpinner = {"Dummy Item One", "Dummy Item Two", "Dummy Item Three"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_registration);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF3497DA")));
        getSupportActionBar().setTitle("Rental Business");

        Card citySelectCard = new Card(getApplicationContext(), R.layout.business_registration_form);
        CardView cardView = (CardView)findViewById(R.id.businessCard);
        cardView.setCard(citySelectCard);

        citySpinner = (Spinner) findViewById(R.id.citySpinner);
        citySpinner.setAdapter(new CustomSpinnerAdapter(this, android.R.layout.simple_spinner_item, arrayForSpinner, defaultTextForSpinner));

        localitySpinner = (Spinner) findViewById(R.id.localitySpinner);
        localitySpinner.setAdapter(new CustomSpinnerAdapter(this, android.R.layout.simple_spinner_item, arrayForSpinner, defaultTextForSpinner));

        interestedInSpinner = (Spinner) findViewById(R.id.interestedInSpinner);
        interestedInSpinner.setAdapter(new CustomSpinnerAdapter(this, android.R.layout.simple_spinner_item, arrayForSpinner, defaultTextForSpinner));

        categorySpinner = (Spinner) findViewById(R.id.categorySpinner);
        categorySpinner.setAdapter(new CustomSpinnerAdapter(this, android.R.layout.simple_spinner_item, arrayForSpinner, defaultTextForSpinner));

        citySpinner = (Spinner) findViewById(R.id.citySpinner);
        citySpinner.setAdapter(new CustomSpinnerAdapter(this, android.R.layout.simple_spinner_item, arrayForSpinner, defaultTextForSpinner));

        subCategorySpinner = (Spinner) findViewById(R.id.subCategorySpinner);
        subCategorySpinner.setAdapter(new CustomSpinnerAdapter(this, android.R.layout.simple_spinner_item, arrayForSpinner, defaultTextForSpinner));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_business_registration, menu);
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

        if(id == android.R.id.home) {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
