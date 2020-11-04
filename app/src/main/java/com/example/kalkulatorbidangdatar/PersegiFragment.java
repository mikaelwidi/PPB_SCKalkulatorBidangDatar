package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PersegiFragment extends Fragment {

    private Button btnHasil_luas, btnHasil_keliling;
    private EditText txtPanjang, txtLebar;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);
        btnHasil_luas = v.findViewById(R.id.btnHasil_luas);
        btnHasil_keliling = v.findViewById(R.id.btnHasil_keliling);
        txtLebar = v.findViewById(R.id.txtLebar);
        txtPanjang = v.findViewById(R.id.txtPanjang);
        hasil = v.findViewById(R.id.hasil);

        btnHasil_luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txtPanjang.getText().toString();
                String nilai2 = txtLebar.getText().toString();
                if(nilai1.isEmpty()){
                    txtPanjang.setError("Data tidak boleh kosong");
                    txtPanjang.requestFocus();
                }else if (nilai2.isEmpty()){
                    txtLebar.setError("Data tidak boleh kosong");
                    txtLebar.requestFocus();
                }else {
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);
                    Integer luas = panjang * lebar;
                    hasil.setText(String.valueOf(luas));
                }
            }
        });
        btnHasil_keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nilai1 = txtPanjang.getText().toString();
                String nilai2 = txtLebar.getText().toString();
                if(nilai1.isEmpty()){
                    txtPanjang.setError("Data tidak boleh kosong");
                    txtPanjang.requestFocus();
                }else if (nilai2.isEmpty()){
                    txtLebar.setError("Data tidak boleh kosong");
                    txtLebar.requestFocus();
                }else {
                    Integer panjang = Integer.parseInt(nilai1);
                    Integer lebar = Integer.parseInt(nilai2);
                    Integer keliling = 2*panjang + 2*lebar;
                    hasil.setText(String.valueOf(keliling));
                }
            }
        });
        return v;
    }
}