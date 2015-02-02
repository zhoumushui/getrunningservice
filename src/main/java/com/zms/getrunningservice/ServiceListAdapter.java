package com.zms.getrunningservice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by AlexZhou on 2015/2/2.
 * 9:14
 */
public class ServiceListAdapter extends BaseAdapter {

    private List<ServiceModel> appInfoList = null;

    LayoutInflater infater = null;

    public ServiceListAdapter(Context context, List<ServiceModel> apps) {
        infater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        appInfoList = apps;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        System.out.println("size" + appInfoList.size());
        return appInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return appInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup arg2) {
        System.out.println("getView at " + position);
        View view;
        ViewHolder holder;
        if (convertView == null || convertView.getTag() == null) {
            view = infater.inflate(R.layout.service_list_item, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) convertView.getTag();
        }
        ServiceModel runServiceInfo = (ServiceModel) getItem(position);
        holder.ivAppIcon.setImageDrawable(runServiceInfo.getAppIcon());
        holder.tvAppLabel.setText(runServiceInfo.getAppLabel());
        holder.tvServiceName.setText(runServiceInfo.getServiceName());
        holder.tvProcessId.setText(runServiceInfo.getPid() + "");
        holder.tvProcessName.setText(runServiceInfo.getProcessName());

        return view;
    }

    class ViewHolder {
        ImageView ivAppIcon;
        TextView tvAppLabel;
        TextView tvServiceName;
        TextView tvProcessId;
        TextView tvProcessName;


        public ViewHolder(View view) {
            this.ivAppIcon = (ImageView) view.findViewById(R.id.ivAppIcon);
            this.tvServiceName = (TextView) view.findViewById(R.id.tvServiceName);
            this.tvAppLabel = (TextView) view.findViewById(R.id.tvAppLabel);
            this.tvProcessId = (TextView) view.findViewById(R.id.tvProcessId);
            this.tvProcessName = (TextView) view.findViewById(R.id.tvProcessName);
        }
    }
}
