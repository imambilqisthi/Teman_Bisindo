package com.example.temanbisindo.HelperClasses;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.temanbisindo.Databases.DataModel;
import com.example.temanbisindo.R;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<DataModel> dataDataModel;

    public DataAdapter(Context context, ArrayList<DataModel> datahuruf){
        this.context = context;
        this.dataDataModel = datahuruf;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.huruf_list,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DataModel dhuruf = this.dataDataModel.get(position);
        holder.TVabjad.setText(dhuruf.getData());
        holder.TVabjad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("id",dhuruf.getId());
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(dhuruf.getVideo()));
                v.getContext().startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return dataDataModel.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView TVabjad;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            TVabjad = itemView.findViewById(R.id.TVabjad);
        }
    }
}
