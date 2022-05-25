package sg.edu.rp.c346.id21013643.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    TextView tvDouble1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        tvDouble1 = findViewById(R.id.textView5);
        Intent intentReceived3 = new Intent();
        double value3 = intentReceived3.getDoubleExtra("value", 99.99);
        tvDouble1.setText("Double value received is: " + value3);
    }
}