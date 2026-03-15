package ntu.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    //Xử lý sự kiện nút tính tổng
    public void XuLyCong(View view){
        // tìm, tham chiếu đến điều khiển trên xml
       EditText editTextSoA =findViewById(R.id.edtA);
       EditText editTextSoB =findViewById(R.id.edtB);
       EditText editTextKetQua =findViewById(R.id.edtKQ);
       // lấy dữ liệu về ở đk số a
       String strA = editTextSoA.getText().toString();
        // lấy dữ liệu về ở đk số b
       String strB = editTextSoB.getText().toString();
    // chuyển dữ liệu sang số
        int soA=Integer.parseInt(strA);
        int soB=Integer.parseInt(strB);
    // tính toán theo yêu cầu
        int tong= soA+soB;
        String strTong=String.valueOf(tong); // chuyển sang dạng chuỗi
        // in ra màn hình
        editTextKetQua.setText(strTong);
    }
}