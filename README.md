🎮 Number Guessing Game
A simple console-based Number Guessing Game built in Java. The player tries to guess a randomly generated number between 1 and 100 within a limited number of attempts.

📋 Features
Random number generation each round (1 to 100)

User has up to 7 attempts to guess the number

Feedback after each guess:

🔼 Too high

🔽 Too low

Score calculated based on number of attempts

Play multiple rounds with cumulative scoring

Interactive console experience

🚀 How to Run
Prerequisites
Java JDK installed (version 8 or higher)

Any IDE or terminal

Steps
Save the code in a file named Main.java

Open terminal/command prompt and navigate to the directory

Compile the code:

javac Main.java
Run the program:
java Main
🧮 Scoring System
Maximum score per round: 10

For each additional attempt used, score decreases by 1

If the number isn't guessed in 7 attempts, score for that round is 0

📝 Sample Output
🎮 Welcome to the Number Guessing Game!

🔁 Starting Round 1
🔢 Attempt 1: Enter your guess (1-100): 50
📉 Too low!
...
✅ Correct! You guessed the number in 3 attempts.
🏆 Score for this round: 8
Do you want to play another round? (yes/no): no

🎉 Game Over!
Total Rounds Played: 1
Total Score: 8
📦 Technologies Used
Language: Java

Libraries: java.util.Scanner, java.util.Random

[output](1.png)
