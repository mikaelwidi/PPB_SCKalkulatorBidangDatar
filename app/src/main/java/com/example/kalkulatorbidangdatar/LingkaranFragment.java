package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LingkaranFragment extends Fragment {

    private Button btnHasil_luas, btnHasil_keliling;
    private EditText txtJari;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lingkaran, container, false);
        btnHasil_luas = v.findViewById(R.id.btnHasil_luas);
        btnHasil_keliling = v.findViewById(R.id.btnHasil_keliling);
        txtJari = v.findViewById(R.id.txtJari);
        hasil = v.findViewById(R.id.hasil);

        btnHasil_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = txtJari.getText().toString();
                if(nilai.isEmpty()){
                    txtJari.setError("Data tidak boleh kosong");
                    txtJari.requestFocus();
                }else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = 3.14 * (jari * jari);
                    hasil.setText(String.format("%.2f", luas));
                }
            }
        });
        btnHasil_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai = txtJari.getText().toString();
                if(nilai.isEmpty()){
                    txtJari.setError("Data tidak boleh kosong");
                    txtJari.requestFocus();
                }else {
                    Double jari = Double.parseDouble(nilai);
                    Double keliling = 2 * 3.14 * jari;
                    hasil.setText(String.format("%.2f", keliling));
                }
            }
        });
        return v;
    }
}