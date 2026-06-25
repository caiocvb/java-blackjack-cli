# JavaBlackjack

A small project of the Blackjack cardgame in Java, made for study purpose.

**Objective:** Demonstrate the structure of a simple Java project, play Blackjack matches via terminal and suit as a base for extensions in the future (IA, GUI, web).

## Prerequisits

- JDK 11 or superior installed and on `PATH`.

## Reposity structure

- src/: Java soucecode
	- App.java — the class with the `main` method
	- classes/Deck.java — deck implementation
	- classes/Match.java — match logic
	- classes/Player.java — representation of the players
- lib/: extenal depencies (if necessary)
- bin/: compiled files (bin/classes/)
- run.bat: script for Windows

## How to compile and run

Quick option:

- Using the script (Windows):

```powershell
./run.bat
```

- Manually (Windows):

```powershell
javac -d bin\classes src\App.java src\classes\*.java
java -cp bin\classes App
```

- Manually (Linux/macOS):

```bash
javac -d bin/classes src/*.java src/classes/*.java
java -cp bin/classes App
```

## Use

Upon execution, the program will create a simple Blackjack match as defined in `Match`. Examine the code at `src/classes/Match.java` for better understanding.

## Contribuition

- Open an issue describing the proposal.
- Send small and focused pull requests.

## License

Read the file `license` in the root of the repository for more details.