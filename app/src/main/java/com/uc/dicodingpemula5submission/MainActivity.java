package com.uc.dicodingpemula5submission;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uc.dicodingpemula5submission.adapter.ListAnggotaAdapter;
import com.uc.dicodingpemula5submission.adapter.OnItemClickCallback;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_anggota;
    private ArrayList<Anggota> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_anggota = findViewById(R.id.rv_anggota);
        rv_anggota.setHasFixedSize(true);

        list.addAll(DataAnggota.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rv_anggota.setLayoutManager(new LinearLayoutManager(this));
        ListAnggotaAdapter listMakananAdapter = new ListAnggotaAdapter(list);
        rv_anggota.setAdapter(listMakananAdapter);

        listMakananAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Anggota anggota) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailAnggota.class);
                moveIntent1.putExtra(DetailAnggota.ITEM_EXTRA, anggota);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
