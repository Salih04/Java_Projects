# ATM and Minefield Java Project

This Java project combines two different systems: a simple **ATM System** and a **Minefield Game**. Each system is implemented in separate Java classes, and they provide a console-based user interface for interaction.

## Project Overview

The project includes the following files:

### 1. `ATM_Proj.java`
This file implements a basic ATM system with functionalities such as:
- **Checking balance**
- **Depositing money**
- **Withdrawing money**
- **Exiting the system**

#### How to use the ATM system:
- After running the program, users can choose from the options provided (Deposit, Withdraw, Balance Inquiry, Exit).
- The initial balance is set to 1000 TL, and users can adjust it through deposits and withdrawals.

### 2. `MainMayin.java` & `Mayin_Tarlasi.java`
These files implement a **Minefield Game** where the player can define the size of the grid and play the classic minefield game by entering coordinates to avoid hidden mines.

- **MainMayin.java**: The main entry point for the Minefield game.
- **Mayin_Tarlasi.java**: Contains the logic of the game, including the setup of the game board and mine placement.

#### How to play the Minefield game:
- Upon starting the game, the player is prompted to enter the number of rows and columns for the game grid.
- The game continues until the player either wins by avoiding all the mines or loses by stepping on one.

### 3. `MathSinifi.java`
This class is a utility that demonstrates various mathematical operations using Java's `Math` class.

#### Key operations included:
- Trigonometric functions (e.g., `Math.sin`, `Math.cos`)
- Rounding operations (e.g., `Math.round`, `Math.ceil`, `Math.floor`)
- Power and square root calculations (e.g., `Math.pow`, `Math.sqrt`)
- Absolute values and random number generation

## How to Run

1. **Clone or Download** the repository to your local machine.
2. **Compile** all `.java` files by running:
   
   javac *.java
   
## Run the desired program:
### For the ATM system:
java ATM_Proj

### For the Minefield game:
java MainMayin

# Features
## ATM System:
Simple user interface via the console.
Supports balance inquiry, deposit, withdrawal, and exit functions.

## Minefield Game:
Dynamic grid creation based on user input.
Interactive gameplay with coordinate-based movement.
Mathematics Utility:

Demonstrates common mathematical functions in Java.

# Future Enhancements
## ATM System:
Add support for multiple accounts and more complex operations such as transferring funds.
Implement transaction history for each session.

## Minefield Game:
Add difficulty levels based on the number of mines.
Create a graphical user interface (GUI) for enhanced user interaction.

# Technologies Used
Java: The primary programming language used for this project.

# Contact
Name: [Salih Camcı](https://github.com/Salih04)
