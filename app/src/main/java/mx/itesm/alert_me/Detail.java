package mx.itesm.alert_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Agregar toolbar del xml llamado toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        // Activar flechita hacia atrás
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent targetIntent = getIntent();
        String sensorName;
        sensorName = targetIntent.getStringExtra("sensorName");

        TextView title = findViewById(R.id.titleDetail);

        title.append(sensorName);
    }

    // Agregar menú del resource file llamado menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
}
