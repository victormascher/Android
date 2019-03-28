package br.com.fiap.componentesparte2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox selectBox;
    RadioGroup radioTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        selectBox = findViewById(R.id.selectBox);
        radioTimes = findViewById(R.id.radioTimes);
    }

    public void salvar(View view) {
       /* if(selectBox.isChecked() ){
            Toast.makeText(this, R.string.checkboxselect, Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Por favor selecione um CheckBox!", Toast.LENGTH_SHORT).show();

        }*/

        int id = radioTimes.getCheckedRadioButtonId();

        RadioButton rb = findViewById(id);

        if(rb != null){
            Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Selecione um time", Toast.LENGTH_SHORT).show();

        }





    }
}
