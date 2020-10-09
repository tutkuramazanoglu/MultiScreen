package a2.udemy.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv_userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_userName=findViewById(R.id.textView2);

        Intent intent=getIntent();
        String userName=intent.getStringExtra("userName");
        tv_userName.setText(userName);

    }
    public void goToFirstScreen(View view){
        //it refers to appContext
        //Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        Intent intent=new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);

    }
}