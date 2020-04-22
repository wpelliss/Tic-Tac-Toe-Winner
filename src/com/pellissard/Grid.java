package com.pellissard;

class Grid {

    private String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    // Main constructor
    Grid() {
    }

    // Assign a value in the grid
    boolean SetValue(int position, String value) {
        if (IsPositionValid(position)) {
            values[position - 1] = value;
            return true;
        }
        else {
            System.out.println("Position not valid, please retry");
            return false;
        }
    }

    // If the player has two in a row, they can place a third to get three in a row.
    void AiTryWin() {
        if ((values[0].equals("O")) && (values[1].equals("O")) && (values[2].equals("3"))) {
            SetValue(3, "O");
        }
        else if ((values[0].equals("O")) && (values[2].equals("O")) && (values[1].equals("2"))) {
            SetValue(2, "O");
        }
        else if ((values[0].equals("O")) && (values[3].equals("O")) && (values[6].equals("7"))) {
            SetValue(7, "O");
        }
        else if ((values[0].equals("O")) && (values[4].equals("O")) && (values[8].equals("9"))) {
            SetValue(9, "O");
        }
        else if ((values[0].equals("O")) && (values[6].equals("O")) && (values[3].equals("4"))) {
            SetValue(4, "O");
        }
        else if ((values[0].equals("O")) && (values[8].equals("O")) && (values[4].equals("5"))) {
            SetValue(5, "O");
        }
        else if ((values[1].equals("O")) && (values[2].equals("O")) && (values[0].equals("1"))) {
            SetValue(1, "O");
        }
        else if ((values[1].equals("O")) && (values[4].equals("O")) && (values[7].equals("8"))) {
            SetValue(8, "O");
        }
        else if ((values[1].equals("O")) && (values[7].equals("O")) && (values[4].equals("5"))) {
            SetValue(5, "O");
        }
        else if ((values[2].equals("O")) && (values[5].equals("O")) && (values[8].equals("9"))) {
            SetValue(9, "O");
        }
        else if ((values[2].equals("O")) && (values[8].equals("O")) && (values[5].equals("6"))) {
            SetValue(6, "O");
        }
        else if ((values[3].equals("O")) && (values[4].equals("O")) && (values[5].equals("6"))) {
            SetValue(6, "O");
        }
        else if ((values[3].equals("O")) && (values[5].equals("O")) && (values[4].equals("5"))) {
            SetValue(5, "O");
        }
        else if ((values[3].equals("O")) && (values[6].equals("O")) && (values[0].equals("1"))) {
            SetValue(1, "O");
        }
        else if ((values[4].equals("O")) && (values[5].equals("O")) && (values[3].equals("4"))) {
            SetValue(4, "O");
        }
        else if ((values[4].equals("O")) && (values[7].equals("O")) && (values[1].equals("2"))) {
            SetValue(2, "O");
        }
        else if ((values[5].equals("O")) && (values[8].equals("O")) && (values[2].equals("3"))) {
            SetValue(3, "O");
        }
        else if ((values[6].equals("O")) && (values[7].equals("O")) && (values[8].equals("9"))) {
            SetValue(9, "O");
        }
        else if ((values[6].equals("O")) && (values[8].equals("O")) && (values[7].equals("8"))) {
            SetValue(8, "O");
        }
        else if ((values[7].equals("O")) && (values[8].equals("O")) && (values[6].equals("7"))) {
            SetValue(7, "O");
        }
        else {
            AiTryBlock();
        }
    }

    // If the opponent has two in a row, the player must play the third themselves to block the opponent.
    private void AiTryBlock() {
        if ((values[0].equals("X")) && (values[1].equals("X")) && (values[2].equals("3"))) {
            SetValue(3, "O");
        }
        else if ((values[0].equals("X")) && (values[2].equals("X")) && (values[1].equals("2"))) {
            SetValue(2, "O");
        }
        else if ((values[0].equals("X")) && (values[3].equals("X")) && (values[6].equals("7"))) {
            SetValue(7, "O");
        }
        else if ((values[0].equals("X")) && (values[4].equals("X")) && (values[8].equals("9"))) {
            SetValue(9, "O");
        }
        else if ((values[0].equals("X")) && (values[6].equals("X")) && (values[3].equals("4"))) {
            SetValue(4, "O");
        }
        else if ((values[0].equals("X")) && (values[8].equals("X")) && (values[4].equals("5"))) {
            SetValue(5, "O");
        }
        else if ((values[1].equals("X")) && (values[2].equals("X")) && (values[0].equals("1"))) {
            SetValue(1, "O");
        }
        else if ((values[1].equals("X")) && (values[4].equals("X")) && (values[7].equals("8"))) {
            SetValue(8, "O");
        }
        else if ((values[1].equals("X")) && (values[7].equals("X")) && (values[4].equals("5"))) {
            SetValue(5, "O");
        }
        else if ((values[2].equals("X")) && (values[5].equals("X")) && (values[8].equals("9"))) {
            SetValue(9, "O");
        }
        else if ((values[2].equals("X")) && (values[8].equals("X")) && (values[5].equals("6"))) {
            SetValue(6, "O");
        }
        else if ((values[3].equals("X")) && (values[4].equals("X")) && (values[5].equals("6"))) {
            SetValue(6, "O");
        }
        else if ((values[3].equals("X")) && (values[5].equals("X")) && (values[4].equals("5"))) {
            SetValue(5, "O");
        }
        else if ((values[3].equals("X")) && (values[6].equals("X")) && (values[0].equals("1"))) {
            SetValue(1, "O");
        }
        else if ((values[4].equals("X")) && (values[5].equals("X")) && (values[3].equals("4"))) {
            SetValue(4, "O");
        }
        else if ((values[4].equals("X")) && (values[7].equals("X")) && (values[1].equals("2"))) {
            SetValue(2, "O");
        }
        else if ((values[5].equals("X")) && (values[8].equals("X")) && (values[2].equals("3"))) {
            SetValue(3, "O");
        }
        else if ((values[6].equals("X")) && (values[7].equals("X")) && (values[8].equals("9"))) {
            SetValue(9, "O");
        }
        else if ((values[6].equals("X")) && (values[8].equals("X")) && (values[7].equals("8"))) {
            SetValue(8, "O");
        }
        else if ((values[7].equals("X")) && (values[8].equals("X")) && (values[6].equals("7"))) {
            SetValue(7, "O");
        }
        else {
            AiTryFork();
        }
    }

