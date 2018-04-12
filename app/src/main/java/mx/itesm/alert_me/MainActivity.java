package mx.itesm.alert_me;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Proximity = (Button) findViewById(R.id.button);
        Button Doors = (Button) findViewById(R.id.button2);
        Proximity.setBackgroundColor(Color.parseColor("#ffbd4a"));

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
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        // Activar flechita hacia atrás

    }

    // Agregar menú del resource file llamado menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    // Acciones al presionar cada botón
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.settings:
                Toast.makeText(this,"Has pulsado el botón borrar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(this, "Has pulsado el botón editar", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

}


