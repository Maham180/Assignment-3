package com.example.login;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewAdapter extends BaseAdapter {
    ArrayList<SingleRow> list;
    Context context;
    ViewAdapter(Context c)
    {
        context=c;
        list=new ArrayList<SingleRow>();
        Resources res=c.getResources();
        String[] Contacts=res.getStringArray(R.array.Contacts);
        int[] image={R.drawable.stay, R.drawable.f, R.drawable.girl, R.drawable.flow, R.drawable.see, R.drawable.h2, R.drawable.lap, R.drawable.gul};
        for(int i=0;i<8;i++)
        {
            list.add(new SingleRow(Contacts[i], image[i]));
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.single_row, parent, false);
        TextView Contacts=(TextView) row.findViewById(R.id.textView);
        ImageView image=(ImageView) row.findViewById(R.id.imageView);

        SingleRow temp=list.get(i);
        Contacts.setText(temp.Contacts);
        image.setImageResource(temp.image);


        return row;
    }
}
