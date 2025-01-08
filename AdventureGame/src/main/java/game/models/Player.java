package game.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Player {
    private int health;
    private int strength;  // Add a strength attribute
    private final Map<String, Integer> inventory;
    private final Scanner scanner;  // Add the Scanner as an instance variable

    public Player() {
        this.health = 100;
        this.strength = 10;  // Initial strength value
        this.inventory = new HashMap<>();
        this.inventory.put("Potion", 2); // Player starts with 2 potions
        this.scanner = new Scanner(System.in);  // Initialize the Scanner
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    public void increaseHealth(int amount) {
        this.health = Math.min(100, this.health + amount);
    }

    public boolean useItem(String item) {
        if (inventory.getOrDefault(item, 0) > 0) {
            if (item.equals("Potion")) {
                increaseHealth(20); // Heal 20 HP
            }
            inventory.put(item, inventory.get(item) - 1);
            return true;
        }
        return false;
    }

    public void addItem(String item) {
        inventory.put(item, inventory.getOrDefault(item, 0) + 1);
    }

    // New method to increase strength
    public void increaseStrength(int amount) {
        this.strength += amount;
        System.out.println("Your strength has increased! Current strength: " + this.strength);
    }

    // Method to display the player's inventory
    public void showInventory() {
        System.out.println("Your inventory: " + inventory);
    }

    // Getter and Setter for strength (optional)
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Getter for the scanner (to be used in other classes like MonsterRoom)
    public Scanner getScanner() {
        return scanner;
    }

    // Close the scanner when the game ends
    public void closeScanner() {
        scanner.close();
    }
}
