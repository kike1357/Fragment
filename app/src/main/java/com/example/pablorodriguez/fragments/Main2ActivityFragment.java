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
public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vistaFrag2=inflater.inflate(R.layout.fragment_main2, container, false);

        TextView texto2=(TextView)vistaFrag2.findViewById(R.id.textoFrag2);
        String str=getActivity().getIntent().getStringExtra("Activity1");

        texto2.setText(str);
        Button botonEnviar=(Button)vistaFrag2.findViewById(R.id.botonFrag2);

        botonEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intnt=new Intent();
                intnt.putExtra("Activity2","Estamos en la activity 2");
                getActivity().setResult(RESULT_OK,intnt);
                getActivity().finish();

            }
        });

        return vistaFrag2;
    }
}
