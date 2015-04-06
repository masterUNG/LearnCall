package appewtc.masterung.learncall;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create ListView
        createListView();

    }   // onCreate

    private void createListView() {

        int intMyIcon[] = new int[]{R.drawable.call_01, R.drawable.call_02, R.drawable.call_03, R.drawable.call_04,
                R.drawable.call_05, R.drawable.call_06, R.drawable.call_07, R.drawable.call_08, R.drawable.call_09,
                R.drawable.call_10, R.drawable.call_11, R.drawable.call_12, R.drawable.call_13, R.drawable.call_14,
                R.drawable.call_15, R.drawable.call_16};

        //Create Adapter
        MyAdapter objMyAdapter = new MyAdapter(getApplicationContext(), intMyIcon);

        //Create ListView
        ListView objListView = (ListView) findViewById(R.id.listView);
        objListView.setAdapter(objMyAdapter);

    }   // createListView


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}   // Main Class
