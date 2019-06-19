package lk.ac.kln.googlemap;


import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        Double map1[] = {6.956955, 6.955842};
        Double map2[] = {79.888791, 79.883850};

            for(int i=0; i<2; i++) {
                LatLng fct = new LatLng(map1[i], map2[i]);
                MarkerOptions options = new MarkerOptions().position(fct).title("Faculty of Computing and Technology");
                googleMap.addMarker(options);
                googleMap.moveCamera(CameraUpdateFactory.newLatLng(fct));
                googleMap.setMinZoomPreference(15);
            }
        }
}
