package com.example.desmond.tourguide;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import java.util.ArrayList;
public class AgraFragment extends Fragment {
    public AgraFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        rootView.getRootView().setBackgroundColor(Color.WHITE);
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(getResources().getString(R.string.Agra_Place1), getResources().getString(R.string.Agra_Place1Location),getResources().getString(R.string.Agra_Place1Description), R.drawable.taj_mahal));
        places.add(new Places(getResources().getString(R.string.Agra_Place2), getResources().getString(R.string.Agra_Place2Location),getResources().getString(R.string.Agra_Place2Description), R.drawable.agra_fort));
        places.add(new Places(getResources().getString(R.string.Agra_Place3), getResources().getString(R.string.Agra_Place3Location),getResources().getString(R.string.Agra_Place3Description), R.drawable.tomb_of_itimad_ud_daulah));
        places.add(new Places(getResources().getString(R.string.Agra_Place4), getResources().getString(R.string.Agra_Place4Location),getResources().getString(R.string.Agra_Place4Description), R.drawable.akbar_tomb));
        places.add(new Places(getResources().getString(R.string.Agra_Place5), getResources().getString(R.string.Agra_Place5Location),getResources().getString(R.string.Agra_Place5Description), R.drawable.mehtab_bagh));
        places.add(new Places(getResources().getString(R.string.Agra_Place6), getResources().getString(R.string.Agra_Place6Location),getResources().getString(R.string.Agra_Place6Description), R.drawable.moti_masjid));
        places.add(new Places(getResources().getString(R.string.Agra_Place7), getResources().getString(R.string.Agra_Place7Location),getResources().getString(R.string.Agra_Place7Description), R.drawable.jama_masjid));
        places.add(new Places(getResources().getString(R.string.Agra_Place8), getResources().getString(R.string.Agra_Place8Location),getResources().getString(R.string.Agra_Place8Description), R.drawable.tomb_of_mariam_uz_zamani));
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
