package dev.lpa;

import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(getName(),
                Integer.toString(getHitPoints()),
                Integer.toString(getStrength()),
                getWeapon());
    }

    @Override
    public void read(List<String> player) {
        if (player != null && !player.isEmpty()) {
            name = player.get(0);
            hitPoints = Integer.parseInt(player.get(1));
            strength = Integer.parseInt(player.get(2));
            weapon = player.get(3);
        }
    }

    @Override
    public String toString() {
        return """
                Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}"""
                .formatted(getName(), getHitPoints(), getStrength(), getWeapon());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
