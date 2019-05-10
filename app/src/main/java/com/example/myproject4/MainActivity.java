package com.example.myproject4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText Username;
    EditText Password;
    Button Login_Googlesignin;
    Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.Password);
        Login_Googlesignin = (Button) findViewById(R.id.Login_Googlesignin);
        Register = (Button) findViewById(R.id.Register);
        Login_Googlesignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User = Username.getText().toString();
                String Pass = Password.getText().toString();
                if (User.equals("") || Pass.equals("")) {
                    Toast.makeText(getApplicationContext(), "enter your Username and Password", Toast.LENGTH_LONG).show();
                } else if (User.equals("florien") && Pass.equals("12345")) {
                    Toast.makeText(getApplicationContext(), "login successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, Login_Googlesignin.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "invalid Username or Password ", Toast.LENGTH_LONG).show();

                }
            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });
    }
}
