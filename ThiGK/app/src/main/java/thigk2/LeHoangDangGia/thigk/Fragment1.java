package thigk2.LeHoangDangGia.thigk;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import thigk2.LeHoangDangGia.thigk.R;

public class Fragment1 extends Fragment {

    EditText edtChieuDai, edtChieuRong;
    TextView txtKetQua;
    Button btnChuVi, btnDienTich;

    public Fragment1() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, container, false);

        // Ánh xạ
        edtChieuDai = v.findViewById(R.id.edtChieuDai);
        edtChieuRong = v.findViewById(R.id.edtChieuRong);
        txtKetQua = v.findViewById(R.id.txtKetQua);
        btnChuVi = v.findViewById(R.id.btnChuVi);
        btnDienTich = v.findViewById(R.id.btnDienTich);

        // Xử lý nút Chu vi
        btnChuVi.setOnClickListener(view -> {
            calculate(true); // true là tính chu vi
        });

        // Xử lý nút Diện tích
        btnDienTich.setOnClickListener(view -> {
            calculate(false); // false là tính diện tích
        });

        return v;
    }

    // Hàm dùng chung để lấy dữ liệu và kiểm tra
    private void calculate(boolean isChuVi) {
        String sDai = edtChieuDai.getText().toString();
        String sRong = edtChieuRong.getText().toString();

        if (sDai.isEmpty() || sRong.isEmpty()) {
            Toast.makeText(getContext(), "Vui lòng nhập đủ số liệu!", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double dai = Double.parseDouble(sDai);
            double rong = Double.parseDouble(sRong);

            if (isChuVi) {
                double cv = (dai + rong) * 2;
                txtKetQua.setText("Chu vi mảnh đất là: " + cv + " m");
            } else {
                double dt = dai * rong;
                txtKetQua.setText("Diện tích mảnh đất là: " + dt + " m²");
            }
        } catch (Exception e) {
            Toast.makeText(getContext(), "Lỗi định dạng số!", Toast.LENGTH_SHORT).show();
        }
    }
}