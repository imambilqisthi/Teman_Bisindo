package com.example.temanbisindo.Common;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.temanbisindo.Databases.DataModel;
import com.example.temanbisindo.HelperClasses.DataAdapter;
import com.example.temanbisindo.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class BulanhariActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<DataModel> datahuruf;
    DatabaseReference dbref,dbref2;
    private DataAdapter hurufadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulanhari);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        datahuruf = new ArrayList<DataModel>();
        dbref = FirebaseDatabase.getInstance().getReference().child("bulan");
        dbref.addListenerForSingleValueEvent(valueEventListener);
        dbref2 = FirebaseDatabase.getInstance().getReference().child("hari");
        dbref2.addListenerForSingleValueEvent(valueEventListener2);
    }

    ValueEventListener valueEventListener = new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                DataModel dhuruf = dataSnapshot.getValue(DataModel.class);
                datahuruf.add(dhuruf);
            }
            hurufadapter = new DataAdapter(BulanhariActivity.this, datahuruf);
            recyclerView.setAdapter(hurufadapter);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
    };
    ValueEventListener valueEventListener2 = new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                DataModel dhuruf = dataSnapshot.getValue(DataModel.class);
                datahuruf.add(dhuruf);
            }
            hurufadapter = new DataAdapter(BulanhariActivity.this, datahuruf);
            recyclerView.setAdapter(hurufadapter);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
    };
}