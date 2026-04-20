package ntu.edu.baith9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom=LayoutInflater.from(context);
        View vItem= cai_bom.inflate(R.layout.item_land,parent,false);
        ItemLandHolder viewHolderCreat = new ItemLandHolder(vItem);
        return viewHolderCreat;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        // lấy đối tượng hiển thị
        LandScape landScapeHienThi=lstData.get(position);
        //Trích thông tin
        String caption= landScapeHienThi.getLandCation();
        String tenFileAnh= landScapeHienThi.getLandImageFileName();
        // đặt vào các trường  thông tin của holder
        holder.tvCaption.setText(caption);
        // đặt ảnh
        String packetName=holder.itemView.getContext().getPackageName();
        int imageID=holder.itemView.getResources().getIdentifier(tenFileAnh,"mipmap", packetName);
        holder.ivLandscape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder  {
        TextView tvCaption;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCation);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
        }
    }
}
