package com.mohamedfoad.customarrayadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.resource;

/**
 * Created by PC-SMART on 12/8/2017.
 */

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_list, parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.tvName);

        TextView tvHome =  convertView.findViewById(R.id.tvHome);

        tvName.setText(user.name);
        tvHome.setText(user.homeTown);


        return  convertView;
    }
}
