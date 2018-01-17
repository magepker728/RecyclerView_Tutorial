package assignment3.abdoulkarim.cosc431.towson.edu.recyclerviewtutorial;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karim on 1/11/2018.
 */

public class My_adapter extends RecyclerView.Adapter<My_adapter.ViewHolder> {
ArrayList<ItemClass> mylist;

    My_adapter( ArrayList<ItemClass> mylist){
        this.mylist=mylist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ItemClass list =  mylist.get(position);
        holder.Header.setText(list.getHeading());
        holder.Description.setText(list.getDesc());

    }

    @Override
    public int getItemCount() {

        return mylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView Header, Description;

        public ViewHolder(View itemView) {
            super(itemView);
            Header= itemView.findViewById(R.id.Heading_txt);
            Description=itemView.findViewById(R.id.Description_txt);
        }
    }

}
