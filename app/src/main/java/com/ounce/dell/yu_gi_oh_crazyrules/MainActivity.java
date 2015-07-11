package com.ounce.dell.yu_gi_oh_crazyrules;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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

    Animation moveLeft, moveRigth, moveUp, moveDown;
    Animation respiracion, moveUpPlay, locura;
    Animation openbt, closebt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tvModo = (TextView) findViewById(R.id.tvModo);
        tvModo.setText("");
        ponerImagen(R.drawable.backcard);
        //BANNER
        ad1 = (AdView) findViewById(R.id.adView);
        adR = new AdRequest.Builder().build();
        ad1.loadAd(adR);

        ad2 = (AdView) findViewById(R.id.adView2);
        adR2 = new AdRequest.Builder().build();
        ad2.loadAd(adR2);
    }
    public void nuevoModo(View view){
        moveDown = AnimationUtils.loadAnimation(this, R.anim.movedown);
        tvModo.startAnimation(moveDown);
        switch (numeroAleatorio()){
            case "0":
            tvModo.setText(R.string.funebre);
                ponerImagen(R.drawable.cancion_funebre_de_estigia);
                break;
            case "1":
                tvModo.setText(R.string.rai_oh);
                ponerImagen(R.drawable.trueno_raioh);
                break;
            case "2":
                tvModo.setText(R.string.muralla);
                ponerImagen(R.drawable.muralla_de_hierro_imperial);
                break;
            case "3":
                tvModo.setText(R.string.drenaje_de_habilidad);
                ponerImagen(R.drawable.drenaje_de_habilidad);
                break;
            case "4":
                tvModo.setText(R.string.gravedad);
                ponerImagen(R.drawable.atar_a_la_gravedad);
                break;
            case "5":
                tvModo.setText(R.string.vanity);
                ponerImagen(R.drawable.vanity);//
                break;
            case "6":
                tvModo.setText(R.string.cuidador_de_tumbas);
                ponerImagen(R.drawable.servidor_del_cuidador_de_tumbas);
                break;
            case "7":
                tvModo.setText(R.string.macro);
                ponerImagen(R.drawable.macro_cosmos_ocg);
                break;
            case "8":
                tvModo.setText(R.string.pierde1turno);
                ponerImagen(R.drawable.pierde_1_turno);
                break;
            case "9":
                tvModo.setText(R.string.area_a);
                ponerImagen(R.drawable.limite_de_nivel_area_a);
                break;
            case "10":
                tvModo.setText(R.string.area_b);
                ponerImagen(R.drawable.limite_de_nivel_area_b);
                break;
            case "11":
                tvModo.setText(R.string.limite);
                ponerImagen(R.drawable.limite_a_la_invocacion);
                break;
            case "12":
                tvModo.setText(R.string.mostrar);
                ponerImagen(R.drawable.backcard);
                break;
            case "13":
                tvModo.setText(R.string.intercambio_ataque);
                ponerImagen(R.drawable.backcard);
                break;
            case "14":
                tvModo.setText(R.string.descarte);
                ponerImagen(R.drawable.backcard);
                break;
            case "15":
                tvModo.setText(R.string.no_magias);
                ponerImagen(R.drawable.backcard);
                break;
            case "16":
                tvModo.setText(R.string.no_trampas);
                ponerImagen(R.drawable.backcard);
                break;
            case "17":
                tvModo.setText(R.string.no_extra);
                ponerImagen(R.drawable.backcard);
                break;
            case "18":
                tvModo.setText(R.string.vanity_mano);
                ponerImagen(R.drawable.backcard);
                break;
            case "19":
                tvModo.setText(R.string.vanity_cementerio);
                ponerImagen(R.drawable.backcard);
                break;
            case "20":
                tvModo.setText(R.string.skill_battle);
                ponerImagen(R.drawable.backcard);
                break;
            case "21":
                tvModo.setText(R.string.no_set);
                ponerImagen(R.drawable.backcard);
                break;
            case "22":
                tvModo.setText(R.string.solo1);
                ponerImagen(R.drawable.backcard);
                break;
            case "23":
                tvModo.setText(R.string.draw2);
                ponerImagen(R.drawable.backcard);
                break;
            case "24":
                tvModo.setText(R.string.quemadura);
                ponerImagen(R.drawable.backcard);
                break;
            case "25":
                tvModo.setText(R.string.deckvoletado);
                ponerImagen(R.drawable.backcard);
                break;
            case "26":
                tvModo.setText(R.string.sin_defensas);
                ponerImagen(R.drawable.backcard);
                break;
            case "27":
                tvModo.setText(R.string.sin_ataque);
                ponerImagen(R.drawable.backcard);
                break;
            case "28":
                tvModo.setText(R.string.renacer);
                ponerImagen(R.drawable.backcard);
                break;
            case "29":
                tvModo.setText(R.string.sacrifica);
                ponerImagen(R.drawable.backcard);
                break;
            case "30":
                tvModo.setText(R.string.sniper);
                ponerImagen(R.drawable.backcard);
                break;
            case "31":
                tvModo.setText(R.string.un_ataque);
                ponerImagen(R.drawable.backcard);
                break;
            default:
                tvModo.setText(R.string.area_a);
                ponerImagen(R.drawable.backcard);
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
        num.add("11");
        num.add("13");
        num.add("14");
        num.add("15");
        num.add("16");
        num.add("17");
        num.add("18");
        num.add("19");
        num.add("20");
        num.add("21");
        num.add("22");
        num.add("23");
        num.add("24");
        num.add("25");
        num.add("26");
        num.add("27");
        num.add("28");
        num.add("29");
        num.add("30");
        num.add("31");

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
