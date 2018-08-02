package com.example.desmond.tourguide;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class DetailsActivity extends AppCompatActivity {
    TextView placeName,placeLocation,placeDescription;
    ImageView placeImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);
        placeName = (TextView) findViewById(R.id.placenmae);
        placeLocation = (TextView) findViewById(R.id.placelocation);
        placeImage = (ImageView) findViewById(R.id.placeimage);
        placeDescription = (TextView) findViewById(R.id.placedescription);
        Bundle bundle = getIntent().getExtras();
        String placename = bundle.getString("Name");
        String placelocation = bundle.getString("Location");
        String placedescription = bundle.getString("Description");
        int imgid = bundle.getInt("Image");
        placeName.setText(placename);
        placeLocation.setText(placelocation);
        placeImage.setImageResource(imgid);
        placeDescription.setText(placedescription);
    }
}