package jotone.example.administrator.jotone;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_appbar);

        toolbar=(Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //左側欄位的設定
        getSupportActionBar ().setDisplayHomeAsUpEnabled ( false );
        NavigationDrawerFragment drawerFragment=(NavigationDrawerFragment)
                getSupportFragmentManager ().findFragmentById ( R.id.fragment_navigation_drawer );
        drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout) findViewById ( R.id.drawer_layout ),toolbar);
    }




    //右上setting
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }




public boolean onOptionsItemSelected(MenuItem item){
    int id=item.getItemId();

    if(id==R.id.action_settings){
        Toast.makeText(this,"Hey you just hit"+item.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }
    if(id==R.id.navigate){
        startActivity(new Intent(this, SubActivity.class));
    }
    return super.onOptionsItemSelected(item);
}



}
