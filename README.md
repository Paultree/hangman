# Project: Hangman

Purpose of project:

- To create a simple working version of Hangman.
- To improve and reinforce my learning and understanding of Java.

How to play:

- User will be prompted to input a single letter or a word.
  - If input is a letter: if it is in the answer, the console will reveal the position/s of the letter. Also, a part of the hangman is revealed.
  - If input is a word:
    - If correct, user wins the game and ends the game.
    - If incorrect, no letters are revealed and a part of the hangman is revealed.
- Users will have 7 attempts to get the word. Failure to do so will cause the console to let the user know that they have lost and the word is revealed.

## MVP

- Recreate a version of the game Hangman to be played in a Java console application. -[x]
- The game should randomly select a word from the provided list - [x]
- When the word is selected, a row of underscores representing letters in the word should be printed to the console, for example:

```
_ _ _ _ _
```

for "hello"

- the user should be asked to enter a letter
- if the letter entered by the user is in the word, the letter should be revealed, for example

```
H _ _ _ _
```

when the user enters "H"

- if the letter is not in the word, a part of the hangman should be printed to the console, for example:

```
___|___
```

after the first wrong letter is entered,

```
   |
   |
   |
   |
   |
   |
   |
___|___
```

after the second incorrect letter is entered,

```
____________
   |
   |
   |
   |
   |
   |
   |
___|___
```

after the third incorrect letter is entered. -[x]

- the user should be able to guess wrong 7 times before they loose - [x]
- they should be given the option to guess a letter or the whole word - [x]

## Bonuses

- Read the word list directly from the file when the application starts -[x]
- Create a history file that keeps track of user wins/losses and how many letters they guessed it in
- Give user the option to verse the computer - the computer should select a letter, if the letter selected is in the word, it should be revealed, just like with user guesses. The computer should also try to guess the whole word.

## Useful resources:

- [Java Data Types](https://www.w3schools.com/java/java_data_types.asp)
- [System Out Print](https://www.javatpoint.com/system-out-println-in-java)
- [Java Main Method](https://www.javatpoint.com/java-main-method)
- [Java Methods](https://www.w3schools.com/java/java_methods.asp)
- [Java Scanner Class](https://www.w3schools.com/java/java_user_input.asp)
- [Java Arrays](https://www.javatpoint.com/array-in-java)
- [Java ArrayLists](https://www.javatpoint.com/java-arraylist)
- [Java If Statement](https://www.javatpoint.com/java-if-else)
- [Java Loops](https://www.javatpoint.com/java-for-loop)

Tech stack used:

- Java
- Github

Notes:

- Created 3 classes.
- One class will handle the user's input.
- One class will handle reading the wordlist JSON file.
- One class will handle the hangman output onto the console.
  - This was done to keep the code more maintanable and readable.
