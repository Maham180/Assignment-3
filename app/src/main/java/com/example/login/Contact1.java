package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Contact1 extends AppCompatActivity {


    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact1);
        getSupportActionBar().setTitle("Contact List");

        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(new ViewAdapter(this));



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.stay);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Maham");
                    in5.putExtra("name1","+920333595443");
                    in5.putExtra("name2","maham@gmail.com");
                    startActivity(in5);
                }

                else if(position == 1) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.f);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Noor");
                    in5.putExtra("name1","+9203238564543");
                    in5.putExtra("name2","noor@gmail.com");
                    startActivity(in5);
                }

                else if(position == 2) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.girl);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Maryam");
                    in5.putExtra("name1","+920343845938");
                    in5.putExtra("name2","maryam@gmail.com");
                    startActivity(in5);
                }
                else if(position == 3) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.flow);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Mashal");
                    in5.putExtra("name1","+920343547938");
                    in5.putExtra("name2","mashal@gmail.com");
                    startActivity(in5);
                }
                else if(position == 4) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.see);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Ramsha");
                    in5.putExtra("name1","+920344565938");
                    in5.putExtra("name2","ramsha@gmail.com");
                    startActivity(in5);
                }
                else if(position == 5) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.h2);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Hina");
                    in5.putExtra("name1","+923457897338");
                    in5.putExtra("name2","hina@gmail.com");
                    startActivity(in5);
                }
                else if(position == 6) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.lap);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Usman");
                    in5.putExtra("name1","+923439890183");
                    in5.putExtra("name2","usman@gmail.com");
                    startActivity(in5);
                }
                else if(position == 7) {

                    Intent in5=new Intent(Contact1.this, Info.class);
                    in5.putExtra("img", R.drawable.gul);
                    in5.putExtra("img1", R.drawable.ph);
                    in5.putExtra("img2", R.drawable.mail);
                    in5.putExtra("name","Iqra");
                    in5.putExtra("name1","+9234588736492");
                    in5.putExtra("name2","iqra@gmail.com");
                    startActivity(in5);
                }




            }
        });


    }
}
