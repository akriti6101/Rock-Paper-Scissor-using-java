import java.util.*;
import java.math.*;
import java.lang.*;
public class Game{
public static void main(String [] args)
{Scanner sc=new Scanner(System.in);
int t=4,scoreP=0,scoreC=0;
    System.out.println("Welcome to the game of xxxxxx--------Rock,Paper And Scissor-------xxxxxx");
   
            System.out.println("\n\nPlayer 1  ---------Computer");
            System.out.println("Player 2 enter your name: ");
            String name=sc.nextLine();

 System.out.println("\n\nWelcome "+name+" to the game .....You are playing against the Computer---");
  Random r=new Random();
 System.out.println("\n\nRules:---");
      System.out.println("\nPress '2' for Rock");
         System.out.println("Press '1' for Scissor");
            System.out.println("Press '0' for Paper");
            System.out.println("Press '5' to exit the game");
            System.out.println("Press '4' if u want to continue .............");



           do
            {
                 
                    int op=r.nextInt(3);
                   System.out.println("\nChoose between Rock ,paper and Scissor");
                   int c=sc.nextInt();
                      if(!(c>=0 && c<=2))
                              { System.out.println("Wrong option.........Please choose the correct option..");
                             continue;}
                         if(op==0)
                               System.out.println("\nComputer's choice ---Paper");
                         if(op==1)
                               System.out.println("\nComputer's choice ---Scissor");
                        if(op==2)
                               System.out.println("\nComputer's choice ---Rock");
                     if(c==0)
                               System.out.println("\nyour's choice ---Paper");
                         if(c==1)
                               System.out.println("\nyour's choice ---Scissor");
                        if(c==2)
                               System.out.println("\nyour's choice ---Rock");
                   
                   if(c>op)
                       scoreP++;
                       else if(c<op)
                          scoreC++;
               System.out.println("\nComputer's score  -----"+scoreC);
                          System.out.println("Your  score  -----"+scoreP);
         System.out.println("\nDo you want to continue the game????");
            t=sc.nextInt();
                if(t!=4){System.out.println("Since you did not choose to continue so Game is exiting...............................");
                          break;}
            
                          
                   



            }    while(t!=5);
    
            System.out.println("******GAME OVER********");
            if(scoreP>scoreC)
            System.out.println("Player 2 i.e " +name+" is the winner");
              else if(scoreC>scoreP)
            System.out.println("Player 1 i.e Computer is the winner");
            else
                   System.out.println("It is a draw...");
    

}



}