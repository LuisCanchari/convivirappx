package edu.cientifica.convivirapp.Service;

import android.util.Log;

import edu.cientifica.convivirapp.model.Usuario;

public class UsuarioServiceImpl implements  UsuarioService{

    @Override
    public boolean validarUsuario(Usuario usuario) {
        Log.d("Validar Usuario", usuario.getUsername() + " " + usuario.getPassword());
        if (usuario == null){
            return  false;
        } else{
            if (usuario.getUsername().equals("Luis")){
                if(usuario.getPassword().equals("Secreto")){
                    return  true;
                }
            }
        }
        return false;
    }
}
