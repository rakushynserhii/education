package org.practice_03;

public class GameSettings {

    static int maxPlayers;
    final String gameName;
    int currentPlayers = 0;

    GameSettings(String gameName) {
        this.gameName = gameName;
    }

    static void setMaxPlayers(int max) {
        maxPlayers = max;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers)
            currentPlayers++;
    }

    void printGameStatus() {
        System.out.println("Name: " + gameName);
        System.out.println("Current players: " + currentPlayers);
        System.out.println("Max players: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings gta = new GameSettings("GTA");
        GameSettings cs = new GameSettings("CS");
        GameSettings.setMaxPlayers(5);
        gta.addPlayer();
        gta.addPlayer();
        gta.addPlayer();

        cs.addPlayer();
        cs.addPlayer();
        cs.addPlayer();
        cs.addPlayer();
        cs.addPlayer();

        gta.printGameStatus();
        cs.printGameStatus();
    }

    /* Создайте класс GameSettings с полями:
    static int maxPlayers — общее ограничение игроков
    final String gameName — название (нельзя менять)
    int currentPlayers — сколько игроков в игре сейчас

    Реализуйте конструктор, статический метод setMaxPlayers(int), метод addPlayer() — добавляет 1 игрока,
    если не превышен maxPlayers, метод printGameStatus() — выводит название, текущее и максимальное
    количество игроков. В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус. */

}
