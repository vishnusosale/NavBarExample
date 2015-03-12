package com.vishnu.rentongo.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vishnu.rentongo.R;
import com.vishnu.rentongo.SelectedSubCategoryActivity;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardGridArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.view.CardGridView;

public class BikesAndScootersFragment extends Fragment {

    private CardGridArrayAdapter mCardArrayAdapter;
	public BikesAndScootersFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_electronics_and_appliances, container, false);

        ArrayList<Card> cards = new ArrayList<>();
        String[] subCategories = {
                "Bicycles","Motor-Cycles", "Scooters", "Freezers", "Lockers", "Kitchen Appliances",
                "Portable Fans", "Geysers", "Television", "Vacuum Cleaners", "Washing Machine and Dryers"
        };

        for (int i = 0; i < subCategories.length; i++) {
            // Create a Card

            Card card = new Card(getActivity());

            // Create a CardHeader
            //CardHeader header = new CardHeader(getActivity());

            // Add Header to card
            // header.setTitle(subCategories[i]);

            card.setTitle(subCategories[i]);

            //card.addCardHeader(header);

            CardThumbnail thumb = new CardThumbnail(getActivity());
            thumb.setDrawableResource(R.mipmap.ic_launcher);
            card.addCardThumbnail(thumb);

            cards.add(card);

            card.setOnClickListener(new Card.OnCardClickListener() {
                @Override
                public void onClick(Card card, View view) {

                    Intent intent = new Intent(getActivity(), SelectedSubCategoryActivity.class);
                    intent.putExtra("clickedCard", card.getTitle());
                    startActivity(intent);

                }
            });
        }

        mCardArrayAdapter = new CardGridArrayAdapter(getActivity(), cards);

        CardGridView gridView = (CardGridView) rootView.findViewById(R.id.myGrid);
        if (gridView != null) {
            gridView.setAdapter(mCardArrayAdapter);
        }

        return rootView;
    }
}
