package sg.edu.rp.c346.id21013643.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button getBtnPassChar;
    TextView tvDouble;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger = findViewById(R.id.buttonPassInteger);
        getBtnPassChar = findViewById(R.id.buttonPassChar);
        tvDouble = findViewById(R.id.textViewDouble);

        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Value", 1);
                startActivity(intent);
            }
        });

        getBtnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ThirdAcitivity.class);
                intent2.putExtra("Value", 'a');
                startActivity(intent2);
            }
        });

        tvDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(MainActivity.this, LastActivity.class);
                intent3.putExtra("Value", 99.99);
                startActivity(intent3);
            }
        });

    }
}