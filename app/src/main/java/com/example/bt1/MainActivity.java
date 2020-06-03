package com.example.bt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listview1);
        text = findViewById(R.id.demo);
        view view1 = new view("Hồ tây", "hotay","dep");
        view view2 = new view("Tháp rùa", "thaprua","dep");
        view view3 = new view("Chùa một cột", "chuamotcot","dep");
        view view4 = new view("Quốc tử giám", "quoctugian","dep");
        view view5 = new view("Lăng Bác", "langbac","dep");
        view view6 = new view("Thư viện QG", "thuvien","dep");

        view[] lists = new view[]{view1, view2, view3 ,view4, view5, view6};
        ArrayAdapter<view> arrayview = new ArrayAdapter<view>(this,android.R.layout.simple_list_item_1, lists);
        listview.setAdapter(arrayview);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listview.getItemAtPosition(position);
                view views = (view) o;
                Intent intent = new Intent(MainActivity.this,detailview.class);
                intent.putExtra("detailview",views);
                startActivity(intent);
            }
        });
    }
}
