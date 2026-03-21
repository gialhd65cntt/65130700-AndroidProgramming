package ntu.edu.baith7;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1 : chuan bi du lieu
        ArrayList<String>   dsVatLieu; // khai báo
        dsVatLieu=new ArrayList<String>();
        // them du lieu
        dsVatLieu.add("Xi măng");
        dsVatLieu.add("Gạch");
        dsVatLieu.add("Đá ốp lát");
        dsVatLieu.add("Ống nhựa");
        dsVatLieu.add("Sơn chống thấm");
        // b2: tao adapter
        ArrayAdapter<String> adapterVatLieu;
        adapterVatLieu=new ArrayAdapter<String>(this,
                                                android.R.layout.simple_list_item_1,
                                                dsVatLieu
                                                );
        //b3: gắn vào đk hiển thị ListView
        // 3.1, Tìm
        ListView lvVatLieuXayDung= findViewById(R.id.lvVatLieu);
        //3.2 Gắn
        lvVatLieuXayDung.setAdapter(adapterVatLieu);
        //3.3 Lắng nghe và xử lý sự kiện user tương tác


    }
}