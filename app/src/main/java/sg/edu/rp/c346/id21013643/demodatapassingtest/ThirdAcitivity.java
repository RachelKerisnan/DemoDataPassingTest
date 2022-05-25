package sg.edu.rp.c346.id21013643.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdAcitivity extends AppCompatActivity {


    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_acitivity);

        tvAnswer2 = findViewById(R.id.textView2);
        Intent intentReceived2 = new Intent();
        char value2 = intentReceived2.getCharExtra("value", 'a');
        tvAnswer2.setText("Character value received is: " + value2);

    }
}