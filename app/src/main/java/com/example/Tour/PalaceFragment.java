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

public class PalaceFragment extends Fragment {

    public PalaceFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getResources().getString(R.string.aamerfort), getResources().getString(R.string.aamerfortDetail),R.drawable.place_aamerfort));
        arrayList.add(new Data(getResources().getString(R.string.agrafort), getResources().getString(R.string.agrafortDetail),R.drawable.place_agrafort));
        arrayList.add(new Data(getResources().getString(R.string.elloracaves), getResources().getString(R.string.elloracavesDetail),R.drawable.place_elloracaves));
        arrayList.add(new Data(getResources().getString(R.string.gatwayofindia), getResources().getString(R.string.gatwayofindiaDetail),R.drawable.place_gatwayofndia));
        arrayList.add(new Data(getResources().getString(R.string.indiagate), getResources().getString(R.string.indiagateDetail),R.drawable.place_goldentemple));


        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;


    }


}
