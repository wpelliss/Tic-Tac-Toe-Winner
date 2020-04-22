package com.pellissard;

class Grid {

    private String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    Grid() {
    }

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

    private void AiTryCenter() {
        if (values[4].equals("5")) {
            SetValue(5, "O");
        }
        else {
            AiTryOppositeCorner();
        }
    }

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

    private boolean IsPositionValid(int position)
    {
        return position >= 1 && position <= 9 && !values[position - 1].equals("X") && !values[position - 1].equals("O");
    }

    void Show() {
        System.out.println(" " + values[0] + " | " + values[1] + " | " + values[2] + " ");
        System.out.println("-----------");
        System.out.println(" " + values[3] + " | " + values[4] + " | " + values[5] + " ");
        System.out.println("-----------");
        System.out.println(" " + values[6] + " | " + values[7] + " | " + values[8] + " ");
    }

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
