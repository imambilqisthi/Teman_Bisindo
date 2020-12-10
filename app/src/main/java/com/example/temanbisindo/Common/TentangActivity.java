package com.example.temanbisindo.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.temanbisindo.R;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class TentangActivity extends AppCompatActivity {
    ExpandableRelativeLayout mycontent,mycontent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        Button btnOpen = findViewById(R.id.btnOpen);
        Button btnDetail = findViewById(R.id.btnDetail);

    }
    public void showdetails(View view){
        mycontent =(ExpandableRelativeLayout)findViewById(R.id.mycontent);
        mycontent.toggle();
    }
    public  void showdetails2(View view){
        mycontent2= (ExpandableRelativeLayout)findViewById(R.id.mycontent2);
        mycontent2.toggle();
    }
}