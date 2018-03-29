package com.example.ahmadrezapc.photoframe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class NewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.new_activity);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                Intent i = new Intent(NewActivity.this, FrameView.class);
                Toast.makeText(NewActivity.this, "Position " + position,
                        Toast.LENGTH_SHORT).show();

                i.putExtra("id", position);
                startActivity(i);
        }

    });

}


}