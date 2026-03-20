package ntu.edu.baith6;

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
        EditText editTextSo1;
        EditText editTextSo2;
        EditText editTextKQ;
        Button nutTinhTong;

        void TimDieuKhien(){
            editTextSo1=(EditText) findViewById(R.id.edtA);
            editTextSo2=(EditText) findViewById(R.id.edtB);
            editTextKQ=(EditText) findViewById(R.id.edtKQ);
            nutTinhTong=(Button)  findViewById(R.id.button2);

        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        nutTinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTinhTong();
            }
        });
    }
    void XuLyTinhTong(){
            // lay du lieu
        String so1=editTextSo1.getText().toString();
        String so2=editTextSo2.getText().toString();
        // chuyen ve dang so
        float num1=Float.parseFloat(so1);
        float num2=Float.parseFloat(so2);
        float tong=num1+num2;
        //chuyển chuỗi
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);

    }
}