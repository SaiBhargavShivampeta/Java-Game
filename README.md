Adventure Game
This repository contains a text-based Adventure Game where the player navigates through different rooms, encounters monsters, collects items, and tries to survive.

Features
Multiple Room Types: Includes different types of rooms such as Monster Room, Treasure Room, and Empty Room.
Combat System: Attack, block, use items, or flee from monsters.
Item Management: Collect and use items like Potions to heal.
Player Stats: Health and Strength, affecting combat and survival.
Randomized Room Generation: Encounter rooms with random events and monsters.
Prerequisites
To run this project, ensure you have the following installed:

Java 14 or later
Maven
Git
Setup Instructions
1. Clone the Repository
bash
Copy code
git clone https://github.com/your-username/adventure-game.git
cd adventure-game
2. Build the Project
Use Maven to build the project:

bash
Copy code
mvn clean install
3. Run the Application
Start the Adventure Game:

bash
Copy code
mvn exec:java -Dexec.mainClass="game.controller.GameController"
4. Play the Game
After running the application, the game will start, and you will be prompted with choices in different rooms. Your goal is to survive by making the right decisions, such as attacking monsters, using items, or fleeing.

5. Exit the Game
You can exit the game by choosing not to continue after a room or when your health reaches zero.

Project Structure
game.controller: Contains the game logic, including the GameController class, which controls the flow of the game.
game.models: Contains the Player class for managing the player’s health, strength, and inventory.
game.models.rooms: Contains the room types (Room, MonsterRoom, etc.) and their specific behavior.
game.factory: A factory class responsible for creating rooms.
Troubleshooting
Invalid Input: Ensure that you are entering valid numbers (1-4) when prompted for choices.
Game Freezing: If the game freezes, check for infinite loops in combat or room transitions.
Room Not Entering: Ensure the room class is correctly implemented in game.factory.RoomFactory.
Contributing
Contributions are welcome! Please follow these steps:

Fork the repository.
Create a feature branch: git checkout -b feature-name
Commit your changes: git commit -m 'Add some feature'
Push to the branch: git push origin feature-name
Open a pull request.
License
This project is licensed under the MIT License. See the LICENSE file for details.

Contact
For any questions or issues, please reach out to [your-email@example.com].
