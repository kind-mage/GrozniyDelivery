package com.example.xava.grozniydelivery.products;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.xava.grozniydelivery.ImageAdapter;
import com.example.xava.grozniydelivery.ImageItem;
import com.example.xava.grozniydelivery.R;

import java.util.ArrayList;

public class Products extends AppCompatActivity {
ListView lvProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        int[] imageList = new int[]{R.drawable.ic_restuarants,R.drawable.ic_japan_eating,R.drawable.ic_shashlik,
        R.drawable.ic_burgers,R.drawable.ic_pizza,R.drawable.ic_torts,R.drawable.ic_vegetables};

        lvProducts = (ListView)findViewById(R.id.lvProducts);
        ArrayList<ImageItem> items = new ArrayList<ImageItem>();
        ImageAdapter adapter = new ImageAdapter(this,items);
        lvProducts.setAdapter(adapter);

        for (int i = 0; i< imageList.length; i++){

            ImageItem newImage = new ImageItem(imageList[i]);
            adapter.add(newImage);
        }



    }
}
