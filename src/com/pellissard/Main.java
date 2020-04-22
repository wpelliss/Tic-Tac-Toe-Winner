package com.pellissard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Grid grid = new Grid();

        if (Math.random() < 0.5)
        {
            grid.AiTryWin();
        }

        while (grid.NotWonOrComplete()) {
            grid.Show();
            System.out.println("Please enter a valid number");
            String val = myObj.nextLine();
            if (grid.SetValue(Integer.parseInt(val), "X") && grid.NotWonOrComplete()) {
                grid.AiTryWin();
            }
        }

        grid.Show();
    }
}