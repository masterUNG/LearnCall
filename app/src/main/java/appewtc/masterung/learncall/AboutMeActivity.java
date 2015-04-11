package appewtc.masterung.learncall;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class AboutMeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }   // onCreate

    public void clickAndroid(View view) {
        Intent androidIntent = new Intent(Intent.ACTION_VIEW);
        androidIntent.setData(Uri.parse("http://androidthai.in.th/about-me.html"));
        startActivity(androidIntent);
    }

    public void clickKbank(View view) {
        Intent kBankIntent = new Intent(Intent.ACTION_DIAL);
        kBankIntent.setData(Uri.parse("tel:028888888"));
        startActivity(kBankIntent);
    }

}   // Main Class
