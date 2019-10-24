package com.example.lab4;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String[] androidNames, androidVersion, androidAPI, releaseDates;
    ListView lists;
    int[] androidLogo = {R.drawable.android_cupcake, R.drawable.android_donut, R.drawable.android_eclair, R.drawable.android_froyo, R.drawable.android_gingerbread,};
    ArrayList<Android> androidList = new ArrayList<>();
    String[] versionInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidNames = getResources().getStringArray(R.array.androidName);
        androidVersion = getResources().getStringArray(R.array.androidVersion);
        androidAPI = getResources().getStringArray(R.array.apiLevel);
        releaseDates = getResources().getStringArray(R.array.releaseDate);
        versionInfo = getResources().getStringArray(R.array.androidInformation);

        for(int i=0; i < androidNames.length; i++){
            androidList.add(new Android(androidLogo[i], androidNames[i], "Ver. " + androidVersion[i], "API Level " + androidAPI[i], "Released " + releaseDates[i]));
        }

        lists = findViewById(R.id.listView);

        ArrayAdapter androidArrayAdapter = new AndroidAdaptors(this, R.layout.item, androidList);

        lists.setAdapter(androidArrayAdapter);
        lists.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        final AlertDialog.Builder myDialog = new AlertDialog.Builder(this);
        myDialog.setTitle(androidList.get(position).getAndroidNames());
        myDialog.setIcon(androidList.get(position).getLogo());
        myDialog.setMessage(versionInfo[position]);
        myDialog.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        myDialog.create().show();
    }
}
