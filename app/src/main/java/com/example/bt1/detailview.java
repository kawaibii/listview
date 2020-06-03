package com.example.bt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class detailview extends AppCompatActivity {
    TextView name;
    TextView description;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailview);
        name = findViewById(R.id.name);

        description = findViewById(R.id.description);

        image =  findViewById(R.id.imageView);

        view detailview = (view)getIntent().getSerializableExtra("detailview");

        name.setText(detailview.getName());

        description.setText(detailview.getDescription());

        String resourceName = detailview.getSrcimage();
        int resourceIdentifier = getResources().getIdentifier(resourceName, "drawable", this.getPackageName());
        image.setImageResource(resourceIdentifier);
    }
}
