import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.kim.sreenswitch.MainActivity;
import com.example.kim.sreenswitch.R;

public class second_screen extends AppCompatActivity {
    private static final String TAG = "second_screen";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navsecondsreen);
        Log.d(TAG, "onCreate: tofirstscreen");
        Button btnnavtofirstscreen=(Button)findViewById(R.id.btnnavtofirstcreen);
        btnnavtofirstscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clickedthesecondbutton");
                Intent intent=new Intent(second_screen.this, MainActivity.class);
                startActivities(Intent);
            }
        });
