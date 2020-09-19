package com.example.khbuddy;

import android.content.Context;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class kh1AccessAdaptor extends RecyclerView.Adapter<kh1AccessAdaptor.MyViewHolder> implements Filterable {



    //String data1[], data2[];
    //int images[];
    Context context;
    private kh1AccessAdaptor.OnItemClickListener mListener;
    private ArrayList<ItemsK> mExList;
    private ArrayList<ItemsK> mExList2;

    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener (kh1AccessAdaptor.OnItemClickListener listener){
        mListener = listener;
    }

    public kh1AccessAdaptor(ArrayList<ItemsK> exList){

        this.mExList = exList;
        mExList2= new ArrayList<>(exList);

    }

    @NonNull
    @Override
    public kh1AccessAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // LayoutInflater inflater = LayoutInflater.from(context);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.big, parent, false);
        //View view = inflater.inflate(R.layout.my_row, parent, false);
        kh1AccessAdaptor.MyViewHolder mvh = new kh1AccessAdaptor.MyViewHolder(view, mListener);


        return mvh;
    }



    @Override
    public void onBindViewHolder(@NonNull kh1AccessAdaptor.MyViewHolder holder, int position) {
        ItemsK currentI = mExList.get(position);


        holder.myText1.setText(currentI.getText1());
        holder.myText2.setText(currentI.getText2());
        holder.myText3.setText(currentI.getText3());
        holder.myText4.setText(currentI.getText4());
        holder.myText5.setText(currentI.getText5());
        holder.myImage.setImageResource(currentI.getImg());

    }

    @Override
    public int getItemCount() {
        return mExList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView myText1, myText2, myText3, myText4, myText5;
        ImageView myImage;

        public MyViewHolder(@NonNull View itemView, final kh1AccessAdaptor.OnItemClickListener listener) {
            super(itemView);
            myText1 = itemView.findViewById(R.id.title);
            myText2 = itemView.findViewById(R.id.desc);
            myText3 = itemView.findViewById(R.id.atk);
            myText4 = itemView.findViewById(R.id.mag);
            myText5 = itemView.findViewById(R.id.abl);
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
            ArrayList<ItemsK> filteredList = new ArrayList<>();

            if(charSequence == null|| charSequence.length() ==0){
                filteredList.addAll(mExList2);
            }
            else{
                String filterPattern = charSequence.toString().toLowerCase().trim();

                for (ItemsK item: mExList2){
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
