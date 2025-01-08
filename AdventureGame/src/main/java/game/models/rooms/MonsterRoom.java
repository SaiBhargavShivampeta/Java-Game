package game.models.rooms;

import game.models.Player;

import java.util.Random;
import java.util.Scanner;

public class MonsterRoom extends Room {
    private int monsterHealth = 50; // Health of the monster
    private final Random random = new Random();

    public MonsterRoom() {
        super("Monster Room");
    }

    @Override
    public void enterRoom(Player player) {
        System.out.println("You entered a room with a monster!");
        
        // Use the existing scanner passed from the game main loop
        Scanner scanner = player.getScanner();  // Assuming your Player class provides a method to get the Scanner

        while (monsterHealth > 0 && player.getHealth() > 0) {
            System.out.println("Choose an action: (1) Attack (2) Block (3) Use Item (4) Flee");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    // Attack the monster
                    int damage = random.nextInt(10) + 10; // Random damage between 10 and 20
                    monsterHealth -= damage;
                    System.out.println("You attacked the monster! Monster's health: " + Math.max(0, monsterHealth));
                }
                case 2 -> {
                    // Block the monster's attack
                    System.out.println("You blocked the monster's attack!");
                    continue; // Monster skips attack
                }
                case 3 -> {
                    // Use an item from inventory
                    if (player.useItem("Potion")) {
                        System.out.println("You used a potion! Your health: " + player.getHealth());
                    } else {
                        System.out.println("You have no potions left!");
                    }
                }
                case 4 -> {
                    // Attempt to flee
                    if (random.nextBoolean()) {
                        System.out.println("You successfully fled the room!");
                        return; // Exit the room
                    } else {
                        System.out.println("Flee attempt failed! The monster attacks!");
                    }
                }
                default -> System.out.println("Invalid choice. Try again.");
            }

            // Monster attacks after player's turn unless blocked
            if (choice != 2 && monsterHealth > 0) {
                int monsterDamage = random.nextInt(10) + 5; // Random damage between 5 and 15
                player.decreaseHealth(monsterDamage);
                System.out.println("The monster attacks! Your health: " + Math.max(0, player.getHealth()));
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println("You were defeated by the monster...");
        } else if (monsterHealth <= 0) {
            System.out.println("You defeated the monster!");
            player.addItem("Gold"); // Reward the player
        }
    }
}
