package com.buzzorbizz.android.ejemplogson;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private final static String miJsonEjemplo = "{\n" +
            "character: \"Arakina\",\n" +
            "class: \"Death Knigth\",\n" +
            "level: \"100\",\n" +
            "race: \"Gobblin\",\n" +
            "gold: \"823759375435\",\n" +
            "armor: \n" +
            "[\n" +
            "{\n" +
            "name: \"Molten Edge Eviscerator\",\n" +
            "ilevel: \"676\"\n" +
            "},\n" +
            "{\n" +
            "name: \"Thunder maze\",\n" +
            "ilevel: \"456\"\n" +
            "},\n" +
            "{\n" +
            "name: \"The Black Hand\",\n" +
            "ilevel: \"668\"\n" +
            "},\n" +
            "{\n" +
            "name: \"Gar'an's Brutal Spearlauncher\",\n" +
            "ilevel: \"778\"\n" +
            "},\n" +
            "{\n" +
            "name: \"Oregorger's Acid-Etched Gutripper\",\n" +
            "ilevel: \"566\"\n" +
            "}\n" +
            "]\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        Character character = new Character();
        character = gson.fromJson(miJsonEjemplo, Character.class);

        String[]jugador = new String[character.getArmor().size()];

        Log.v("Character", "Character data: " + character.getNameCharacter() + " - " +
        character.getClassCharacter() + " - " + character.getLevel() + " - " +
        character.getRace() + " - " + character.getGold());

        for (int i = 0; i < jugador.length; i++){
            Log.v("Armor", "Character armors: " + character.getArmor().get(i).getName() +
            " - " + character.getArmor().get(i).getIlevel());
        }

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
