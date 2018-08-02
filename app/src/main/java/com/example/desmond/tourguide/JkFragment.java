package com.example.desmond.tourguide;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
public class JkFragment extends Fragment {
    public JkFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        rootView.getRootView().setBackgroundColor(Color.WHITE);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.JK_Place1), getResources().getString(R.string.JK_Place1Location),getResources().getString(R.string.JK_Place1Description), R.drawable.number_one));
        places.add(new Places(getResources().getString(R.string.JK_Place2), getResources().getString(R.string.JK_Place2Location),getResources().getString(R.string.JK_Place2Description), R.drawable.number_two));
        places.add(new Places(getResources().getString(R.string.JK_Place3), getResources().getString(R.string.JK_Place3Location),getResources().getString(R.string.JK_Place3Description), R.drawable.number_three));
        places.add(new Places(getResources().getString(R.string.JK_Place4), getResources().getString(R.string.JK_Place4Location),getResources().getString(R.string.JK_Place4Description), R.drawable.number_four));
        places.add(new Places(getResources().getString(R.string.JK_Place5), getResources().getString(R.string.JK_Place5Location),getResources().getString(R.string.JK_Place5Description), R.drawable.number_five));
        places.add(new Places(getResources().getString(R.string.JK_Place6), getResources().getString(R.string.JK_Place6Location),getResources().getString(R.string.JK_Place6Description), R.drawable.number_six));
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Places place = places.get(position);
                String name = place.getmName();
                String location = place.getmLocation();
                int imgid = place.getImageResourceId();
                String description = place.getmdescription();
                Bundle bundle = new Bundle();
                bundle.putInt("Image", imgid);
                bundle.putString("Name", name);
                bundle.putString("Location", location);
                bundle.putString("Description", description);
                Intent detailIntent = new Intent(getActivity(), DetailsActivity.class);
                detailIntent.putExtras(bundle);
                startActivity(detailIntent);
            }
        });
        return rootView;
    }
}
