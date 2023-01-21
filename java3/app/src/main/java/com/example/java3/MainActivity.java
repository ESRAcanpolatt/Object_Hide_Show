package com.example.java3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    ImageView grs; //RESİMLERİ UYGULAMA İÇİNDE GÖSTERMEYİ SAĞLAR.
    Button gst;//GST ADINDA BUTON TANIMLADIM.
    Button gzl; //GZL ADINDA BUTON TANIMLADIM.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //BİR AKTİVİTE BAŞLATILDIĞINDA ARKA PLANDA DEVREYE GİREN İLK METOD.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grs = (ImageView)findViewById(R.id.grs1);
        //RESMİ RES DOSYASININ ALTINDAKİ DRAWBLE KISMINDA DOSYAYI BULMAYI SAĞLAR.
        gst = (Button)findViewById(R.id.bas2);
        //BAS2 Yİ KODDA HIZLI BULMAMIMIZI SAĞLAR.
        //GST BUTONUNA BAS2 Yİ ATADIM.
        gzl = (Button)findViewById(R.id.bas1);
        //BAS1 İ KODDA HIZLI BULMAMIZI SAĞLAR.
        //GZL BUTONUNA BAS1 Yİ ATADIM.
        gzl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //onCLİCK BUTONA AKTİF BİR ŞEKİLDE BASMAYI SAĞLAR.
                grs.setVisibility(View.INVISIBLE);
                //RESMİ KODDA SAKLAR.
                gzl.setVisibility(View.INVISIBLE);
                //INVISIBLE KODDA GÖRÜNMEMEYİ SAĞLAR.
                gst.setVisibility(View.VISIBLE);
                //VISIBLE GÖRÜNMEYİ SAĞLAR.
                //GÖSTER BUTONUNU KODDA GÖSTERMEYİ SAĞLADI.
            }
        });
        gst.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                grs.setVisibility(View.VISIBLE);
                gst.setVisibility(View.INVISIBLE);
                gzl.setVisibility(View.VISIBLE);
            }
        });
    }
}



