package thigk2.LeHoangDangGia.thigk;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import thigk2.LeHoangDangGia.thigk.Fragment2;
import thigk2.LeHoangDangGia.thigk.Fragment3;
import thigk2.LeHoangDangGia.thigk.Fragment4;

public class FragmentFooter extends Fragment {

    public FragmentFooter() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate layout cho fragment này
        View v = inflater.inflate(R.layout.fragment_footer, container, false);

        // 1. Ánh xạ 4 nút từ XML
        Button b1 = v.findViewById(R.id.button1);
        Button b2 = v.findViewById(R.id.button2);
        Button b3 = v.findViewById(R.id.button3);
        Button b4 = v.findViewById(R.id.button4); // Nút mới thêm

        FragmentManager fragmentManager = getParentFragmentManager();

        // 2. Thiết lập sự kiện click cho từng nút

        // Chức năng 1: Tính toán
        b1.setOnClickListener(v1 -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView_Content, new Fragment1())
                    .commit();
        });

        // Chức năng 2: Danh sách tỉnh thành
        b2.setOnClickListener(v1 -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView_Content, new Fragment2())
                    .commit();
        });

        // Chức năng 3: Địa điểm Nha Trang
        b3.setOnClickListener(v1 -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView_Content, new Fragment3())
                    .commit();
        });

        // Chức năng 4: Thông tin cá nhân sinh viên
        b4.setOnClickListener(v1 -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView_Content, new Fragment4()) // Nhớ tạo Fragment4 nhé
                    .commit();
        });

        return v;
    }
}