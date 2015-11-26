package com.example.xava.grozniydelivery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Xava on 25.11.2015.
 */
public class ImageAdapter extends ArrayAdapter<ImageItem> {

public  static  class ViewHolder{
        ImageView image;
    }

public ImageAdapter(Context context,ArrayList<ImageItem> items){
    super(context,R.layout.eat_items,items);
}


    public View getView(int position,View convertView,ViewGroup parent){
    ImageItem imageItem = getItem(position);
        ViewHolder viewHolder;

      if (convertView == null){
          viewHolder = new ViewHolder();
          convertView = LayoutInflater.from(getContext()).inflate(R.layout.eat_items,parent,false);
          viewHolder.image = (ImageView)convertView.findViewById(R.id.imageView);
          convertView.setTag(viewHolder);
      }else {
          viewHolder =(ViewHolder)convertView.getTag();
      }
viewHolder.image.setImageResource(imageItem.image);
return convertView;
    }

}
