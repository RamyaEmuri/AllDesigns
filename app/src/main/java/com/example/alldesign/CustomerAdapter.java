package com.example.alldesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.MyViewHolder> {

    Context context;
    private ArrayList<Data> dataset1;
    CustomerAdapter(ArrayList<Data> dataset1){
        this.dataset1 = dataset1;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Data objData = dataset1.get(position);
        holder.barimage.setImageDrawable(holder.barimage.getContext().getResources().getDrawable(objData.barImage));
        holder.imageView.setImageDrawable(holder.imageView.getContext().getResources().getDrawable(objData.image));
        holder.place.setText(objData.place);
        if(position == 0){
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) holder.cardview.getLayoutParams();
            params.setMargins(80, 0,0, 0);
            holder.cardview.setLayoutParams(params);
        }

    }

    @Override
    public int getItemCount() {
        return dataset1.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView barimage;
        ImageView imageView;
        TextView place;
        CardView cardview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            barimage = itemView.findViewById(R.id.barImage);
            imageView = itemView.findViewById(R.id.imageView10);
            place = itemView.findViewById(R.id.textView25);
            cardview = itemView.findViewById(R.id.cardView);

        }
    }
}
