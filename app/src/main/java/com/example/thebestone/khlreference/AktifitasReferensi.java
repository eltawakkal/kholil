package com.example.thebestone.khlreference;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.zip.Inflater;

/**
 * Created by thebestone on 28/02/18.
 */

public class AktifitasReferensi extends AppCompatActivity{

    ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actifitas_referensi);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showReference("Tayammum", tayammum);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showReference("Wudhu", wudhu);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showReference("Sholat", sholat);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showReference("Tentang Saya", about);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_referensi, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.action_tentang) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setView(R.layout.app_version);
            alert.setPositiveButton("Close", null);
            alert.create().show();
        }

        return true;
    }

    public void showReference(String judul, String pesan){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setCancelable(false);
        alert.setTitle(judul);
        alert.setMessage(pesan);
        alert.setPositiveButton("Oke", null);
        alert.create().show();
    }

    String tayammum =
            "Urutan Tayamum :\n" +
            "1. Membaca basmalah\n" +
            "2. Tempelkan kedua telapak tangan dengan \n" +
            "3. merengganggkan jari pada tanah atau debu\n" +
            "4. Angkat tangan mu dan tiup kedua telapak tangan yang sudah menempel pada debu, atau usapkan pada pakaian secara perlahan. ( Jika meniup, tiuplah kearah lain dari tempat mengambil debu )\n" +
            "5. Baca do’a atau niat tayamum.\n" +
            "6. Usapkan debu pada wajah.\n" +
            "7. Usapkan debu pada telapak tangan.\n" +
            "8. Ambil debu lagi dan lakukan seperti langkah ke 3 diatas.\n" +
            "Usapkan debu ke lengan kanan dan kiri.";
    String wudhu =
            "Urutan wudhu:\n" +
            "1. Mencuci / membasuh kedua telapak tangan tiga kali sambil membaca basmalah.\n" +
            "2. Membersihkan mulut dan lubang hidung, masing-masing sebanyak tiga kali.\n" +
            "3. Membasuh muka sebanyak tiga kali sambil mengucapkan doa niat wudhu.\n" +
            "4. Mencuci / membersihkan tangan kanan dan kiri, mulai dari ujung jari hingga pangkal / batas siku, masing-masing sebanyak tiga kali.\n" +
            "5. Mengusap kepala mulai dari dahi hingga batas rambut bagian atas sebanyak tiga kali.\n" +
            "6. Menyapu / membersihkan kedua telinga mulai bagian daun telinga bawah dan menuju bagian atas, sebanyak tiga kali.\n" +
            "7. Mencuci / membersihkan kaki kanan dan kiri, mulai dari ujung jari merata hingga mata kaki, masing-masing sebanyak tiga kali.\n" +
            "8. Membaca doa setelah wudhu.";
    String sholat =
            "Urutan sholat:\n" +
            "1. Niat\n" +
            "2. Berdiri menghadap kiblat\n" +
            "3. Takbiratul ikhram\n" +
            "4. Membaca Al-fatihah\n" +
            "5. Ruku\n" +
            "6. Ihtidal\n" +
            "7. Sujud\n" +
            "8. Duduk diantara dua sujud\n" +
            "9. Duduk tasyahud (tahiyat) akhir\n" +
            "10. Salam.";
    String about =
            "Nama    : Khalilurrahman\n" +
            "NIM     : 15112100\n" +
            "Jurusan : TAGK\n" +
            "TTL     : Balikpapan, 16 Des 96";

}
