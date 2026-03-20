package ntu.edu.baith5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // Khai báo các đối tượng gắn với điều khiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;

    void TimDieuKhien(){
        editTextSo1= (EditText) findViewById(R.id.edtSo1);
        editTextSo2= (EditText) findViewById(R.id.edtSo2);
        editTextKQ= (EditText) findViewById(R.id.edtKetQua);
        nutCong=(Button) findViewById(R.id.btnCong);
        nutTru= (Button) findViewById(R.id.btnTru);
        nutNhan=(Button) findViewById(R.id.btnNhan);
        nutChia= (Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    // Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút

        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CONG();
            }
        });
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // XỬ LÝ TRỪ
                XULY_TRU();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //XỬ LÝ NHÂN
                XULY_NHAN();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // XỬ LÝ CHIA
                XULY_CHIA();
            }
        });

    }
    void XULY_CONG(){
        // lấy dữ liệu
        String so1=editTextSo1.getText().toString();
        String so2=editTextSo2.getText().toString();
        // chuyển về dạng số
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float tong=num1+num2;
        // chuyển chuỗi
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_TRU(){
        // lấy dữ liệu
        String so1=editTextSo1.getText().toString();
        String so2=editTextSo2.getText().toString();
        // chuyển về dạng số
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float hieu=num1-num2;
        // chuyển chuỗi
        String chuoiKQ=String.valueOf(hieu);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_NHAN(){
        // lấy dữ liệu
        String so1=editTextSo1.getText().toString();
        String so2=editTextSo2.getText().toString();
        // chuyển về dạng số
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float tich=num1*num2;
        // chuyển chuỗi
        String chuoiKQ=String.valueOf(tich);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_CHIA(){
        // lấy dữ liệu
        String so1=editTextSo1.getText().toString();
        String so2=editTextSo2.getText().toString();
        // chuyển về dạng số
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float chia=num1/num2;
        // chuyển chuỗi
        String chuoiKQ=String.valueOf(chia);
        editTextKQ.setText(chuoiKQ);
    }
}