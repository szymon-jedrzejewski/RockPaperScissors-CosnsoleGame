package rockpaperscissorsv2;

import java.util.Scanner;

public class Input {
    public String getPlayerChoice(){
        Scanner in = new Scanner(System.in);
        return in.next().toLowerCase();
    }
}
