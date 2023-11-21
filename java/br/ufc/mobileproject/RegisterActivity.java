package br.ufc.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.ufc.mobileproject.R;

public class RegisterActivity extends AppCompatActivity {

    private TextView txtViewCancel, txtViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtViewCancel = ( TextView ) findViewById( R.id.txtViewCancelRegister );
        txtViewLogin = ( TextView ) findViewById( R.id.txtViewLoginCadastro );

        txtViewCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( RegisterActivity.this, LoginActivity.class ) );
                finish();
            }
        });
    }
}