package com.hassantijani.pantha.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hassantijani.pantha.R;
import com.hassantijani.pantha.models.Slider;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    private List<Slider> sliderList;

    public SliderAdapter(List<Slider> sliderList) {
        this.sliderList = sliderList;
    }

    @NonNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider,parent,false);
        SliderViewHolder sliderViewHolder = new SliderViewHolder(view);
        return sliderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SliderViewHolder holder, int position) {
        holder.sliderText.setText(sliderList.get(position).getTitle());
        holder.sliderImg.setImageResource(sliderList.get(position).getSliderImg());
    }

    @Override
    public int getItemCount() {
        return sliderList.size();
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder{
        ImageView sliderImg;
        TextView sliderText;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            sliderImg = itemView.findViewById(R.id.slider_img);
            sliderText = itemView.findViewById(R.id.slider_text);
        }
    }
}
