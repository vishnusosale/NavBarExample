package com.vishnu.rentongo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.vishnu.rentongo.fragment.BusinessRegistrationActivity;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardView;


public class TypeOfCustomerActivity extends ActionBarActivity {

    Button indiviualCustomerButton;
    Button businessCustomerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_customer);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF3497DA")));
        getSupportActionBar().setTitle("List Your Item");

        Card citySelectCard = new Card(getApplicationContext(), R.layout.list_item_for_rent_home);
        CardView cardView = (CardView)findViewById(R.id.typeOfCustomerCard);
        cardView.setCard(citySelectCard);

        indiviualCustomerButton = (Button)findViewById(R.id.indiviualCustomerButton);
        businessCustomerButton = (Button)findViewById(R.id.businessCustomerButton);

        indiviualCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(showLogin);
            }
        });

        businessCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent businessActivity = new Intent(getApplicationContext(), BusinessRegistrationActivity.class);
                startActivity(businessActivity);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_type_of_customer, menu);
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
