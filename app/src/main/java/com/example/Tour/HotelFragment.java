package com.example.Tour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HotelFragment extends Fragment {

    public HotelFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getResources().getString(R.string.Hotel_1), getResources().getString(R.string.Hotel_detail_1),R.drawable.hotel_bengaluru_marriott_hotel));
        arrayList.add(new Data(getResources().getString(R.string.Hotel_2), getResources().getString(R.string.Hotel_detail_2),R.drawable.hotel_sofitel_mumbai_bkc));
        arrayList.add(new Data(getResources().getString(R.string.Hotel_3), getResources().getString(R.string.Hotel_detail_3),R.drawable.hotel_suryagarh_jaisalmer));
        arrayList.add(new Data(getResources().getString(R.string.Hotel_4), getResources().getString(R.string.Hotel_detail_4),R.drawable.hotel_the_leaf_munnar_chithirapuram));
        arrayList.add(new Data(getResources().getString(R.string.Hotel_5), getResources().getString(R.string.Hotel_detail_5),R.drawable.hotel_the_leela_palace_udaipur));


        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;


    }
}
