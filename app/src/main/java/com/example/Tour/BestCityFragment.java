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

public class BestCityFragment extends Fragment {

    public BestCityFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);
        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getResources().getString(R.string.best_city_1), getResources().getString(R.string.best_city_1_detail),R.drawable.rajasthan));
        arrayList.add(new Data(getResources().getString(R.string.best_city_2), getResources().getString(R.string.best_city_2_detail),R.drawable.mumbai));
        arrayList.add(new Data(getResources().getString(R.string.best_city_3), getResources().getString(R.string.best_city_3_detail),R.drawable.chennai));
        arrayList.add(new Data(getResources().getString(R.string.best_city_4), getResources().getString(R.string.best_city_4_detail),R.drawable.hyderabad));
        arrayList.add(new Data(getResources().getString(R.string.best_city_5), getResources().getString(R.string.best_city_5_detail),R.drawable.bengaluru));

        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);
        ListView listView = rootView.findViewById(R.id.listViewId);
        listView.setAdapter(dataAdapter);

        return rootView;


    }


}
