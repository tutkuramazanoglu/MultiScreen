package a2.udemy.multiscreen;
/*
* Intent class takes two parameter
* first parameter is context and second one is class which represent which class you want to call
*
* How to transfer data between to screens?
* intent.putExtra(key,value) this line send to value another screen
* For meeting value other screen create object from getIntent()
* Using the object you can meet variable according value type
* ex: if it is string getStringExtra(key);
* */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String userName;
    EditText et_userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_userName=findViewById(R.id.editTextTextPersonName);
        userName="";
    }

    public void goToSecondScreen(View view){

        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        userName=et_userName.getText().toString();
        intent.putExtra("userName",userName);
        startActivity(intent);

    }
}