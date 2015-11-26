package com.example.xava.grozniydelivery;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final  String LOG_TAG ="myLogs";
    ListView lvEat;
   // int count[]= new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      int [] imageList = new int[]{R.drawable.ic_restuarants,R.drawable.ic_pizza,
              R.drawable.ic_shashlik,R.drawable.ic_japan_eating,R.drawable.ic_cakes,R.drawable.ic_torts};



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
                switch (i){
                    case 0:
                        startActivity(new Intent(view.getContext(),AllRestuarants.class));
                        break;
                }
            }
        });









    }
}
