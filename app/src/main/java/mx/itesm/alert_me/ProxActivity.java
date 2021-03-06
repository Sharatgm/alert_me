package mx.itesm.alert_me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ProxActivity extends AppCompatActivity {
    String items[] = new String [] {"Safe box", "Stove", "Stairs"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prox);

        // Agregar toolbar del xml llamado toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        // Activar flechita hacia atrás
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create list view for doors options
        ListView listView =  (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(ProxActivity.this, Detail.class);

                if(position == 0){
                    myIntent.putExtra("sensorName", "Safe box");
                    startActivity(myIntent);
                } else if (position == 1){
                    myIntent.putExtra("sensorName", "Stove");
                    startActivity(myIntent);
                } else {
                    myIntent.putExtra("sensorName", "Stairs");
                    startActivity(myIntent);
                }
            }
        });

    }

    // Agregar menú del resource file llamado menu
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    // Acciones al presionar cada opción del menú
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.settings:
                Intent myIntent = new Intent(ProxActivity.this, SettingsActivity.class);
                startActivity(myIntent);
                break;
            case R.id.logout:
                Intent myIntent2 = new Intent(ProxActivity.this, loginActivity.class);
                startActivity(myIntent2);
                break;

        }
        return true;
    }
}
