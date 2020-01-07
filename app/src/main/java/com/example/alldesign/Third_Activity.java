package com.example.alldesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class Third_Activity extends AppCompatActivity  {

    ArrayList<Data1> dataset2;
    private BottomSheetDialog bottomSheetDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_2);

        dataset2 = new ArrayList<>();

        dataset2.add(new Data1(R.drawable.person3, "Just Awesome","I have purchased a levis jeans yesterday.\nJeans quality is very nice. I have got...."));
        dataset2.add(new Data1(R.drawable.person41, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));
        dataset2.add(new Data1(R.drawable.person21, "Just Awesome","I have purchased a levis jeans yesterday.\nJeans quality is very nice. I have got...."));
        dataset2.add(new Data1(R.drawable.person5, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));

        dataset2.add(new Data1(R.drawable.person2, "Just Awesome","I have purchased a levis jeans yesterday.\nJeans quality is very nice. I have got...."));
        dataset2.add(new Data1(R.drawable.person3, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));
        dataset2.add(new Data1(R.drawable.person3, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));
        dataset2.add(new Data1(R.drawable.person3, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));
        dataset2.add(new Data1(R.drawable.person3, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));
        dataset2.add(new Data1(R.drawable.person3, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));
        dataset2.add(new Data1(R.drawable.person3, "Good quality product!","Good quality material, Much comfort\nHigh durability. No fading.What more..."));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        CustomerAdapter1 objAdapter1 = new CustomerAdapter1(dataset2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(objAdapter1);




        bottomSheetDialog = new BottomSheetDialog(Third_Activity.this);
        View bottomSheetDialogView = getLayoutInflater().inflate(R.layout.bottom_sheet, null);
        bottomSheetDialog.setContentView(bottomSheetDialogView);

        Button button = findViewById(R.id.button_review);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();

                switch (id){
                    case R.id.button_review:
                    bottomSheetDialog.show();
                    break;
                }
            }
        });

    }

}
