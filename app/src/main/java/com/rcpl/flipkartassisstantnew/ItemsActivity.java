package com.rcpl.flipkartassisstantnew;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

//import com.allandroidprojects.ecomsample.product.ItemDetailsActivity;

public class ItemsActivity extends AppCompatActivity {


    static RecyclerView rv;
    public static final String STRING_IMAGE_URI = "ImageUri";
    public static final String STRING_IMAGE_POSITION = "ImagePosition";
    private static ItemsActivity mActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);


        rv= (RecyclerView) findViewById(R.id.recyclerView);

        String[] items=new String[]{
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/1778/numbers-time-watch-white-medium.jpg",
                "https://static.pexels.com/photos/111147/pexels-photo-111147-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/168575/pexels-photo-168575-medium.jpeg",
                "https://static.pexels.com/photos/213384/pexels-photo-213384-medium.jpeg",
                "https://static.pexels.com/photos/67442/pexels-photo-67442-medium.jpeg",
                "https://static.pexels.com/photos/159494/book-glasses-read-study-159494-medium.jpeg",
                "https://static.pexels.com/photos/1543/landscape-nature-man-person-medium.jpg",
                "https://static.pexels.com/photos/211048/pexels-photo-211048-medium.jpeg",
                "https://static.pexels.com/photos/2713/wall-home-deer-medium.jpg",
                "https://static.pexels.com/photos/177143/pexels-photo-177143-medium.jpeg",
                "https://static.pexels.com/photos/106936/pexels-photo-106936-medium.jpeg"
        };
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(new MyAdapter());

    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        List<getFirebase> listArray;

        public MyAdapter(List<getFirebase> listArray) {
            this.listArray = listArray;
        }


        @NonNull
        @Override
        public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }


        public class MyViewHolder extends RecyclerView.ViewHolder {

            ImageView image;
            TextView name,price;

            public MyViewHolder(View itemView) {
                super(itemView);
                image=itemView.findViewById(R.id.image1);
                name=itemView.findViewById(R.id.itemName);
                price=itemView.findViewById(R.id.itemPrice);


            }
        }





    }

}
