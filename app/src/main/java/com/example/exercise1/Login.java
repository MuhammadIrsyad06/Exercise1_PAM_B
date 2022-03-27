package com.example.exercise1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

Button btLogin,btRegist;
EditText nama,pass;
String username,password;

    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        btLogin=findViewById(R.id.btLogin);
        btRegist=findViewById(R.id.btRgst);
        nama=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        btLogin.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                username=nama.getText().toString();
                password=pass.getText().toString();
                String email="Irsyad";
                String password="06092002";

                if
                (username.equals(email) && password.equals(password)) {
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
                    Bundle b = new Bundle();
                    b.putString("a",username.trim());
                    Intent i = new Intent(getApplicationContext(),Home.class);
                    i.putExtras(b);
                    startActivity(i);
                }
                else if (username.isEmpty()||password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Email dan Password tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                //Email Salah
                else if (password.equals(password)) {
                    //jika Email salah
                    Toast.makeText(getApplicationContext(), "Email salah", Toast.LENGTH_LONG).show();

                }
                //Password Salah
                else if (username.equals(email)) {
                    //jika Password salah
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();

                }
                //Email dan Password Salah
                else {
                    //jika email dan password salah
                    Toast.makeText(getApplicationContext(), "Email dan Password Salah", Toast.LENGTH_LONG).show();
                }

            }
        });
        btRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });
    }
}
