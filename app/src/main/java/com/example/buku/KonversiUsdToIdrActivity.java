package com.example.buku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class KonversiUsdToIdrActivity extends AppCompatActivity {

    EditText inputUsd;
    TextView hasil ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_usd_to_idr);

        inputUsd = (EditText) findViewById(R.id.txtUsd);
        hasil = (TextView) findViewById(R.id.ViewIdr);
    }

    public void onClickCalculateEvent(View view){
        if (inputUsd.getText().toString().isEmpty()){
            Toast.makeText(this, "masukan jumlah usd", Toast.LENGTH_SHORT).show();
        }else if (inputUsd != null){
            double usd = Double.parseDouble(inputUsd.getText().toString());
            double hitungIdr = usd * 13993;
            //hasil.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hitungIdr));
            hasil.setText("Rp " + hitungIdr);
        }
    }
}