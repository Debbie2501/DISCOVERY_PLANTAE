package com.firstapp.discovery_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class medicinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicinal);
    }

    public void btnmd1(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "BAYABAS";
        intent11.putExtra("NAME", name);
        String sname = "PSIDIUM GUAJAVA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to Southern Mexico. ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Algal leaf spot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Ensure trees receive adequate fertilization, " +
                "irrigation and and are properly pruned to avoid stress on the plants and promote air circulation through the canopy";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd2(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "BANABA";
        intent11.putExtra("NAME", name);
        String sname = "ABELMOSCHUS ESCULENTUS";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Africa";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Charcoal Rot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Rotate to non-host to reduce build up of inoculum in the soil.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd3(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "MAYANA";
        intent11.putExtra("NAME", name);
        String sname = "COLEUS SCUTELLARIODES";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to southeast Asia through to Australia.";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "sometimes attacked by mealy bugs, which resemble bits of white fuzz, " +
                "though they may also be infested with whiteflies, aphids, spider mites and slugs,";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Cut the affected leaves so that it cannot spread.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd4(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "LAGUNDI";
        intent11.putExtra("NAME", name);
        String sname = "VITEX NEGUNDO";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in native to tropical Eastern and Southern Africa and Asia.";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "No common disease";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "No serious insect or disease problems. Leaf spot and root rot occasionally affect stressed plants." +
                " It may suffer from frost damage during cold winters.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd5(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "OREGANO";
        intent11.putExtra("NAME", name);
        String sname = "COLEUS AROMATICUS";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Africa";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Fungal insect mites";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Infected plants and rhizomes should be removed to prevent spread; heat treatment of roots may help to control the disease  check transplants for aphids before planting;\" +\n" +
                "     \"use tolerant varieties if available; reflective mulches such as silver colored plastic can deter aphids from feeding on plant\";";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd6(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "FUKIEN TEA TREE";
        intent11.putExtra("NAME", name);
        String sname = "CARMONA RETUSA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to parts of Japan, Indonesia, Taiwan, and Australia";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Discoloration of leaves, fuzzy spots, and swollen barks.";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "It is vital to treat the tree with anti-fungal medication and prune the affected leaves," +
                " To prevent the whole plant from being affected, you should cut the infected part of branches. " +
                "Cut paste can be used to encourage healthy healing.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd7(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "BIGNAY";
        intent11.putExtra("NAME", name);
        String sname = " RIBES NIGRUM";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to northern Europe and Asia.";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Anthracnose, leaf spot, and powdery mildew and mosaic.";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Disinfecting the tools that are used in grafting, shuffling and tagging, " +
                "Cutting and burning the attacked sprouts and Burning the attacked organs";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd8(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "MULBERRY";
        intent11.putExtra("NAME", name);
        String sname = "MORUS NIGRA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in western Asia (Iran and Afghanistan) and china";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Sooty canker, Armillaria root rot and Bacterial blight";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Providing adequate irrigation, fertilization and insect control; applications of fungicides is not recommended on infected trees.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd9(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "YERBA BUENA";
        intent11.putExtra("NAME", name);
        String sname = "MENTHA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Native to Eurasia, North America, southern Africa, and Australia";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Aphids, spider mites, cutworms and mint root borers";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Clean out any plant debris, ridding the worms of a cozy place to hide. " +
                "Then spread diatomaceous earth around the base of the mint plants.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnmd10(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "DALANDAN";
        intent11.putExtra("NAME", name);
        String sname = "CITRUS X AURANTARIUM";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in China";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Citrus canker";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Providing enough water but ensuring good drainage too.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }
}