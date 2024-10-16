package dev.lpa;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ISaveable player = new Player("Tim", 10, 15);
        List<String> playerValues = player.write();

        System.out.println("--------- Player values ---------");
        for (String value : playerValues) {
            System.out.println(value);
        }

        player.read(List.of("Luna", "50", "100", "Magic Staff"));

        System.out.println("Updated player: " + player);

        ISaveable monster = new Monster("werewolf", 20, 40);

        List<String> monsterValues = monster.write();

        System.out.println("--------- Monster values ---------");
        for (String value : monsterValues) {
            System.out.println(value);
        }

        monster.read(List.of("vampire", "25", "85"));
        System.out.println("Updated monster: " + monster);
    }
}
