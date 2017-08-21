package com.example.admin.profileimage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 8/21/2017.
 */

public class adapterrecycle extends RecyclerView.Adapter<adapterrecycle.MyViewHolder>  {


    private List<Friends> friendsList;
    @Override
    public adapterrecycle.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycledesign, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(adapterrecycle.MyViewHolder holder, int position) {
        Friends friends = friendsList.get(position);
        holder.Name.setText(friends.getName());
        holder.Email.setText(friends.getEmail());

    }

    @Override
    public int getItemCount() {
        return friendsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Name,Email;

        public MyViewHolder(View itemView) {
            super(itemView);
            Name = (TextView)itemView.findViewById(R.id.tv_adapter_name);
            Email = (TextView)itemView.findViewById(R.id.tv_adapter_email);
        }
    }
    public adapterrecycle(List<Friends> friendsList) {
        this.friendsList = friendsList;
    }
}
