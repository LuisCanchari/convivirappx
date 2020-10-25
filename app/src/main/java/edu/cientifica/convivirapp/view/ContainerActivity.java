package edu.cientifica.convivirapp.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import edu.cientifica.convivirapp.R;
import edu.cientifica.convivirapp.view.fragments.ComunicadosFragment;
import edu.cientifica.convivirapp.view.fragments.EstadoCuentaFragment;
import edu.cientifica.convivirapp.view.fragments.GastosFragment;
import edu.cientifica.convivirapp.view.fragments.HomeFragment;
import edu.cientifica.convivirapp.view.fragments.ResidentesFragment;
import edu.cientifica.convivirapp.view.fragments.ViviendasFragment;

import static edu.cientifica.convivirapp.R.id.bnvMenu;
import static edu.cientifica.convivirapp.R.id.fragContent;

public class ContainerActivity extends AppCompatActivity {
    //private final static NavController navController;

    private BottomNavigationView bottomNavigationView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        bottomNavigationView = (BottomNavigationView)findViewById(bnvMenu);

        final NavController navController = Navigation.findNavController(this, fragContent);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                navController.navigate(item.getItemId());
                Toast.makeText(getApplicationContext(), "Valor: "+ item.getTitle(), Toast.LENGTH_SHORT).show();

                return true;
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }


}