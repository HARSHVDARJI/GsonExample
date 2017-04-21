package com.apilib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by harsh on 19/4/17.
 */

class CustomAdapter extends BaseAdapter{
    Context context;
    ArrayList<PojoModel> item;

    public CustomAdapter(Context context, ArrayList<PojoModel> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder{
        TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomAdapter.ViewHolder holder = new CustomAdapter.ViewHolder();
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.single_list, parent, false);

            holder.tx1 = (TextView) convertView.findViewById(R.id.tx1);
            holder.tx2 = (TextView) convertView.findViewById(R.id.tx2);
            holder.tx3 = (TextView) convertView.findViewById(R.id.tx3);
            holder.tx4 = (TextView) convertView.findViewById(R.id.tx4);
            holder.tx5 = (TextView) convertView.findViewById(R.id.tx5);
            holder.tx6 = (TextView) convertView.findViewById(R.id.tx6);
            holder.tx7 = (TextView) convertView.findViewById(R.id.tx7);
            holder.tx8 = (TextView) convertView.findViewById(R.id.tx8);
            holder.tx9 = (TextView) convertView.findViewById(R.id.tx9);
            convertView.setTag(holder);
        } else
        {
            holder = (CustomAdapter.ViewHolder) convertView.getTag();
        }
        holder.tx1.setText(String.valueOf(item.get(position).getId()));
        holder.tx2.setId(item.get(position).getCat_id());
        holder.tx3.setText(item.get(position).getDescription());
        holder.tx4.setId(item.get(position).getNo_comments());
        holder.tx5.setId(item.get(position).getNo_like());
        holder.tx6.setText(item.get(position).getPost_pic());
        holder.tx7.setText(item.get(position).getTitle());
        holder.tx8.setId(item.get(position).getUser_id());
        holder.tx9.setId(item.get(position).getUser_name());
        return convertView;
    }
}
