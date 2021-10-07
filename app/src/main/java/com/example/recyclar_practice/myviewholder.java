package com.example.recyclar_practice;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    ImageView img;
    EditText t1,t2;

    public myviewholder(@NonNull View itemView) {
        super(itemView);
        img=itemView.findViewById(R.id.img1);
        t1=(EditText) itemView.findViewById(R.id.t1);
        t2=(EditText) itemView.findViewById(R.id.t2);


    }
}
