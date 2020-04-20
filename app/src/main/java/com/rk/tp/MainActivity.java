package com.rk.tp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TimePicker TP_1_IDJAVA;
    TextView TV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TP_1_IDJAVA = findViewById(R.id.TP_1_IDXML);
        TV_1_IDJAVA = findViewById(R.id.TV_1_IDXML);

        TP_1_IDJAVA.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                TV_1_IDJAVA.setText(hourOfDay + " - " + minute);
            }
        });

    }
}
