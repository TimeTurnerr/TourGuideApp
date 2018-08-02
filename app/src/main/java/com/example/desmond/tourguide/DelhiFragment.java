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
public class DelhiFragment extends Fragment {
    public DelhiFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        rootView.getRootView().setBackgroundColor(Color.WHITE);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.Delhi_Place1), getResources().getString(R.string.Delhi_Place1Location),getResources().getString(R.string.Delhi_Place1Description), R.drawable.red_fort));
        places.add(new Places(getResources().getString(R.string.Delhi_Place2), getResources().getString(R.string.Delhi_Place2Location),getResources().getString(R.string.Delhi_Place2Description), R.drawable.qutub_minar));
        places.add(new Places(getResources().getString(R.string.Delhi_Place3), getResources().getString(R.string.Delhi_Place3Location),getResources().getString(R.string.Delhi_Place3Description), R.drawable.india_gate));
        places.add(new Places(getResources().getString(R.string.Delhi_Place4), getResources().getString(R.string.Delhi_Place4Location),getResources().getString(R.string.Delhi_Place4Description), R.drawable.jamamasjid));
        places.add(new Places(getResources().getString(R.string.Delhi_Place5), getResources().getString(R.string.Delhi_Place5Location),getResources().getString(R.string.Delhi_Place5Description), R.drawable.humayun_tomb));
        places.add(new Places(getResources().getString(R.string.Delhi_Place6), getResources().getString(R.string.Delhi_Place6Location),getResources().getString(R.string.Delhi_Place6Description), R.drawable.lotus_temple));
        places.add(new Places(getResources().getString(R.string.Delhi_Place7), getResources().getString(R.string.Delhi_Place7Location),getResources().getString(R.string.Delhi_Place7Description), R.drawable.akshardham));
        places.add(new Places(getResources().getString(R.string.Delhi_Place8), getResources().getString(R.string.Delhi_Place8Location),getResources().getString(R.string.Delhi_Place8Description), R.drawable.purana_qila));
        places.add(new Places(getResources().getString(R.string.Delhi_Place9), getResources().getString(R.string.Delhi_Place9Location),getResources().getString(R.string.Delhi_Place9Description), R.drawable.jantar_mantar));
        places.add(new Places(getResources().getString(R.string.Delhi_Place10),getResources().getString(R.string.Delhi_Place10Location),getResources().getString(R.string.Delhi_Place10Description), R.drawable.lakshmi_narayan_temple));
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
