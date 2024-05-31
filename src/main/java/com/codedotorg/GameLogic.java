package com.codedotorg;

public class GameLogic {

    /** Whether or not the game is over */
    private boolean gameOver;

    /**
     * Constructor for the GameLogic class.
     * Initializes the gameOver variable to false.
     */
    public GameLogic() {
        gameOver = false;
    }

    /**
     * Returns a random choice of "rock", "paper", or
     * "scissors" for the computer player.
     * 
     * @return a String representing the computer's choice
     */
    public String getComputerChoice() {
        int computerChoice = (int) (Math.random() * 3);
        
        if (computerChoice == 0) {
            return "rock";
        } else if (computerChoice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    /**
     * Determines the winner of a rock-paper-scissors game based on the user's predicted class and the computer's choice.
     * @param predictedClass The user's predicted class.
     * @param computerChoice The computer's choice.
     * @return A string containing the computer choice, user choice, and the result of the game.
     */
    public String determineWinner(String predictedClass, String computerChoice) {
        String text = "You chose " + predictedClass + ". The computer chose " + computerChoice + ". ";
        if (predictedClass.equals(computerChoice)) {
            text += getTieResult();
        } else if (predictedClass.equals("rock")) {
            if (computerChoice.equals("paper")) {
                text += getComputerWinnerResult();
            } else {
                text += getUserWinnerResult();
            }
        } else if (predictedClass.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                text += getComputerWinnerResult();
            } else {
                text += getUserWinnerResult();
            }
        } else {
            if (computerChoice == "rock") {
                text += getComputerWinnerResult();
            } else {
                text += getUserWinnerResult();
            }
        }
        return text;
    }

    /**
     * Sets the game over flag to true and returns a
     * string indicating a tie result.
     * 
     * @return A string indicating a tie result.
     */
    public String getTieResult() {
        gameOver = true;

        return "It's a tie!";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the user has won.
     * 
     * @return a string indicating that the user has won
     */
    public String getUserWinnerResult() {
        gameOver = true;
        return "The User Wins!";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the computer has won.
     * 
     * @return A string indicating that the player has lost.
     */
    public String getComputerWinnerResult() {
        gameOver = true;
        return "The Computer Wins!";
    }

    /**
     * Returns whether the game is over or not.
     * 
     * @return true if the game is over, false otherwise.
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * Resets the game logic by setting the gameOver flag to false.
     */
    public void resetLogic() {
        gameOver = false;
    }

}
