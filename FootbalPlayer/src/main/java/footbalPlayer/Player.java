package footbalPlayer;

import java.util.Scanner;

public class Player{
    public int no;
    public String name;
    public boolean inPlay;
    public int minutes;
    public int numberOfGoals;

            void play(int minutesToPlay){
                minutes += minutesToPlay;
            }


            void score(){
                numberOfGoals++;
            }
}
