  package com.example.reyanthonypaano.androiddevtutorial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

  public class MainActivity extends AppCompatActivity implements View.OnClickListener {

      Button dialPhone, toast, showLocation, openWedPage, viewIntent,letsGoPro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Getting the views from activity_main
        dialPhone = (Button) findViewById(R.id.dialNumber);
        toast = (Button) findViewById(R.id.toast);
        showLocation = (Button) findViewById(R.id.showLocation);
        openWedPage = (Button) findViewById(R.id.openWebPage);
        viewIntent = (Button) findViewById(R.id.viewIntent);
        letsGoPro = (Button) findViewById(R.id.letsGoPro);

        //Setting onClickListener
        dialPhone.setOnClickListener(this);
        toast.setOnClickListener(this);
        showLocation.setOnClickListener(this);
        openWedPage.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        letsGoPro.setOnClickListener(this);


    }

      @Override
      public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.dialNumber:
                //Implicit Intent - calling an Android component
                Intent impIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789")); //"tel"is the telephone specific
                startActivity(impIntent);
                break;
            case R.id.toast:
                //Going to another Activity (using Intent) - Explicit Intent
                Intent expIntent = new Intent(MainActivity.this, OtherActivity.class);
                //Fire the activity
                startActivity(expIntent);
                break;
            case R.id.showLocation:
                //Using Intent.ACTION_VIEW with geo tag to ope  maps
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:14.584264, 121.063438")); //"geo"is the specific needed for maps
                startActivity(mapIntent);
                break;
            case R.id.openWebPage:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")); //Needs the "https://(specific)"
                startActivity(browserIntent);
                break;
            case R.id.viewIntent:
                Intent intentView = new Intent(Intent.ACTION_VIEW);
                startActivity(intentView);
                break;
            case R.id.letsGoPro :
//                Intent myIntent = new Intent("com.example.reyanthonypaano.androiddevtutorial.OtherActivity");
//                startActivity(myIntent);

                Intent myIntent = new Intent(Intent.ACTION_VIEW);
                //adding "extra" that will be passed to the intent
                myIntent.putExtra("Key", "This is the Value..");
                startActivity(myIntent);
                break;

        }

      }
  }
