package com.example.submissionpemula;



import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.text.BreakIterator;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListBrandAdapter extends RecyclerView.Adapter<ListBrandAdapter.ListViewHolder> {
    private ArrayList<Brand> listBrand;

    public ListBrandAdapter(ArrayList<Brand> list) {
        this.listBrand = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_brand, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Brand brand = listBrand.get(position);
        Glide.with(holder.itemView.getContext())
                .load(brand.getPhoto())
                .into(holder.imgPhoto);

        //holder.imgPhoto.setImageResource(brand.getPhoto());
        holder.tvName.setText(brand.getName());
        holder.tvDetail.setText(brand.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " +
//                        listBrand.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
//                Intent detail = new Intent(holder.itemView.getContext(),Detail.class);
//                detail.putExtra(Detail.EXTRA_NAME, listBrand.get(holder.getAdapterPosition()).getName());
//                detail.putExtra(Detail.EXTRA_DETAIL, listBrand.get(holder.getAdapterPosition()).getDetail());
//                startActivity(detail);
                    startActivity(new Intent(holder.itemView.getContext(),Detail.class));
            }
        });
    }

    private void startActivity(Intent moveWithDataIntent) {

    }

    @Override
    public int getItemCount() {
        return listBrand.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public CircleImageView imgPhoto;
        public TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
