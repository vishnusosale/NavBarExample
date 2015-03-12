package com.vishnu.rentongo.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.vishnu.rentongo.LoginActivity;
import com.vishnu.rentongo.R;
import com.vishnu.rentongo.RegisterActivity;
import com.vishnu.rentongo.TypeOfCustomerActivity;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.view.CardView;

public class HomeFragment extends Fragment {

    private RadioButton bangaloreRadioButton;
    private RadioButton delhiNCRRadioButton;
    private RadioButton hyderabadRadioButton;
    private RadioButton mumbaiRadioButton;
    private RadioButton puneRadioButton;
    private Button login, register, listForRentButton;

	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);


        Card citySelectCard = new Card(getActivity(), R.layout.select_city);
        CardView cardView = (CardView)rootView.findViewById(R.id.citySelectCard);
        cardView.setCard(citySelectCard);

        bangaloreRadioButton = (RadioButton)rootView.findViewById(R.id.bangaloreRadioButton);
        delhiNCRRadioButton = (RadioButton)rootView.findViewById(R.id.delhiNCRRadioButton);
        hyderabadRadioButton = (RadioButton)rootView.findViewById(R.id.hyderabadRadioButton);
        mumbaiRadioButton = (RadioButton)rootView.findViewById(R.id.mumbaiRadioButton);
        puneRadioButton = (RadioButton)rootView.findViewById(R.id.puneRadioButton);

        login = (Button)rootView.findViewById(R.id.loginButton);
        register = (Button)rootView.findViewById(R.id.registerButton);
        listForRentButton = (Button)rootView.findViewById(R.id.listForRentButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent loginIntent = new Intent(getActivity(), LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

        listForRentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent typeOfCustomerActivity = new Intent(getActivity(), TypeOfCustomerActivity.class);
                startActivity(typeOfCustomerActivity);

            }
        });

        bangaloreRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), bangaloreRadioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        delhiNCRRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), delhiNCRRadioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        hyderabadRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), hyderabadRadioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        mumbaiRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), mumbaiRadioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        puneRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), puneRadioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }


}
