package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SegitigaFragment extends Fragment {

    private Button btnHasil_luas, btnHasil_keliling;
    private EditText txtAlas, txtTinggi;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);
        btnHasil_luas = v.findViewById(R.id.btnHasil_luas);
        btnHasil_keliling = v.findViewById(R.id.btnHasil_keliling);
        txtAlas = v.findViewById(R.id.txtAlas);
        txtTinggi = v.findViewById(R.id.txtTinggi);
        hasil = v.findViewById(R.id.hasil);

        btnHasil_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txtAlas.getText().toString();
                String nilai2 = txtTinggi.getText().toString();
                if(nilai1.isEmpty()){
                    txtAlas.setError("Data tidak boleh kosong");
                    txtAlas.requestFocus();
                }else if (nilai2.isEmpty()){
                    txtTinggi.setError("Data tidak boleh kosong");
                    txtTinggi.requestFocus();
                }else {
                    Double alas = Double.parseDouble(nilai1);
                    Double tinggi = Double.parseDouble(nilai2);
                    Double luas = 0.5 * alas * tinggi;
                    hasil.setText(String.format("%.2f", luas));
                }
            }
        });

        btnHasil_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txtAlas.getText().toString();
                String nilai2 = txtTinggi.getText().toString();
                if(nilai1.isEmpty()){
                    txtAlas.setError("Data tidak boleh kosong");
                    txtAlas.requestFocus();
                }else if (nilai2.isEmpty()){
                    txtTinggi.setError("Data tidak boleh kosong");
                    txtTinggi.requestFocus();
                }else {
                    Integer alas = Integer.parseInt(nilai1);
                    Integer tinggi = Integer.parseInt(nilai2) ;
                    Integer keliling = alas * 3;
                    hasil.setText(String.valueOf(keliling));
                }
            }
        });
        return v;
    }
}