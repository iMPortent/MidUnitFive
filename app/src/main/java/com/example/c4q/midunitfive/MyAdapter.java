package com.example.c4q.midunitfive;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by C4Q on 1/24/2018.
 */

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public MyViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }

        public void bind(){

        }
    }
}
