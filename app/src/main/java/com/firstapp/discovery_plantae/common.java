package com.firstapp.discovery_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class common extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
    }

    public void btnd1(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "KALACHUCHI";
        intent11.putExtra("NAME", name);
        String sname = " Plumeria";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to Central and South America ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " fungus (Coleosporium plumeriae)";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " mix 1 tbsp. of baking power, 1/4 tsp neem oil and last is Dr. " +
                "Bronners peperment soap. Shake and pay on the leaves who is affected by fungus.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd2(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "COLEUS BLUMEI";
        intent11.putExtra("NAME", name);
        String sname = "Coleus scutellarioides";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in  Southeast Asia through to Australia. ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Downy mildew, pests and rot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " fungicides";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd3(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "RATTAN";
        intent11.putExtra("NAME", name);
        String sname = " Calamus rotang";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Africa, Asia and Australia but it predominantly grows in Indonesia ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Bipolaris ellisii, Colletotrichum gloeosporioides, Corynespora cassiicola, Fusarium longipes, Guignardia calami, \n";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " treating stains, eliminating any mildew, and cleaning with detergent suds, allow the rattan to dry completely.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd4(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "SAMPAGUITA";
        intent11.putExtra("NAME", name);
        String sname = "Jasminum sambac";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in  Southwestern and Southern Asiaand Himalayas. ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Fusarium wilt and rust ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " fungicides or baking soda in the water.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd5(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "CALADIUM";
        intent11.putExtra("NAME", name);
        String sname = "Caladium";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in South America and Latin America from southern Mexico to Peru ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Fusarium and Pythium";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " immerse hot water.`";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd6(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "ABACA";
        intent11.putExtra("NAME", name);
        String sname = " Musa textilis";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Philippines ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " aphids ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "sprayed of leaf discs\n";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd7(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "PALM";
        intent11.putExtra("NAME", name);
        String sname = "Arecaceae";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in India, Northern Africa, regions of Southeast Asia," +
                " and the South Pacific Islands ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " leaf spots, lase snuts and but rot ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Apply fungicides, remove all the infected palm fronds and avoid overhead irrigation. \n";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd8(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "CASSAVA ";
        intent11.putExtra("NAME", name);
        String sname = " Manihot esculenta";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Brazil and eastern Bolivia ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " mosaic disease";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "remove all the infected parts";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnd9(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "TOBACCO";
        intent11.putExtra("NAME", name);
        String sname = " Nicotiana";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Mesoamerica and South America ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "black root rot, Fusarium wilt, mosaic virus, downy mildew and broomrape";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " remove and destroy any infected plants";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btn10(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "UBE";
        intent11.putExtra("NAME", name);
        String sname = "Dioscorea alata";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Southeast Asia ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "mosaic potyvirus";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "remove all the infected parts of the plants";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }
}