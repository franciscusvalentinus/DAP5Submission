package com.uc.dicodingpemula5submission;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailAnggota extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anggota);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvHarga = findViewById(R.id.tv_item_harga);

        Anggota anggota = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (anggota != null) {
            Glide.with(this)
                    .load(anggota.getFoto())
                    .into(imgItemPhoto);
            tvName.setText(anggota.getNama());
            tvDeskripsi.setText(anggota.getDetail());
            tvHarga.setText(anggota.getRole());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Anggota");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
