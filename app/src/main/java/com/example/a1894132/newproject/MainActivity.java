package com.example.a1894132.newproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
// import android.widget.Snackbar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button toast_btn = (Button) findViewById(R.id.toast_btn) ;
       toast_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

             /* String tag;
               Log.d(tag,name);
               Log.d(tag,email);
               Log.d(tag,password);*/

             /* Snackbar snb = Snackbar.make(findViewById(R.id.toast_btn),"Register is Done!",Snackbar.LENGTH_INDEFINITE).setAction("UNDO", new View.OnClickListener() {*/
              Toast toast = Toast.makeText(getApplicationContext()," Farhin Thank You", Toast.LENGTH_SHORT);
               toast.setGravity(Gravity.CENTER,10,10);
             toast.show();

           }
       });
            //   snb.show();
    }
}
