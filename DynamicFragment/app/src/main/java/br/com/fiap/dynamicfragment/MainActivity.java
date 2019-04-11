package br.com.fiap.dynamicfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void alterarBanner1(View view) {

        alterar(new Banner1Fragment());

    }

    public void alterarBanner2(View view) {

       alterar(new Banner2Fragment());
    }

    public void alterar(Fragment fragment){

        getSupportFragmentManager().beginTransaction().replace(R.id.staticfragment, fragment)
                .addToBackStack(null)
                .commit();

    }
}
