package xuexuan.systemrecoverymemory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toast.makeText(this, "2:onCreate()",Toast.LENGTH_LONG).show();
        Log.d("2:onCreate()","onCreate()");

    }


    @Override
    protected void onResume() {
        super.onResume();
        MyApplication app = (MyApplication) getApplication();
        Toast.makeText(this, "2:"+app.getName().toUpperCase(),Toast.LENGTH_LONG).show();
        Log.d("2:",app.getName());
    }
}
