package com.ounce.dell.yu_gi_oh_crazyrules;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends ActionBarActivity {

    Button btAleatorio;
    String modos;
    TextView tvModo;
    List<String> num;
    AdView ad1,ad2;
    AdRequest adR,adR2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tvModo = (TextView) findViewById(R.id.tvModo);
        tvModo.setText("");
        //BANNER
        ad1 = (AdView) findViewById(R.id.adView);
        adR = new AdRequest.Builder().build();
        ad1.loadAd(adR);

        ad2 = (AdView) findViewById(R.id.adView2);
        adR2 = new AdRequest.Builder().build();
        ad2.loadAd(adR2);
    }
    public void nuevoModo(View view){
        switch (numeroAleatorio()){
            case "0":
            tvModo.setText(R.string.funebre);
                ponerImagen(R.drawable.arte_del_espiritu_oscuro_codicia);
                break;
            case "1":
                tvModo.setText(R.string.rai_oh);
                ponerImagen(R.drawable.arte_espiritual_de_la_luz_hijiri);
                break;
            case "2":
                tvModo.setText(R.string.drenaje_de_habilidad);
                ponerImagen(R.drawable.arte_espiritual_de_la_tierra_kurogane);
                break;
            case "3":
                tvModo.setText(R.string.muralla);
                ponerImagen(R.drawable.arte_espiritual_del_agua_aoi);
                break;
            default:
                tvModo.setText(R.string.area_a);
                ponerImagen(R.drawable.arte_espiritual_del_fuego_kurenai);
                break;

        }
    }
    public void ponerImagen(int foto) {
        Resources res = getResources(); //resource handle
        Drawable drawable = res.getDrawable(foto); //new Image that was added to the res folder
        RelativeLayout relativeLayout=   (RelativeLayout)findViewById(R.id.main);
        relativeLayout.setBackgroundDrawable(drawable);
    }
    private String numeroAleatorio(){
        num = new ArrayList<>();
        num.add("0");
        num.add("1");
        num.add("2");
        num.add("3");
        num.add("4");
        num.add("5");
        num.add("6");
        num.add("7");
        num.add("8");
        num.add("9");
        num.add("10");


        Random aleatorio = new Random();
        return num.get(aleatorio.nextInt(num.size()));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
