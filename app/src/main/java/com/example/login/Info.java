package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    ImageView image;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    TextView text;
    TextView text1;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().setTitle("Contact Info");

        image=(ImageView)findViewById(R.id.imageView2);
        image1=(ImageView)findViewById(R.id.imageView);
        image2=(ImageView)findViewById(R.id.imageView3);
        image3=(ImageView)findViewById(R.id.imageView4);
        text=(TextView)findViewById(R.id.textView3);
        text1=(TextView)findViewById(R.id.textView4);
        text2=(TextView)findViewById(R.id.textView5);
        Bundle bundle=getIntent().getExtras();
        int pic=bundle.getInt("img");
        int i1=bundle.getInt("img1");
        int i2=bundle.getInt("img2");
        image.setImageResource(pic);
        image1.setImageResource(pic);
        image2.setImageResource(i1);
        image3.setImageResource(i2);
        String contact=bundle.getString("name");
        String contact1=bundle.getString("name1");
        String contact2=bundle.getString("name2");
        text.setText(contact);
        text1.setText(contact1);
        text2.setText(contact2);




       // image=(ImageView)findViewById(R.id.imageView2);
       // Bundle bundle1=getIntent().getExtras();
       // int pic1=bundle1.getInt("img");
      //  image.setImageResource(pic1);

      //  image=(ImageView)findViewById(R.id.imageView2);
       // Bundle bundle2=getIntent().getExtras();
       // int pic2=bundle2.getInt("img");
      //  image.setImageResource(pic2);



    }
}
