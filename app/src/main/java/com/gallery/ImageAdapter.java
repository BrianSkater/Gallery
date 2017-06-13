package com.gallery;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by uerk on 05/18/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public Integer[] images = {
            R.drawable.pic01, R.drawable.pic02,
            R.drawable.pic03, R.drawable.pic04,
            R.drawable.pic05, R.drawable.pic06,
            R.drawable.pic07, R.drawable.pic08,
            R.drawable.pic09, R.drawable.pic10,
            R.drawable.pic11, R.drawable.pic12,
            R.drawable.pic13, R.drawable.pic14,
            R.drawable.pic15, R.drawable.pic16
    };

    public  ImageAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}
