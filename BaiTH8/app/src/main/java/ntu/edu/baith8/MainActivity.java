package ntu.edu.baith8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tìm listview
        ListView lvDSMonAn= (ListView) findViewById(R.id.lvDSMonAn);

        // Chuẩn bị dữ liệu
        ArrayList<MonAn> dsMonAn=new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm tấm sườn",25000,"Cơm với sườn nướng",R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm sườn trứng",27000,"Cơm với sườn nướng",R.drawable.cst));
        dsMonAn.add(new MonAn("Cơm gà xối mỡ",30000,"Cơm với sườn nướng",R.drawable.cg));
        dsMonAn.add(new MonAn("Sườn bì chả",35000,"Cơm với sườn nướng",R.drawable.sb));
        dsMonAn.add(new MonAn("Cơm tấm đặc biệt",40000,"Cơm với sườn nướng",R.drawable.db));

        //
        MonAnAdapter adapter=new MonAnAdapter(this,dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        // bắt sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                MonAn monAnChon=dsMonAn.get(i);
                // làm gì đó tùy bài
                Toast.makeText(MainActivity.this,monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}