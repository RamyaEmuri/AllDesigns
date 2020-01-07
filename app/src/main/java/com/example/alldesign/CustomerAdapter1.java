package com.example.alldesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CustomerAdapter1 extends RecyclerView.Adapter<CustomerAdapter1.MyViewHolder> {

    Context context;
    private ArrayList<Data1> dataset2;
    CustomerAdapter1(ArrayList<Data1> dataset2){
        this.dataset2 = dataset2;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Data1 objData1 = dataset2.get(position);
        holder.imageView.setImageDrawable(holder.imageView.getContext().getResources().getDrawable(objData1.image));
        holder.Title.setText(objData1.title);
        holder.Description.setText(objData1.description);

        Glide.with(holder.imageView.getContext())
                .load(objData1.image)
                .apply(RequestOptions.circleCropTransform())
                .into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return dataset2.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView Title;
        TextView Description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView14);
            Title = itemView.findViewById(R.id.textView27);
            Description = itemView.findViewById(R.id.textView28);
        }
    }
}