    // Create an opportunity where the player has two ways to win (two non-blocked lines of 2).
    private void AiTryFork() {
        if (values[4].equals("X")) {
            if (values[0].equals("O") && (values[8].equals("9"))) {
                SetValue(9, "O");
            }
            else if (values[2].equals("O") && (values[6].equals("7"))) {
                SetValue(7, "O");
            }
            else if (values[6].equals("O") && (values[2].equals("3"))) {
                SetValue(3, "O");
            }
            else if (values[8].equals("O") && (values[0].equals("1"))) {
                SetValue(1, "O");
            }
            else {
                AiTryBlockFork();
            }
        }
        else {
            AiTryBlockFork();
        }
    }

    // If there is only one possible fork for the opponent, the player should block it.
    private void AiTryBlockFork() {
        if (values[4].equals("O")) {
            if (values[0].equals("X") && values[8].equals("X")) {
                AiTryEmptySide();
            }
            else if (values[2].equals("X") && values[6].equals("X")) {
                AiTryEmptySide();
            }
            else {
                AiTryCenter();
            }
        }
        else {
            AiTryCenter();
        }
    }

    // A player marks the center.
    private void AiTryCenter() {
        if (values[4].equals("5")) {
            SetValue(5, "O");
        }
        else {
            AiTryOppositeCorner();
        }
    }

    // If the opponent is in the corner, the player plays the opposite corner.
    private void AiTryOppositeCorner() {
        if (values[0].equals("X") && (values[8].equals("9"))) {
            SetValue(9, "O");
        }
        else if (values[2].equals("X") && (values[6].equals("7"))) {
            SetValue(7, "O");
        }
        else if (values[6].equals("X") && (values[2].equals("3"))) {
            SetValue(3, "O");
        }
        else if (values[8].equals("X") && (values[0].equals("1"))) {
            SetValue(1, "O");
        }
        else {
            AiTryEmptyCorner();
        }
    }

    // The player plays in a corner square.
    private void AiTryEmptyCorner() {
        if (values[0].equals("1")) {
            SetValue(1, "O");
        }
        else if (values[2].equals("3")) {
            SetValue(3, "O");
        }
        else if (values[6].equals("7")) {
            SetValue(7, "O");
        }
        else if (values[8].equals("9")) {
            SetValue(9, "O");
        }
        else {
            AiTryEmptySide();
        }
    }

    // The player plays in a middle square on any of the 4 sides.
    private void AiTryEmptySide() {
        if (values[1].equals("2")) {
            SetValue(2, "O");
        }
        else if (values[3].equals("4")) {
            SetValue(4, "O");
        }
        else if (values[5].equals("6")) {
            SetValue(6, "O");
        }
        else if (values[7].equals("8")) {
            SetValue(8, "O");
        }
        else {
            System.out.println("Its a draw !");
        }
    }

    // Check the validity of this position of the grid
    private boolean IsPositionValid(int position)
    {
        return position >= 1 && position <= 9 && !values[position - 1].equals("X") && !values[position - 1].equals("O");
    }

    // Print the grid
    void Show() {
        System.out.println(" " + values[0] + " | " + values[1] + " | " + values[2] + " ");
        System.out.println("-----------");
        System.out.println(" " + values[3] + " | " + values[4] + " | " + values[5] + " ");
        System.out.println("-----------");
        System.out.println(" " + values[6] + " | " + values[7] + " | " + values[8] + " ");
    }

    // Check if the game loop is finished
    boolean NotWonOrComplete() {
        if ((values[0].equals(values[1])) && (values[1].equals(values[2]))) {
            return false;
        }
        if ((values[3].equals(values[4])) && (values[4].equals(values[5]))) {
            return false;
        }
        if ((values[6].equals(values[7])) && (values[7].equals(values[8]))) {
            return false;
        }
        if ((values[0].equals(values[3])) && (values[3].equals(values[6]))) {
            return false;
        }
        if ((values[1].equals(values[4])) && (values[4].equals(values[7]))) {
            return false;
        }
        if ((values[2].equals(values[5])) && (values[5].equals(values[8]))) {
            return false;
        }
        if ((values[0].equals(values[4])) && (values[4].equals(values[8]))) {
            return false;
        }
        if ((values[2].equals(values[4])) && (values[4].equals(values[6]))) {
            return false;
        }
        if ((!values[0].equals("1"))
                && !(values[1].equals("2"))
                && !(values[2].equals("3"))
                && !(values[3].equals("4"))
                && !(values[4].equals("5"))
                && !(values[5].equals("6"))
                && !(values[6].equals("7"))
                && !(values[7].equals("8"))
                && !(values[8].equals("9"))) {
            return false;
        }
        return true;
    }
}
