package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    public TextView itemName;
    public TextView quantity;
    public TextView dateAdded;
    public int groceryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        itemName = (TextView) findViewById(R.id.itemNameDet);
        quantity = (TextView) findViewById(R.id.quantityDet);
        dateAdded = (TextView) findViewById(R.id.dateAddedDet);

        Bundle bundle = getIntent().getExtras();
        if ( bundle != null) {
            itemName.setText(bundle.getString("name"));
            quantity.setText(bundle.getString("quantity"));
            dateAdded.setText(bundle.getString("date"));
            groceryId = bundle.getInt("id");
        }
    }
}