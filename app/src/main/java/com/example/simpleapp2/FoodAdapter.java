package com.example.simpleapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class FoodAdapter extends BaseAdapter {

    Context context;
    String[] foodTitles;
    String[] foodDescriptions;

    public FoodAdapter(Context context, String[] foodTitles, String[] foodDescriptions) {
        this.context = context;
        this.foodTitles = foodTitles;
        this.foodDescriptions = foodDescriptions;
    }

    @Override
    public int getCount() {
        return foodTitles.length;
    }

    @Override
    public Object getItem(int position) {
        return foodTitles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.food_item, parent, false);
        }

        TextView title = convertView.findViewById(R.id.foodTitle);
        TextView description = convertView.findViewById(R.id.foodDescription);

        title.setText(foodTitles[position]);
        description.setText(foodDescriptions[position]);

        return convertView;
    }
}
