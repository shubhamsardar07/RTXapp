package rtxindia.com.rtxapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.Spinner;

public class FormActivity extends AppCompatActivity {

    Spinner spinner,spinner2,spinner3;
    NumberPicker nMax,nMin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        setTitle("Place Order");

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        spinner = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);

        nMax = (NumberPicker)findViewById(R.id.numberPicker1);
        nMax.setMinValue(0);
        nMax.setMaxValue(30);
        nMin = (NumberPicker)findViewById(R.id.numberPicker);
        nMin.setMinValue(0);
        nMin.setMaxValue(30);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, new String[]{"Tata Ace","Tata 407","14ft","17ft","19ft","6 Tyre Tauraus",
                "10 Tyre Tauraus", "12 Tyre Tauraus","32 ft Single Axel","32 ft Single Axel"});
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, new String[]{"Open Body","Closed Container"});
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, new String[]{"Day","Week","Month"});
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_form, menu);
        return true;
    }
}
