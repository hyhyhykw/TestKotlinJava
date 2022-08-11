package com.testjavakotlin;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created time : 2022/8/11 15:58.
 *
 * @author 10585
 */
public class TestAdapter2 extends RecyclerView.Adapter {

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        View itemView = holder.itemView;
        int adapterPosition = holder.getAdapterPosition();
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}