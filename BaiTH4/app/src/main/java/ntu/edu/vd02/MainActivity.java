package ntu.edu.vd02;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void TimDieuKhien(){
         editTextSo1= (EditText) findViewById(R.id.edtSo1);
         editTextSo2= (EditText) findViewById(R.id.edtSo2);
         editTextKQ= (EditText) findViewById(R.id.edtKetQua);
         nutCong=(Button) findViewById(R.id.btnCong);
         nutTru= (Button) findViewById(R.id.btnTru);
         nutNhan=(Button) findViewById(R.id.btnNhan);
         nutChia= (Button) findViewById(R.id.btnChia);
    }
    public void XuLyCong(View v){
        //b1.1 tìm edit text số 1 và số 2
         // b1.2 lấy dữ liệu từ 2 điều khiển đó
       String soThu1 = editTextSo1.getText().toString();
       String soThu2 = editTextSo2.getText().toString();
       //b1.3 chuyển dữ liệu từ chuỗi sang số
        float  soA= Float.parseFloat(soThu1);
        float  soB= Float.parseFloat(soThu2);
        // b2. tính toán
        float tong= soA+soB;
        //b3. hiển thị
        //b3.2 chuẩn bị dữ liệu
        String chuoiKQ= String.valueOf(tong);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
   public void XuLyTru(View v){
        //b1.1 tìm edit text số 1 và số 2
        // b1.2 lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float  soA= Float.parseFloat(soThu1);
        float  soB= Float.parseFloat(soThu2);
        // b2. tính toán
        float hieu= soA-soB;
        //b3. hiển thị
        //b3.2 chuẩn bị dữ liệu
        String chuoiKQ= String.valueOf(hieu);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        // b1.2 lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float  soA= Float.parseFloat(soThu1);
        float  soB= Float.parseFloat(soThu2);
        // b2. tính toán
        float nhan= soA*soB;
        //b3. hiển thị
        //b3.2 chuẩn bị dữ liệu
        String chuoiKQ= String.valueOf(nhan);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
   public void XuLyChia(View v){
//b1.1 tìm edit text số 1 và số 2
        // b1.2 lấy dữ liệu từ 2 điều khiển đó
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 chuyển dữ liệu từ chuỗi sang số
        float  soA= Float.parseFloat(soThu1);
        float  soB= Float.parseFloat(soThu2);
        // b2. tính toán
        float chia= soA/soB;
        //b3. hiển thị
        //b3.2 chuẩn bị dữ liệu
        String chuoiKQ= String.valueOf(chia);
        //b3.3 gắn kết quả lên đk
        editTextKQ.setText(chuoiKQ);
    }
}