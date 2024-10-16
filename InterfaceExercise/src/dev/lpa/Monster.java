package dev.lpa;

import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(getName(),
                Integer.toString(getHitPoints()),
                Integer.toString(getStrength()));
    }

    @Override
    public void read(List<String> player) {
        if (player != null && !player.isEmpty()) {
            name = player.get(0);
            hitPoints = Integer.parseInt(player.get(1));
            strength = Integer.parseInt(player.get(2));
        }
    }

    @Override
    public String toString() {
        return """
                Monster{name='%s', hitPoints=%d, strength=%d}"""
                .formatted(getName(), getHitPoints(), getStrength());
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
}
