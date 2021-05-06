package com.uc.dicodingpemula5submission.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.uc.dicodingpemula5submission.Anggota;
import com.uc.dicodingpemula5submission.R;

import java.util.ArrayList;

public class ListAnggotaAdapter extends RecyclerView.Adapter<ListAnggotaAdapter.ListViewHolder> {
    private final ArrayList<Anggota> listAnggota;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListAnggotaAdapter(ArrayList<Anggota> list) {
        this.listAnggota = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_anggota, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder listViewHolder, int i) {
        final Anggota anggota = listAnggota.get(i);

        Glide.with(listViewHolder.itemView.getContext())
                .load(anggota.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);

        listViewHolder.tvName.setText(anggota.getNama());
        listViewHolder.tvDetail.setText(anggota.getDetail());

        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(anggota);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAnggota.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}

