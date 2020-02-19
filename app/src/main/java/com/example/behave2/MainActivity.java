package com.example.behave2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        imageView= findViewById( R.id.image );

        RecyclerView recyclerView =findViewById( R.id.recycler );
//        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));

        adapter =new Adapter( this,getMyList() );
        recyclerView.setAdapter( adapter );
    }

    private List<Product> getMyList() {

        ArrayList<Product>products =new ArrayList<>(  );
        Product p=new Product();
        p.setImage( R.drawable.dog1 );
        p.setName( "Behavioural Correction" );
        p.setPrice( " ₹  700" );
        products.add( p );

        p=new Product();
        p.setImage( R.drawable.dog2 );
        p.setName( "Basic  Obedience" );
        p.setPrice( " ₹  800" );
        products.add( p );

        p=new Product();
        p.setImage( R.drawable.pet2 );
        p.setName( "Behavioural Correction" );
        p.setPrice( " ₹  600" );
        products.add( p );

        p=new Product();
        p.setImage( R.drawable.dog2 );
        p.setName( "Basic  Obedience" );
        p.setPrice( " ₹  700" );
        products.add( p );

        p=new Product();
        p.setImage( R.drawable.dog1 );
        p.setName( "Behavioural Correction" );
        p.setPrice( " ₹  900" );
        products.add( p );

        return products;
    }
}
