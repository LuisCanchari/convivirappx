package edu.cientifica.convivirapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import edu.cientifica.convivirapp.R;
import edu.cientifica.convivirapp.Service.UsuarioService;
import edu.cientifica.convivirapp.Service.UsuarioServiceImpl;
import edu.cientifica.convivirapp.model.Usuario;

public class LoginActivity extends AppCompatActivity {
Button btnIngresar;
EditText etUsername, etPassword;
Usuario usuario;
UsuarioService usuarioService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        etUsername = (EditText) findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        usuario = new Usuario();
        usuarioService =  new UsuarioServiceImpl();


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setPassword(etPassword.getText().toString());
                usuario.setUsername(etUsername.getText().toString());

                if (!usuarioService.validarUsuario(usuario)){
                    Toast.makeText(view.getContext(),"Usuario no Valido", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(view.getContext(),"Usuario Valido", Toast.LENGTH_LONG).show();

                    //Intent intent = new Intent(view.getContext(), ViviendasActivity.class);
                    //startActivity(intent);

                    //Intent intent;

                }

            }
        });

    }

}