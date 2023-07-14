import java.util.*;
import java.util.Scanner;


class Gusser {
    int guessNum;

    int gussingNumber() {

        System.out.println("Guesser! kindely Guesse the number ");
        Scanner scanner = new Scanner(System.in);
        guessNum = scanner.nextInt();
        return guessNum;

    }
}

class Player {
    int gussesNum;

    int gussingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindely Guesse the number ");
        gussesNum = scan.nextInt();
        return gussesNum;

    }
}
    class Umpire {

        int numFromGusser;
        int numFromPlayer1;
        int numFromPlayer2;
        int numFromPlayer3;

        
        void collectNumberFromGusser(){
        Gusser g=new Gusser();
        numFromGusser=g.gussingNumber();
        }
        void collectNumberFromPlayer() {

            Player p1=new Player();
            Player p2 =new Player();
            Player p3=new Player();
           numFromPlayer1=p1.gussingNumber();
           numFromPlayer2=p2.gussingNumber();
           numFromPlayer3=p3.gussingNumber();
        }


       void compare(){
            if(numFromGusser==numFromPlayer1){
                if(numFromGusser==numFromPlayer2 && numFromGusser==numFromPlayer3){
                System.out.println("All Player Won the Match");
            }
            else if(numFromGusser==numFromPlayer2){
                System.out.println("Player 1 and 2 won the Match");
            }
            else if(numFromGusser==numFromPlayer3){
                System.out.println("Player 1 and 3 won the Match");
            }
            else{
                System.out.println("Player 1 won the Match");
            }
        }
            else if(numFromGusser==numFromPlayer2){
                if(numFromGusser==numFromPlayer3){
                    System.out.println("Player 2 and 3 won the match");
                }
                else{
                    System.out.println("Player 2 won the match");
                }
            }

            else if(numFromGusser==numFromPlayer3){
                System.out.println("Player 3 is won!");
            }
            else{
                System.out.println("Everone is Wrong ..... You loss Game!");
            }
        }
    }

public class Game {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u=new Umpire();
        u.collectNumberFromGusser();
        u.collectNumberFromPlayer();
        u.compare();
    }

}
