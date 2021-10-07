package com.example.recyclar_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rev;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rev=findViewById(R.id.recview);
        rev.setLayoutManager(new LinearLayoutManager(this));
        adapter=new myadapter(dataqueue());
        rev.setAdapter(adapter);
    }
    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder= new ArrayList<>();
        Model ob1=new Model();
        ob1.setUser("ali");
        ob1.setDesc("he is super student");
        ob1.setImgname(R.drawable.boy);
        holder.add(ob1);
        return holder;


    }
}