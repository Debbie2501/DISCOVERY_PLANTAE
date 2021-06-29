package com.firstapp.discovery_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ornamental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ornamental);
    }

    public void btno1(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "FIBER OPTIC GRASS";
        intent11.putExtra("NAME", name);
        String sname = "ISOLEPUS CERNUA";
        intent11.putExtra("SNAME", sname);
        String origin = "Western and southern Europe British isles north Africa " +
                "the west coast or North America,Australia and New Zealand ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " It will die if you put in a dry pot or if you left it dry. ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "always hose a water.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno2(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "SNAKE PLANT";
        intent11.putExtra("NAME", name);
        String sname = "DRACAENA TRIFASCIATA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to tropical west Africa from Nigeria east to the Congo.";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "The most common disease will be a root rot due to over watering.";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Water less and report into fresh soil to allow the roots to dry put. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno3(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "STRING OF PEARLS";
        intent11.putExtra("NAME", name);
        String sname = "SENECIO ROWLEYANUS";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Southwestern Africa ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Over watering, under watering, wrong potting mix, improper sunlight, and insect or pests.";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Water less, use an insecticidal soap or a spray of water to remove insects. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno4(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "PEACE LILY";
        intent11.putExtra("NAME", name);
        String sname = "SPATHIPHYLLUM";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in tropical rainforests of Columbia and Venezuela. ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Cylindrocladium root rot, dasheen mosaic virus, leaf blight and pythium root rot. ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Often times cleaning off the roots and reporting the plant in fresh, healthy soil will help.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno5(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "MONEY PLANT";
        intent11.putExtra("NAME", name);
        String sname = "PILEA PEPEROMIODES";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to the Yunnan province of China.";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Over watering, nitrogen deficiency white-flies and alphids";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " make sure you are watering only the top inch of the soil and make sure your pot has drainage holes. " +
                "Give a high nitrogen nutrients formula and adding a regular dose of an amino acid supplements. " +
                "Use an insect killing soap to stop the white-lies. Spray the foliage with neem oil and keep using it for 5 to 7 days later. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno6(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "AIR PLANT";
        intent11.putExtra("NAME", name);
        String sname = "TILLANSIA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in  native to west indies Mexico and much of central America, " +
                "southern America California, Florida, Georgia,Louisiana and Texas. ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Air plants are vulnerable to rot and fungus, this plant don’t welcome extreme or sudden changes or temperature ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "It prefer bright, indirect light, placed it near a natural light source that receives light for most of the day. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno7(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "WATER BAMBOO";
        intent11.putExtra("NAME", name);
        String sname = "DRACAENA SANDERIANA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in native to Central Africa ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Fungal spots, bamboo mosaic virus, sooty mold and rot issue ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Remove bamboo mold, white spores and mildew with a soft brush and clean up the area with a damp cloth. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btn08(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "SILVER NERVE";
        intent11.putExtra("NAME", name);
        String sname = "FITTONIA ALBIVENIS";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to tropical rainforest in South Africa and Peru";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Sensitive to strong, direct sunlight that quickly suffer from leaf burn, prone to collapse if its allowed to dry out ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "keeping the plant appropriately moist can be a challenge, it allow to stagnate in water to develop yellow and limp leaves.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno9(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "BONSAI";
        intent11.putExtra("NAME", name);
        String sname = "JUNIPERUS CHINENSIS SHIMPAKU";
        intent11.putExtra("SNAME", sname);
        String origin = "The art of bonsai associated with Japan but is actually first in china and then spread eastward to Korea. ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Black spot, leaf spot, mould or mildew, rust, chlorosis, root rot and scab or canker diseases. ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Use a pesticide such as koinor as a soil drench to prevent many common pests and you may also use Kemprin or bungy.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btno10(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "EAR CACTUS";
        intent11.putExtra("NAME", name);
        String sname = "OPUNTIA MICRODASYS";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Mexico ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Insects, pad tips shrivelling, brown patches, its not growing. ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Put in the location that receives a lot of bright sunlight, during the growing season, water your bunny ear cactus";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }
}