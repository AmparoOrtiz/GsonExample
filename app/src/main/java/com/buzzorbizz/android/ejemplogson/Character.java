package com.buzzorbizz.android.ejemplogson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Amparo on 10/03/2015.
 */
public class Character {

    private String character;
    @SerializedName("class")
    private String classCharacter;
    private int level;
    private String race;
    private long gold;
    private ArrayList<Armor> armor;


    public String getNameCharacter() {
        return character;
    }

    public void setNameCharacter(String nameCharacter) {
        this.character = nameCharacter;
    }

    public String getClassCharacter() {
        return classCharacter;
    }

    public void setClassCharacter(String classCharacter) {
        this.classCharacter = classCharacter;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public long getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public ArrayList<Armor> getArmor() {
        return armor;
    }

    public void setArmor(ArrayList<Armor> armor) {
        this.armor = armor;
    }
}
