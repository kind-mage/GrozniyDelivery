package com.example.xava.grozniydelivery.eating;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.xava.grozniydelivery.AllRestuarants;
import com.example.xava.grozniydelivery.ImageAdapter;
import com.example.xava.grozniydelivery.ImageItem;
import com.example.xava.grozniydelivery.Nav_activity;
import com.example.xava.grozniydelivery.R;

import java.util.ArrayList;

public class Eat extends Fragment {
    ListView lvEat;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_eat, container, false);
        int [] imageList = new int[]{R.drawable.ic_restuarants,R.drawable.ic_pizza,
                R.drawable.ic_shashlik,R.drawable.ic_burgers,R.drawable.ic_japan_eating,R.drawable.ic_torts};
        lvEat = (ListView)rootView.findViewById(R.id.lvEat);
        ArrayList<ImageItem> items = new ArrayList<ImageItem>();
        ImageAdapter adapter = new ImageAdapter(rootView.getContext(),items);
        lvEat.setAdapter(adapter);
        for(int i = 0; i< imageList.length; i++) {


            ImageItem newImage = new ImageItem(imageList[i]);
            adapter.add(newImage);

        }

        lvEat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        startActivity(new Intent(view.getContext(), AllRestuarants.class));
                        break;
                }
            }
        });

        return rootView;
    }

 /*   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.app_bar_nav_activity);
       //getLayoutInflater().inflate(R.layout.activity_eat, (ViewGroup) findViewById(R.id.ly_content));
        int [] imageList = new int[]{R.drawable.ic_restuarants,R.drawable.ic_pizza,
                R.drawable.ic_shashlik,R.drawable.ic_burgers,R.drawable.ic_japan_eating,R.drawable.ic_torts};



        lvEat = (ListView)findViewById(R.id.lvEat);
        ArrayList<ImageItem> items = new ArrayList<ImageItem>();
        ImageAdapter adapter = new ImageAdapter(this,items);
        lvEat.setAdapter(adapter);


        for(int i = 0; i< imageList.length; i++){


            ImageItem newImage = new ImageItem(imageList[i]);
            adapter.add(newImage);

        }
        lvEat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        startActivity(new Intent(view.getContext(), AllRestuarants.class));
                        break;
                }
            }
        });

    }**/
}
