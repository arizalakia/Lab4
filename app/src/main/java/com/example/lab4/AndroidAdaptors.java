package com.example.lab4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AndroidAdaptors extends ArrayAdapter<Android> {
    Context mContext;
    int mResource;


    public AndroidAdaptors(@NonNull Context context, int resource, @NonNull List<Android> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int image = getItem(position).getLogo();
        String androidName = getItem(position).getAndroidNames();
        String androidVersion = getItem(position).getAndroidVersion();
        String androidApi = getItem(position).getAndroidAPI();
        String releaseDate = getItem(position).getReleaseDates();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = convertView.findViewById(R.id.textView);
        TextView tvVersion = convertView.findViewById(R.id.textView2);
        TextView tvAPI = convertView.findViewById(R.id.textView3);
        TextView tvReleaseDate = convertView.findViewById(R.id.textView4);
        ImageView ivLogo = convertView.findViewById(R.id.imageView);

        ivLogo.setImageResource(image);
        tvName.setText(androidName);
        tvAPI.setText(androidApi);
        tvVersion.setText(androidVersion);
        tvReleaseDate.setText(releaseDate);

        return convertView;
    }
}
