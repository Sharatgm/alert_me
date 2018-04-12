package mx.itesm.alert_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Proximity = (Button) findViewById(R.id.button);
        Button Doors = (Button) findViewById(R.id.button2);

        Proximity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(MainActivity.this, ProxActivity.class);
                startActivity(one);
            }
        });

        Doors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(MainActivity.this, DoorsActivity.class);
                startActivity(one);
            }
        });
    }
}
