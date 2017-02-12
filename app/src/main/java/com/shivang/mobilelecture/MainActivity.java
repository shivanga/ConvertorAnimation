package com.shivang.mobilelecture;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double Rs,dollr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sayhello(View v)
    {
        EditText editText=(EditText)findViewById(R.id.editText);
        if(editText.getText().toString().equals(""))
        {
            Toast.makeText(this, "Field left empty", Toast.LENGTH_LONG).show();
        }
        else{
                dollr=Double.parseDouble(editText.getText().toString());
            Rs=dollr*67;
            Toast.makeText(this, "Rs. "+Rs.toString(), Toast.LENGTH_LONG).show();

        }

        ImageView pic=(ImageView)findViewById(R.id.PIC1);
        pic.animate().alpha(0f).setDuration(3000); //disappearing
        pic.animate().translationXBy(500f).setDuration(3000); //and moving in x right direction

        //*********NOT IN SYLLABUS************
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

         //********NOT IN SYLLABUS************

                //****************Syllabus mai jo hai**************
                ImageView pic=(ImageView)findViewById(R.id.PIC1);
                pic.setImageResource(R.drawable.pic2);
                pic.animate().alpha(1f).setDuration(3000);         // reappearing
                pic.animate().translationXBy(-500f).setDuration(3000); //and coming back to left

                pic.animate().rotationBy(3600f).setDuration(3000);
                pic.animate().scaleX(1.3f).scaleY(1.3f);
                //**************************************************

            }
        }, 4000);



        Log.i("info",editText.getText().toString()); // for log messages
    }
}
