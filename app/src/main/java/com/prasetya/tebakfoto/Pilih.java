package com.prasetya.tebakfoto;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Pilih extends AppCompatActivity {
    ImageView imgV_luffy, imgV_naruto, imgV_boruto, imgV_tanjiro, imgV_saitama,
            imgV_marin, imgV_asuna, imgV_raphtalia, imgV_anya, imgV_nezuko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih);

        setIns();
        onClk();
    }
    private void onClk(){
        imgV_luffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Pilih.this, Tebak.class);
                a.putExtra("nama_icon","luffy");
                startActivity(a);
            }
        });

        imgV_naruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(Pilih.this, Tebak.class);
                b.putExtra("nama_icon","naruto");
                startActivity(b);
            }
        });
        imgV_boruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(Pilih.this, Tebak.class);
                c.putExtra("nama_icon","boruto");
                startActivity(c);
            }
        });
        imgV_tanjiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(Pilih.this, Tebak.class);
                d.putExtra("nama_icon","tanjiro");
                startActivity(d);
            }
        });
        imgV_saitama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Pilih.this, Tebak.class);
                e.putExtra("nama_icon","saitama");
                startActivity(e);
            }
        });
        imgV_marin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(Pilih.this, Tebak.class);
                f.putExtra("nama_icon","marin");
                startActivity(f);
            }
        });
        imgV_asuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(Pilih.this, Tebak.class);
                g.putExtra("nama_icon","asuna");
                startActivity(g);
            }
        });
        imgV_raphtalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(Pilih.this, Tebak.class);
                h.putExtra("nama_icon","raphtalia");
                startActivity(h);
            }
        });
        imgV_anya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pilih.this, Tebak.class);
                i.putExtra("nama_icon","anya");
                startActivity(i);
            }
        });
        imgV_nezuko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(Pilih.this, Tebak.class);
                j.putExtra("nama_icon","nezuko");
                startActivity(j);
            }
        });
    }
    private void setIns(){
        imgV_luffy= findViewById(R.id.imageView_luffy);
        imgV_naruto= findViewById(R.id.imageView_naruto);
        imgV_boruto= findViewById(R.id.imageView_boruto);
        imgV_tanjiro= findViewById(R.id.imageView_tanjiro);
        imgV_saitama= findViewById(R.id.imageView_saitama);
        imgV_marin= findViewById(R.id.imageView_marin);
        imgV_asuna= findViewById(R.id.imageView_asuna);
        imgV_raphtalia= findViewById(R.id.imageView_raphtalia);
        imgV_anya= findViewById(R.id.imageView_anya);
        imgV_nezuko= findViewById(R.id.imageView_nezuko);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.prof) {
            startActivity(new Intent(Pilih.this, Profile.class));
            finish();
            return true;
        }
        if (id == R.id.exit) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
