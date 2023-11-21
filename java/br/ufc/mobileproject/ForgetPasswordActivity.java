package br.ufc.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ForgetPasswordActivity extends AppCompatActivity {

    private TextView CadastroLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        CadastroLogin = ( TextView ) findViewById( R.id.txtViewCadastroLogin );

        CadastroLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( ForgetPasswordActivity.this, LoginActivity.class ) );
                finish();
            }
        });
    }
}