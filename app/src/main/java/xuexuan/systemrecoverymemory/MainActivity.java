package xuexuan.systemrecoverymemory;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication app = (MyApplication) getApplication();
        app.setName("Developer Phil");
        Toast.makeText(this, "1:" + app.getName(),Toast.LENGTH_LONG).show();
        Log.d("1:",app.getName());
        startActivity(new Intent(this, Main2Activity.class));
    }
}
