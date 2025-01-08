# Adventure Game

Welcome to the Adventure Game! This is a text-based dungeon crawl game where you control a player navigating through various rooms, facing monsters, collecting items, and trying to survive.

## Features

Multiple Room Types: The game includes different types of rooms, such as Monster Room, Treasure Room, and Empty Room.

Combat System: You can attack, block, use items, or attempt to flee when encountering monsters.

Item System: Manage items like potions to heal your player.

Player Stats: Player stats include health, strength, and an inventory of items.

Randomized Room Generation: Each room encounter is randomly chosen from predefined types.

## Technologies Used

Java 14: This project uses Java 14 for development.

JUnit 5: For unit testing of game logic and classes.

Maven: To handle project dependencies and build the project.

## How to Play

### Clone the repository:

git clone https://github.com/yourusername/AdventureGame.git
cd AdventureGame

### Build the project: This project uses Maven to manage dependencies. To build the project, use the following command:

mvn clean install

### Run the game: After building, run the game with:

mvn exec:java -Dexec.mainClass="game.controller.GameController"

## Gameplay:

The game will prompt you with choices in different rooms.

In each room, you'll encounter various actions, such as attacking monsters, using items, or trying to flee.

Your goal is to navigate through rooms, defeat monsters, and survive the dungeon.

Make decisions carefully, as your health will decrease if you're attacked by a monster.

Exit the Game: You can exit the game by choosing not to continue after finishing a room or when your health reaches zero.

## Project Structure

game.controller: Contains the game logic, including GameController, which controls the flow of the game.

game.models: Contains the Player class that tracks the player's health, inventory, and actions.

game.models.rooms: Contains abstract and specific room types, such as MonsterRoom, where the player encounters challenges.

game.factory: A factory class responsible for creating rooms.

## Future Improvements

Add more room types with different challenges and events.

Implement a better combat system with more detailed mechanics.

Add additional items with different effects.

Improve game balance and make the game more challenging.
