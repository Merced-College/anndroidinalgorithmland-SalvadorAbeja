[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23062993)
# AnnDroidInAlgotihmLand
a sample project to practice sorting and searching

🎵 Download Required Audio File

This project uses an audio file that is too large to store directly in the GitHub repository.
Please download the file from Google Drive before running the program.

Download the audio file here:

➡️ Download the required audio file from Google Drive

Instructions

Open the Google Drive folder using the link above.

Download the ZIP file that contains the audio file.

Extract (unzip) the file on your computer.

Place the extracted audio file into the project folder named content.

Download all of the whole content folder, and put this in your project.

**## Code Exploration**

Project Structure:
* Question 1: The source folder has files pertaining to the functionality of the game such as the main menu, game panel, router for the app, and leaderboard functions.
* Question 2: The content folder stores all the visual and auditory assets that we are using for the game. These assets will be called through the Asset class which will then be applied to our game when we run it.
* Question 3: The uml folder is the workflow of the program and showcases how it is intended to function between all the classes and methods when it is run.
* Question 4: Code is often seperated from assets as to simplify workflow and to make the program more concise and easier to read and understand for others reviewing it.

Main Program:
* Question 1: The Main.java class contains the main method. It is where we run the game from.
* Question 2: The program creates the starting visual menu that we will see when we run the game along with the approuter for menu functionality.
* Question 3: The approuter method is created to provide functionality for our game menus.

Progam Execution:
* Question 1: The MainMenuPanel, RabbitGamePanel and LeaderboardPanel classes are responsible for drawing the frontend of the menus.
* Question 2: The backend is in Assets, LeaderboardAlgorithms, LeaderboardRepository, and LeaderboardTableModel classes whhich handle loading assets and functionality behind the leaderboard.
* Question 3: The game updates menu items through the MainMenuPanel and LeaderboardPanel where action listeners look for the menu items to be clicked. After they're clicked, the AppRouter runs the respective code pertaining to the menu item selected.

UML Diagram:
* Question 1: The gives us the visual of the workflow that the program goes through when running. 
* Question 2: The AppRouter class appears to be the central class of the system as everything is ran through it for certain aspects of functionality pertaining to the game.
* Question 3: MenuPanel depends on Assets, RabbitGamePanel depends on music and sfx from Assets and LeaderboardPanel depends on the other Leaderboard classes along with the ScoreEntry class.

Score System:
* Question 1: Scores are stored in the ScoreEntry file. 
* Question 2: Scores is stored as an integer.
* Question 3: It would make sense to implement sorting of scores within the LeaderboardAlgorithms class as there's already menu items for sorting the scores. Such would likely require specialized sorting methods for each respective item.