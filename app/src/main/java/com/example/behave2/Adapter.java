package com.example.behave2;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.productViewHolder> {

    private Context context;
    private List<Product>products;

    public Adapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from( context);
        View view=inflater.inflate( R.layout.list,null );
        productViewHolder holder =new productViewHolder( view );
        return new  productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {

        Product product =products.get( position );

        holder.image.setImageResource( products.get( position ).getImage() );
        holder.name.setText( products.get( position ).getName() );
        holder.price.setText( products.get( position ).getPrice() );

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class productViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name,price;
        Button btn;
        public productViewHolder(@NonNull View itemView) {
            super( itemView );

            image=itemView.findViewById( R.id.image );
            name=itemView.findViewById( R.id.name );
            price=itemView.findViewById( R.id.price );
        }
    }
}
