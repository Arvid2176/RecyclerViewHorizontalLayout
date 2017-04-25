package com.example.recyclerview.util;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;
import com.example.recyclerview.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 安维 on 2017/4/25.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
    private static final String TAG = "FruitAdapter";
    private List<Fruit> fruitList=new ArrayList<>();
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(View view){
            super(view);
            imageView=(ImageView) view.findViewById(R.id.fruit_img);
            textView=(TextView)view.findViewById(R.id.fruit_name);
        }
    }
    public FruitAdapter(List<Fruit> fruitList){
        Log.d(TAG, "FruitAdapter: "+fruitList.toString());
        this.fruitList=fruitList;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        Log.d(TAG, "onCreateViewHolder: "+view.toString());
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
      Fruit fruit=fruitList.get(position);
        holder.imageView.setImageResource(fruit.getImgID());
        Log.d(TAG, "onBindViewHolder: " +fruit.getName()+"  "+fruit.getImgID());
        holder.textView.setText(fruit.getName());
    }
    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    }

