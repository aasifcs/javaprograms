import java.util.Scanner;

class Guesser{
    int guessernum; 
    public int takeNumfromGuesser(){
     System.out.println("Guesser Enter the Number");
     Scanner sc=new Scanner(System.in);
     guessernum=sc.nextInt();
     return guessernum;   
    }
    
}
class Player{
    int playernum;
     public int takeNumfromPlayer(){
     System.out.println("Player Enter the Number");
     Scanner sc=new Scanner(System.in);
     playernum=sc.nextInt();
     return playernum;
    }
}
class Umpire{
    int numfromGuesser;
    int numfromPlayer1;
    int numfromPlayer2;
    int numfromPlayer3;
    void collectfromGusser(){
        Guesser g=new Guesser();
        numfromGuesser=g.takeNumfromGuesser();
    }
    void collectfromPlayer(){
        Player p1= new Player();
        numfromPlayer1=p1.takeNumfromPlayer();
        Player p2= new Player();
        numfromPlayer1=p2.takeNumfromPlayer();
        Player p3= new Player();
        numfromPlayer1=p3.takeNumfromPlayer();
    }
    void compare(){
        if(numfromPlayer1==numfromGuesser){
            if (numfromPlayer2==numfromGuesser && numfromPlayer3==numfromGuesser)
            {
                System.out.println("All Player won the game");   
            }
            else if(numfromPlayer2==numfromGuesser){
            System.out.println("Player 1 and Player 2");
             }
            else if( numfromPlayer3==numfromGuesser){
            System.out.println("Player 1 and Player 3");
             }
            else{
            System.out.println("Only 1 Player won the game");
            }
        }  
        else if(numfromPlayer2==numfromGuesser){
            if(numfromPlayer3==numfromGuesser){
                System.out.println("Player 2 and Player 3 won the game");
            }
            else{
                System.out.println("Onl player 2 won the game");
            }
        }
        else if(numfromPlayer3==numfromGuesser){
               System.out.println("Only Player 3 wpn the game");
        }
        else{
            System.out.println("No player won the game");
        }
    }
    


public static class GuesserGame {
    public static void main(String[] args) {
    Umpire U=new Umpire();
    U.collectfromGusser();
    U.collectfromPlayer();
    U.compare();

    }
}
}
