package edu.co.icesi.clases2eco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    //Componentes de UI
    private Button clickBtn;
    private Button clickBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Referenciar
        clickBtn = findViewById(R.id.clickBtn);
        clickBtn2 = findViewById(R.id.clickBtn2);

        //Delegar la responsabilidad del click
        //clickBtn.setOnClickListener( this );
        //clickBtn2.setOnClickListener( this );

        //Delegarlo a un lambda


        clickBtn.setOnClickListener(
                (v)->{
                    Toast.makeText(this, "Alfa",Toast.LENGTH_LONG).show();
                }
        );

        clickBtn2.setOnClickListener(this::accionBoton2);




    }

    public void showFig(Paintable paintable) {
        //...
    }


    public void accionBoton2(View v){
        Toast.makeText(this, "Beta", Toast.LENGTH_LONG).show();


        new Thread(
                ()->{
                    int c = 0;
                    while(c<100){
                        c++;
                        //Imprimir el contador
                        Log.e(">>>",""+c);

                        //Dormir 500 ms
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }
        ).start();


    }


    public void onClick(View v) {
        //v es el boton que yo clickeé

        //Transformacion de View a Object
        Object obj = v;

        //Transformacion de View a Button
        if (v instanceof Button) {
            //Cast de variable
            Button button = (Button) v;
            //v.setText("Clickeado");
            button.setText("Clickeado");
        }

        if (v.equals(clickBtn)) {
            //Boton1
            Toast.makeText(this, "Click 1", Toast.LENGTH_SHORT).show();
        }
        if (v.equals(clickBtn2)) {
            //Boton2
            Toast.makeText(this, "Click 2", Toast.LENGTH_SHORT).show();
        }
    }

}