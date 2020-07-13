package com.example.Tour;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class TempleFragment extends Fragment {

    public TempleFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getResources().getString(R.string.Temple_1), getResources().getString(R.string.Temple_1_Detail),R.drawable.temple_badrinath));
        arrayList.add(new Data(getResources().getString(R.string.Temple_2), getResources().getString(R.string.Temple_2_Detail),R.drawable.temple_dilwara));
        arrayList.add(new Data(getResources().getString(R.string.Temple_3), getResources().getString(R.string.Temple_3_Detail),R.drawable.temple_golden));
        arrayList.add(new Data(getResources().getString(R.string.Temple_4), getResources().getString(R.string.Temple_4_Detail),R.drawable.temple_govind_dev));
        arrayList.add(new Data(getResources().getString(R.string.Temple_5), getResources().getString(R.string.Temple_5_Detail),R.drawable.temple_jagannath));

        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;


    }


}

