package thigk2.LeHoangDangGia.thigk;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DiaDiemAdapter extends BaseAdapter {
    private Context context;
    private List<DiaDiem> list;

    public DiaDiemAdapter(Context context, List<DiaDiem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() { return list.size(); }
    @Override
    public Object getItem(int i) { return list.get(i); }
    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_diadiem, viewGroup, false);
        }

        DiaDiem dd = list.get(i);
        ImageView img = view.findViewById(R.id.imgDiaDiem);
        TextView ten = view.findViewById(R.id.tvTenDiaDiem);
        TextView dc = view.findViewById(R.id.tvDiaChi);

        img.setImageResource(dd.getHinhAnh());
        ten.setText(dd.getTen());
        dc.setText(dd.getDiaChi());

        return view;
    }
}