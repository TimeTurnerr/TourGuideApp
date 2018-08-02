package com.example.desmond.tourguide;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public class PlacesAdapter extends ArrayAdapter<Places> {
    public PlacesAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0,places);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Places currentplaces = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.Name);
        name.setText(currentplaces.getmName());
        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentplaces.getmLocation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentplaces.getImageResourceId());
        return listItemView;
    }
}