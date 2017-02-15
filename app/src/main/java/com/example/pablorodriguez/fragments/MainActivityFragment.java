package com.example.pablorodriguez.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Button boton;
    TextView textoVista;
    public static final int CODIGO = 1;
    public MainActivityFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vistaFrag1 = inflater.inflate(R.layout.fragment_main, container, false);

        boton = (Button) vistaFrag1.findViewById(R.id.boton);
        textoVista = (TextView) vistaFrag1.findViewById(R.id.texto);


        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(getActivity(), Main2Activity.class);
                i.putExtra("Activity1", "Estamos en la activity 1");

                startActivityForResult(i, CODIGO);
            }
        });

        return vistaFrag1;

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);

        if (requestCode == CODIGO) {

            if (resultCode == RESULT_OK) {

                String result = data.getStringExtra("Activity2");
                textoVista.setText(result);

            }

        }
    }
}