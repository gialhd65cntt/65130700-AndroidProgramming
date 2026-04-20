 package thigk2.LeHoangDangGia.thigk;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 1. Inflate layout
        View v = inflater.inflate(R.layout.fragment_2, container, false);

        // 2. Ánh xạ ListView
        ListView lvTinhThanh = v.findViewById(R.id.lvTinhThanh);

        // 3. Chuẩn bị dữ liệu (Hard code 10 thành phố)
        ArrayList<String> dsTinhThanh = new ArrayList<>();
        dsTinhThanh.add("Hà Nội");
        dsTinhThanh.add("TP. Hồ Chí Minh");
        dsTinhThanh.add("Đà Nẵng");
        dsTinhThanh.add("Nha Trang");
        dsTinhThanh.add("Cần Thơ");
        dsTinhThanh.add("Huế");
        dsTinhThanh.add("Hải Phòng");
        dsTinhThanh.add("Đà Lạt");
        dsTinhThanh.add("Vũng Tàu");

        dsTinhThanh.add("Lê Hoàng Đăng Gia ");

        // 4. Tạo Adapter (Dùng layout mặc định của Android cho đơn giản)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getContext(),
                android.R.layout.simple_list_item_1,
                dsTinhThanh
        );

        // 5. Đổ dữ liệu lên ListView
        lvTinhThanh.setAdapter(adapter);

        return v;
    }
}