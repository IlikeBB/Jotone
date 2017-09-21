package jotone.example.administrator.jotone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        /////////////////////////////////前往旅客區
        Button guestbuttons=(Button)findViewById(R.id.guest);
        guestbuttons.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(LoginPage.this,MainActivity.class);
                startActivity(intent);
                LoginPage.this.finish();
            }
        });
        ////////////////////////////////
    }
}
