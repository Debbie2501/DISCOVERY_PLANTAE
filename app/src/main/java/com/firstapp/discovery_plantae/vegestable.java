package com.firstapp.discovery_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vegestable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegestable);
    }

    public void btnf1(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "OKRA";
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

    public void btnf2(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "BOTTLE GOURD";
        intent11.putExtra("NAME", name);
        String sname = "LAGENARIA SICERARIA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Africa";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Alligator skin";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "An insecticidal soap or neem oil on effected gourd plants can help to control squash bugs.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnf3(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "BITTER GOURD";
        intent11.putExtra("NAME", name);
        String sname = "MOMORDICA CHARANTIA";
        intent11.putExtra("SNAME", sname);
        String origin = "Burma Region";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "C Cookie";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Excellent control of the disease can achieved with Ridomol which must be used simultaneously with a protectant fungicide such as " +
                "Mancozeb to prevent development of resistant strains.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnf4(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "YARD-LONG-BEANS";
        intent11.putExtra("NAME", name);
        String sname = "VIGNA UNGUICULATA";
        intent11.putExtra("SNAME", sname);
        String origin = "South West China";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Bean Weevil";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "planting weevil free seeds, fumigation of infected seeds, field sanitation";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnf5(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "EGGPLANT";
        intent11.putExtra("NAME", name);
        String sname = "SOLANUM MELONGENA";
        intent11.putExtra("SNAME", sname);
        String origin = "Southeast Asia";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Leaf Spot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "To control the disease then used mancozeb, copper formulations or chlorothainoil";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnf6(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "EGGPLANT";
        intent11.putExtra("NAME", name);
        String sname = "SOLANUM MELONGENA";
        intent11.putExtra("SNAME", sname);
        String origin = "Southeast Asia";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Leaf Spot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "To control the disease then used mancozeb, copper formulations or chlorothainoil";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);

    }

    public void btnf7(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "SQUASH";
        intent11.putExtra("NAME", name);
        String sname = "CUCURBITA MAXIMA";
        intent11.putExtra("SNAME", sname);
        String origin = "London";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Leaf Spot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "To control the disease then used mancozeb, copper formulations or chlorothainoil";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnf8(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "PECHAY";
        intent11.putExtra("NAME", name);
        String sname = "BRASSICA BRIGSII";
        intent11.putExtra("SNAME", sname);
        String origin = "Australia";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Bacterial soft rot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Remove and destroy infected plants; avoid planting in poorly draining soil; rotate crops with corn, " +
                "small grains or grasses where possible; treat soil with an insecticide prior " +
                "to planting to reduce damage caused by grubs and larvae which promotes bacterial soft rot";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnf9(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "EGGPLANT";
        intent11.putExtra("NAME", name);
        String sname = "SOLANUM MELONGENA";
        intent11.putExtra("SNAME", sname);
        String origin = "Southeast Asia";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Leaf Spot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "To control the disease then used mancozeb, copper formulations or chlorothainoil";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btn10(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "JUTE";
        intent11.putExtra("NAME", name);
        String sname = "CORCHORUS OLITORIUS";
        intent11.putExtra("SNAME", sname);
        String origin = "Africa and Asia";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Stem Rot";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Start to treat root rot by removing the plant from the soil and washing the roots under running water. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }
}