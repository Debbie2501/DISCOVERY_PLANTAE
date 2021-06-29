package com.firstapp.discovery_plantae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class flowering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowering);
    }

    public void btnm1(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "SUNFLOWER";
        intent11.putExtra("NAME", name);
        String sname = "HELIANTHUS";
        intent11.putExtra("SNAME", sname);
        String origin = "Native in North America";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Fungal, Bacterial head rot, Rhizopus head rot, Sclerotinia head rot, Charcoal rot, Downy mildew ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Warm temperatures with high humidity levels, Wet soils prior to bloom, Frequent wetness during or after bloom, " +
                "including rain, fog, heavy dew, Temperatures 85 F or below, Water stress (sandy soil, heat, drought, etc.), " +
                "Cool nights with dew or rain, Cold soils and rainfall shortly after planting leading to waterlogged soil";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm2(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "ORCHID";
        intent11.putExtra("NAME", name);
        String sname = "ORCHIDACEA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Antartica";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Fungal, foliar blights, leaf spots, fungal rots, and flower blights";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "cinnamon, which has antifungal propertie, Listerine mouth wash (original)," +
                " which is a fungicide and helps to battle some orchid diseases and inspecting the plant thoroughly before you even bring it home. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm3(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "BEGONIA";
        intent11.putExtra("NAME", name);
        String sname = "BEGONIA X SEMPERFLORENS CULTORU";
        intent11.putExtra("SNAME", sname);
        String origin = "Brazil, though some were found in Mexico at an earlier date and the Chinese used them in the 14th century.";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Bacterial Leaf Spot and Blight, Botrytis Blight, Foliar Nematode, Powdery Mildew, Pythium Rot, Rhizoctonia Crown Rot ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Remove infected leaves from Rex and tuberous types because they are not systemically infected. " +
                "Do not wet leaves when irrigating. Do not propagate from infected plants. Destroy crop debris. " +
                "Maintain low humidity by spacing plants and venting to improve air circulation, Apply a fungicide to protect plants, " +
                "Maintain a fungicide program to protect plants, Keep hose ends off the ground. Do not over-water.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm4(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "COMMON DAISY";
        intent11.putExtra("NAME", name);
        String sname = "BELLIS PERENNIS";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in North and central Europe";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Pythium root rot, Powdery mildew, Phyllosticta leaf spot, Rhizopus blight, Sclerotinia blight, Verticillium wilt, Web blight.";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Keep the soil around your plants, moist at all times, and provide a fertile, well-draining soil.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm5(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "TULIPS";
        intent11.putExtra("NAME", name);
        String sname = "TULIPA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Northern China and Southern Europe";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "fungi, bacteria, viruses, and nematodes including Botrytis tulipae, Fusarium oxysporum f. sp. tulipae, Pectobacterium carotovorum";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Be sure to spray all the good bulbs with fungicide to prevent future issues and Don’t plant tulips in that spot for a few years, " +
                "as the disease spores can remain in the soil and infect future plants. \n";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm6(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "PANSY";
        intent11.putExtra("NAME", name);
        String sname = "VIOLA TRICOLOR VAR. HORTENSIS";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in Iver, Buckinghamshire, England, North America";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " root-rot pathogens such as Pythium, Rhizoctonia, and Fusarium, " +
                "but they also are susceptible to Thielaviopsis, the cause of “black root rot.” Black root rot is the most serious root disease of pansies ";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Clean flower beds thoroughly at the end of the blooming season. Also, clean and disinfect containers. " +
                "Avoid planting pansies in areas that have been affected by disease. Keep foliage and blooms as dry as possible. " +
                "Water by hand with a hose or use a soaker hose or drip system. Avoid overhead watering. Avoid over-fertilization. ";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm7(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "MARIGOLD";
        intent11.putExtra("NAME", name);
        String sname = "TAGETES";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in spain, marigold seeds were transported to France and northern Africa ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "blights, rots, and mildews. Usually, these types of diseases show up when conditions are wet and warm, and fungal spores are rampant.";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Removing infected plant material can also help limit the spread of disease, Use containers that drain well and avoid using saucers, " +
                "which can catch water and cause root rot, and Use pathogen free potting mixes or sterilize your soil before planting marigolds.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm8(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "PITUNIA";
        intent11.putExtra("NAME", name);
        String sname = "PETUNIA X ATKINSIANA";
        intent11.putExtra("SNAME", sname);
        String origin = "Originated in  South American";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = "Maintain low relative humidity. Apply a fungicide to protect plants, Use pasteurized potting mix or soilless mix known to be free of pathogens.\" +\n" +
                "Maintain a soil pH below 7. Have a water test done to be certain calcium and sodium are not too high";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm9(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "HIBISCUS";
        intent11.putExtra("NAME", name);
        String sname = "HIBISCUS ROSA-SINENSIS";
        intent11.putExtra("SNAME", sname);
        String origin = "China,Japan and Pacific island";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = "Dieback disease, Wilt Disease,Leaf Fungus";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Wash your hibiscus by hosing or spraying them down well with water once or twice a month during dry months, " +
                "Keep your hibiscus pest-free, Pick up spent flowers and throw them away and Prune away broken branches, and treat cut " +
                "ends with waterless hand cleaner or alcohol.";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }

    public void btnm10(View view) {
        Intent intent11 = new Intent(this,view.class);
        String name = "ZINNIA";
        intent11.putExtra("NAME", name);
        String sname = "ZINNIA ELEGANS";
        intent11.putExtra("SNAME", sname);
        String origin = " Native to Mexico ";
        intent11.putExtra("ORIGIN", origin);
        String cdisease = " Powdery mildew and Alternaria blight";
        intent11.putExtra("CDISEASE", cdisease);
        String dremedies = " Eliminate aphids by spraying them with water, This dislodges the aphids and rinses away their honeydew";
        intent11.putExtra("DREMEDIES", dremedies);
        startActivity(intent11);
    }
}