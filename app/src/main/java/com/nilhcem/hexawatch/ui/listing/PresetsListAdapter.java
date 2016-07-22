package com.nilhcem.hexawatch.ui.listing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nilhcem.hexawatch.R;
import com.nilhcem.hexawatch.common.core.ColorPreset;

public class PresetsListAdapter extends RecyclerView.Adapter<PresetsListViewHolder> {

    @Override
    public PresetsListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PresetsListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.presets_list_entry, parent, false));
    }

    @Override
    public void onBindViewHolder(PresetsListViewHolder holder, int position) {
        holder.bindData(ColorPreset.values()[position]);
    }

    @Override
    public int getItemCount() {
        return ColorPreset.values().length;
    }
}