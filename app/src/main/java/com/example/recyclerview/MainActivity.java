package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    String[]name={"Yousuf","Ali","Rahman","Utshab","Matlab","Zihan","Manik"};
    String[]Roll={"111","112","113","114","115","116","117"};
    int[]image={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerviewid);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new MyAdapter(this,image,name,Roll);
        recyclerView.setAdapter(adapter);

    }
}