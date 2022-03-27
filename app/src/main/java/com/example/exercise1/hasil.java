package com.example.exercise1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class hasil extends AppCompatActivity {
    TextView txMatkul,txDl;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txMatkul=findViewById(R.id.hasilmk);
        txDl=findViewById(R.id.hasildl);
        Bundle bundle=getIntent().getExtras();
        String mata=bundle.getString("a");
        String deadLine=bundle.getString("b");
        txMatkul.setText(mata);
        txDl.setText(deadLine);


    }
}
