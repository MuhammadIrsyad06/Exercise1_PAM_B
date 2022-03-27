package com.example.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Home extends AppCompatActivity {
    EditText edtMatkul, edtDl;
    TextView email;
    String matkul, deadline;
    FloatingActionButton fab;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        edtMatkul = findViewById(R.id.inputmatkul);
        edtDl = findViewById(R.id.waktu);
        fab = findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matkul = edtMatkul.getText().toString();
                deadline = edtDl.getText().toString();

                if (
                        edtMatkul.getText().toString().isEmpty() ||
                                edtDl.getText().toString().isEmpty()) {
                    Snackbar.make(view, "Wajib isi Semua Data!!", Snackbar.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Sukses Menyimpan Data!!", Toast.LENGTH_LONG).show();
                    Bundle b = new Bundle();
                    b.putString("a", matkul.trim());
                    b.putString("b", deadline.trim());
                    Intent i = new Intent(getApplicationContext(), hasil.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.sbmt)
        {
            Toast.makeText(getApplicationContext(), "Sukses Menyimpan Data!!", Toast.LENGTH_LONG).show();
            Bundle c = new Bundle();
            c.putString("a",matkul.trim());
            c.putString("b",deadline.trim());
            Intent i = new Intent(getApplicationContext(), hasil.class);
            i.putExtras(c);
            startActivity(i);
        }
        else {

            Intent i = new Intent(getApplicationContext(),Login.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
