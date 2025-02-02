package com.example.khbuddy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.MyViewHolder> {

    //String data1[], data2[];
    //int images[];
    Context context;
    private OnItemClickListener mListener;
    private ArrayList <Items> mExList;
    private ArrayList<Items> mExList2;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener (OnItemClickListener listener){
        mListener = listener;
    }

    public RecAdapter(ArrayList<Items> exList){
        this.mExList = exList;
        mExList2= new ArrayList<>(exList);
    }

    public void showT(){
       // startActivity(new Intent(kh2Menu.this, Drives.class));
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // LayoutInflater inflater = LayoutInflater.from(context);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_row, parent, false);
        //View view = inflater.inflate(R.layout.my_row, parent, false);
        MyViewHolder mvh = new MyViewHolder(view, mListener);


        return mvh;
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Items currentI = mExList.get(position);


        holder.myText1.setText(currentI.getText1());
        holder.myText2.setText(currentI.getText2());
        holder.myImage.setImageResource(currentI.getImg());

    }

    @Override
    public int getItemCount() {
        return mExList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1, myText2;
        ImageView myImage;

        public MyViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.title);
            myText2 = itemView.findViewById(R.id.desc);
            myImage = itemView.findViewById(R.id.img);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                           listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public Filter getFilter(){
        return exampleFilter;
    }
    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            ArrayList<Items> filteredList = new ArrayList<>();

            if(charSequence == null|| charSequence.length() ==0){
                filteredList.addAll(mExList2);
            }
            else{
                String filterPattern = charSequence.toString().toLowerCase().trim();

                for (Items item: mExList2){
                    if(item.getText1().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }

            FilterResults res = new FilterResults();
            res.values = filteredList;
            return res;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults res) {
            mExList.clear();
            mExList.addAll((ArrayList) res.values);
            notifyDataSetChanged();
        }
    };
}
