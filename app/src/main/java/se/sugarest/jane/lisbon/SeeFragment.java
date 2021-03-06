package se.sugarest.jane.lisbon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jane on 17-12-21.
 */

public class SeeFragment extends Fragment {

    public SeeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.string.see_name_praca_do_comercio, R.string.see_sd_praca_do_comercio, R.string.see_web_praca_do_comercio, R.drawable.praca_do_comercio));
        places.add(new Place(R.string.see_name_universidade_de_coimbra, R.string.see_sd_universidade_de_coimbra, R.string.see_web_universidade_de_coimbra, R.drawable.universidade_de_coimbra));
        places.add(new Place(R.string.see_name_biblioteca_joanina, R.string.see_sd_biblioteca_joanina, R.string.see_web_biblioteca_joanina, R.drawable.biblioteca_joanina));
        places.add(new Place(R.string.see_name_livraria_lello, R.string.see_sd_livraria_lello, R.string.see_web_livraria_lello, R.drawable.livraria_lello));

        /**
         * Create a PlaceAdapter, whose data source is a list of Places.
         * The adapter knows how to create list items for each item in the list.
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        /**
         * Find the ListView object in the view hierarchy of the Activity.
         * There is a ListView with the view ID called list, which is declared in word_list xml layout file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**
         * Make the ListView use the PlaceAdapter so that the ListView will display list items for each place in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }
}

