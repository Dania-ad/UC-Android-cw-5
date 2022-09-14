package com.example.cw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter{
    //1- Attributes
    ArrayList<Fruits> fruitList = new ArrayList<>();
    Context context;

    public ItemAdapter(ArrayList<Fruits> fruitList, Context context) {
        this.fruitList = fruitList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).textname.setText(fruitList.get(position).getFruitName());
        ((ViewHolder)holder).textprice.setText(fruitList.get(position).getFruitPrice()+ " KD/Kilo");
        ((ViewHolder)holder).img.setImageResource(fruitList.get(position).getFruitImg());

    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView textname,textprice;
        View v; //new

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            img = v.findViewById(R.id.imageView);
            textname = v.findViewById(R.id.textViewName);
            textprice = v.findViewById(R.id.textViewPrice);

        }
    }
}
