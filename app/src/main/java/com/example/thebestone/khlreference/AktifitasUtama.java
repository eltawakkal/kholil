package com.example.thebestone.khlreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AktifitasUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktifitas_utama);

        final EditText editNamaPengguna;
        final EditText editSandiPengguna;
        Button btnLogin;

//        inisialisasi
        editNamaPengguna = findViewById(R.id.editNamaP);
        editSandiPengguna = findViewById(R.id.editSandiP);
        btnLogin = findViewById(R.id.btnLogin);

//        kejadian ketika tombol login di kllik
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                mengambil data dari edit text nama pengguna dan sandi pengguna
                String pengguna = editNamaPengguna.getText().toString();
                String sandi = editSandiPengguna.getText().toString();

//                cek nama pengguna dan sandi
                if (pengguna.equals("kholil") && sandi.equals("kholil123")) {
//                    jika pengguna = kholil dan sandinya = kholil123 maka buka aktifitas referensi
                    Intent intent = new Intent(AktifitasUtama.this, AktifitasReferensi.class);
//                    mengirim data dari inputan user ke aktifitas referensi
                    intent.putExtra("user", pengguna);
//                    buka aktifitas referensi
                    startActivity(intent);
                } else if(pengguna.equals("admin") && sandi.equals("admin")){
//                    jika pengguna = admin dan sandinya = admin maka buka aktifitas referensi
                    Intent intent = new Intent(AktifitasUtama.this, AktifitasReferensi.class);
//                    mengirim data dari inputan user ke aktifitas referensi
                    intent.putExtra("user", pengguna);
//                    buka aktifitas referensi
                    startActivity(intent);
                } else {
//                    kalau kedua user menginputkan user dan sandi selain kedua data diatas maka sistem menam
//                    pilkan pesan pengguna tidak dikenal
                    Toast.makeText(AktifitasUtama.this, "Upss, Pengguna atau sandi tidak dikenal", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
