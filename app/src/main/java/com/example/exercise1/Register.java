package com.example.exercise1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class Register extends AppCompatActivity {
    EditText rgNama,rgEmail,rgPass,rgRepass;
    Button btnRgs;
    String nama,email,pass,repass;

    @Override
    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        rgNama = findViewById(R.id.inputnama);
        rgEmail = findViewById(R.id.inputemail);
        rgPass = findViewById(R.id.inputpw);
        rgRepass = findViewById(R.id.inputpw2);
        btnRgs = findViewById(R.id.btnregis);

        btnRgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama=rgNama.getText().toString();
                email=rgEmail.getText().toString();
                pass=rgPass.getText().toString();
                repass=rgRepass.getText().toString();

                if(
                        rgNama.getText().toString().length()
                                ==0){
                            rgNama.setError("Masukkan Nama..");

                }
                if(
                        rgEmail.getText().toString().length()
                                ==0) {
                    rgEmail.setError("Masukkan Email..");
                }
                if(
                        rgPass.getText().toString().length()
                                ==0) {
                    rgPass.setError("Masukkan Password..");
                }
                if(
                        rgRepass.getText().toString().length()
                                ==0) {
                    rgRepass.setError("Masukkan Ulang Password..");
                }
                else {
                    if(rgPass.getText().toString().equals(rgRepass.getText().toString())){
                        Toast.makeText(getApplicationContext(),"Pendaftaran Berhasil",Toast.LENGTH_LONG).show();
                        Bundle b = new Bundle();
                        b.putString("a",nama.trim());

                        Intent i = new Intent(getApplicationContext(),Home.class);
                        i.putExtras(b);
                        startActivity(i);
                    }
                    else{
                        Snackbar.make(view,"Password dan Re-Password Harus sama!!!",Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
