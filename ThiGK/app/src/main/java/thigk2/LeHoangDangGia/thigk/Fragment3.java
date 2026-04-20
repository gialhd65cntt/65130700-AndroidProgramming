package thigk2.LeHoangDangGia.thigk;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class Fragment3 extends Fragment {

    public Fragment3() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_3, container, false);
        ListView lv = v.findViewById(R.id.lvDuLich); // Đảm bảo fragment3.xml có ListView này

        // Hard code 5 địa điểm (Bạn cần thêm ảnh vào res/drawable)
        ArrayList<DiaDiem> ds = new ArrayList<>();
        ds.add(new DiaDiem(R.drawable.vinpearl, "VinWonders Nha Trang", "Đảo Hòn Tre"));
        ds.add(new DiaDiem(R.drawable.thapba, "Tháp Bà Ponagar", "Đường 2/4, Vĩnh Phước"));
        ds.add(new DiaDiem(R.drawable.honchong, "Hòn Chồng", "Vĩnh Phước, Nha Trang"));
        ds.add(new DiaDiem(R.drawable.chualongson, "Chùa Long Sơn", "20 Đường 23/10"));
        ds.add(new DiaDiem(R.drawable.vienhaiduong, "Viện Hải dương học", "01 Cầu Đá"));

        DiaDiemAdapter adapter = new DiaDiemAdapter(getContext(), ds);
        lv.setAdapter(adapter);

        return v;
    }
}