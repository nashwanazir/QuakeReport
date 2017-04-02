package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asus on 4/2/2017.
 */

public class EarthQuakeAdapter extends ArrayAdapter<Earthquake>{

    public EarthQuakeAdapter(@NonNull Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView=convertView;
        if(listitemView==null)
        {
            listitemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        Earthquake currentEarthQuake=getItem(position);

        TextView mag= (TextView) listitemView.findViewById(R.id.mag);
        mag.setText(currentEarthQuake.getMag());

        TextView loc= (TextView) listitemView.findViewById(R.id.loc);
        loc.setText(currentEarthQuake.getLoc());

        TextView date= (TextView) listitemView.findViewById(R.id.date);
        date.setText(currentEarthQuake.getDate());

        return listitemView;
    }
}
