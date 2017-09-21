package jotone.example.administrator.jotone;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Toolbar toolbar=(Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


     public boolean onCreateOptionsMenu(Menu menu){
         getMenuInflater().inflate(R.menu.menu_sub, menu);
         return true;

     }
     public boolean onOptionItemSelected(MenuItem item){
         int id=item.getItemId();
         if(id==R.id.action_settings){
             return true;
         }
         if(id==android.R.id.home){
             NavUtils.navigateUpFromSameTask(this);
         }
         return super.onOptionsItemSelected(item);
     }
}
