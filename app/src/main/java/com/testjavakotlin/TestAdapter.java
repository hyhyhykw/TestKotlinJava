package com.testjavakotlin;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import androidx.annotation.NonNull;

/**
 * Created time : 2022/8/11 15:35.
 *
 * @author 10585
 */
public class TestAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public TestAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder holder, String str) {
        int adapterPosition = holder.getAdapterPosition();
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
    }
}