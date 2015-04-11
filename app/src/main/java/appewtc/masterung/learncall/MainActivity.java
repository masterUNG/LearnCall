package appewtc.masterung.learncall;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    //Explicit
    private int intMyIcon[];
    private String strPhoneNumber[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create ListView
        createListView();

    }   // onCreate

    private void createListView() {

        intMyIcon = new int[]{R.drawable.call_01, R.drawable.call_02, R.drawable.call_03, R.drawable.call_04,
                R.drawable.call_05, R.drawable.call_06, R.drawable.call_07, R.drawable.call_08, R.drawable.call_09,
                R.drawable.call_10, R.drawable.call_11, R.drawable.call_12, R.drawable.call_13, R.drawable.call_14,
                R.drawable.call_15, R.drawable.call_16};

        strPhoneNumber = new String[]{"1155", "1677", "1192", "191", "1669", "022821815", "199",
                "1129", "1584", "1195", "1125", "1188", "1556", "1808", "1193", "1860"};

        //Create Adapter

        MyAdapter objMyAdapter = new MyAdapter(getApplicationContext(), intMyIcon);

        //Create ListView
        ListView objListView = (ListView) findViewById(R.id.listView);
        objListView.setAdapter(objMyAdapter);

        //Active Click on ListView
        objListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("phone", "i ==> " + Integer.toString(i));

                showAlertDialog(i);

            }
        });

    }   // createListView

    private void showAlertDialog(final int intI) {

        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(intMyIcon[intI]);
        objBuilder.setMessage("Are You Sure to Call ?");
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                //Call
                Intent objIntent = new Intent(Intent.ACTION_DIAL);
                objIntent.setData(Uri.parse("tel:" + strPhoneNumber[intI]));
                startActivity(objIntent);

                Log.d("phone", "intI receive ==> " + Integer.toString(intI));
                Log.d("phone", "Call ==> " + strPhoneNumber[0]);

                dialogInterface.dismiss();
            }
        });
        objBuilder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }   // showAlertDialog


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemAboutMe:
                Intent objIntent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(objIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}   // Main Class
