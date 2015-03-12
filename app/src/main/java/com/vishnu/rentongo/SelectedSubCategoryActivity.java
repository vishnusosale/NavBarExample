package com.vishnu.rentongo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.etsy.android.grid.StaggeredGridView;
import com.vishnu.rentongo.adapter.SubCategoryAdapter;

import java.util.ArrayList;


public class SelectedSubCategoryActivity extends ActionBarActivity {

    String cardTitle;
    StaggeredGridView mGridView;
    SubCategoryAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_sub_category);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            cardTitle = extras.getString("clickedCard");
        }
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF3497DA")));
        actionBar.setTitle(cardTitle);

        mGridView = (StaggeredGridView) findViewById(R.id.grid_view);



        mAdapter = new SubCategoryAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, getImages());
        mGridView.setAdapter(mAdapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
               /* Intent showFullImage = new Intent(VisionBoardActivity.this, VisionBoardFullImage.class);
                //mAdapter.getItem(position);
                showFullImage.putExtra("clickedImageUrl", mAdapter.getItem(position));
                startActivity(showFullImage);*/

                //Toast.makeText(getApplicationContext(), "Item Clicked: " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
    private ArrayList<String> getImages()
    {
        ArrayList<String> listData = new ArrayList<>();
        listData.add("http://i62.tinypic.com/2iitkhx.jpg");
        listData.add("http://i61.tinypic.com/w0omeb.jpg");
        listData.add("http://i60.tinypic.com/w9iu1d.jpg");
        listData.add("http://i60.tinypic.com/iw6kh2.jpg");
        listData.add("http://i57.tinypic.com/ru08c8.jpg");
        listData.add("http://i60.tinypic.com/k12r10.jpg");
        listData.add("http://i58.tinypic.com/2e3daug.jpg");
        listData.add("http://i59.tinypic.com/2igznfr.jpg");
        return listData;
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_selected_sub_category, menu);
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
