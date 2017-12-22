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

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create an array list of places.
        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.string.eat_name_lamei_hot_pot, R.string.eat_sd_lamei_hot_pot, R.string.eat_web_lamei_hot_pot, R.drawable.lamei_hotpot));
        places.add(new Place(R.string.eat_name_mr_lin, R.string.eat_sd_mr_lin, R.string.eat_web_mr_lin, R.drawable.mr_lin));
        places.add(new Place(R.string.eat_name_the_old_house, R.string.eat_sd_the_old_house, R.string.eat_web_the_old_house, R.drawable.the_old_house));
        places.add(new Place(R.string.eat_name_grelha_do_carmo, R.string.eat_sd_grelha_do_carmo, R.string.eat_web_grelha_do_carmo, R.drawable.grelha_do_carmo));
        places.add(new Place(R.string.eat_name_time_out_market_lisboa, R.string.eat_sd_time_out_market_lisboa, R.string.eat_web_time_out_market_lisboa, R.drawable.time_out_market));
        places.add(new Place(R.string.eat_name_marisqueira_azul, R.string.eat_sd_marisqueira_azul, R.string.eat_web_marisqueira_azul, R.drawable.marisqueira_azul));
        places.add(new Place(R.string.eat_name_portugalia_almirante_reis, R.string.eat_sd_portugalia_almirante_reis, R.string.eat_web_portugalia_almirante_reis, R.drawable.portugalia_almirante_reis));

        /**
         * Create a PlaceAdapter, whose data source is a list of Places.
         * The adapter knows how to create list items for each item in the list.
         */
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        /**
         * Find the ListView object in the view hierarchy of the Activity.
         * There is a ListView with the view ID called list, which is declared in word_list xml layout file.
         */
        ListView listView = rootView.findViewById(R.id.list);

        /**
         * Make the ListView use the PlaceAdapter so that the ListView will display list items for each place in the list.
         */
        listView.setAdapter(adapter);

        return rootView;
    }
}
