package com.example.alldesign;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;


public class MapScreen extends AppCompatActivity {

    ArrayList<Data> dataset1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_screen);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_1);

        dataset1 = new ArrayList<>();
        dataset1.add(new Data(R.drawable.bargreenicon, R.drawable.nature3,"Louisiana"));
        dataset1.add(new Data(R.drawable.barvioleticon, R.drawable.nature2, "Leh LAadak"));
        dataset1.add(new Data(R.drawable.baricon, R.drawable.nature, "Jammu Kashmir"));
        dataset1.add(new Data(R.drawable.bargreenicon, R.drawable.nature1, "Mountain View"));
        dataset1.add(new Data(R.drawable.barvioleticon, R.drawable.nature4, "Nagpur"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MapScreen.this, LinearLayoutManager.HORIZONTAL, false);
        CustomerAdapter objAdapter = new CustomerAdapter(dataset1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(objAdapter);


        ImageView imageView = findViewById(R.id.imageView9);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapScreen.this, Third_Activity.class);
                startActivity(intent);
            }
        });
    }
}