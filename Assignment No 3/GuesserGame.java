import java.util.*;
import java.lang.Math;

class Computer
{
	int compGuess;
	int max = 10;
	int min = 0;
	int compGuess()
	{
		compGuess=(int)(Math.random()*(max-min+1)+min); 
		return compGuess;
	}	
}

class Player
{
	 int [] playerGuess=new int[4];
	
	void playerGuess1()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println();
		for(int i=1;i<4;i++) {
		System.out.println("Player"+i+" kindly guess the number between 0 to 10");
		playerGuess[i]=scan.nextInt();
		}
		if(playerGuess[1]>=10 || playerGuess[2]>=10 ||playerGuess[3]>=10 ||
		   playerGuess[1]<=0 ||playerGuess[2]<=0 ||playerGuess[3]<=0 ) 
		{
			System.out.println("Enter the correct input");
			playerGuess1();
		}
		
	}
}

class Judge
{
	int comp;
	int player1;
	int player2;
	int player3;
	void collectNumFromComputer()
	{
		Computer c=new Computer();
		comp=c.compGuess();
		
	}
	void collectNumFromPlayers()
	{
		Player p=new Player();
		p.playerGuess1();
		 player1 =p.playerGuess[1];
		 player2 =p.playerGuess[2];
		 player3 =p.playerGuess[3];
		
	}

	void compare()
	{
		System.out.println("Computer guess is "+comp);
		if(comp==player1)
		{
			if(comp==player2 && comp==player3)
			{
				System.out.println("All players won the game");
			}
			else if(comp==player2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(comp==player3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(comp==player2)
		{
			if(comp==player3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(comp==player3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
}
class SinglePlayer{ 
	int playerGuess;
	int comp;
	void compGuess() 
	{
		Computer c=new Computer();
		comp=c.compGuess();
	}
	void playerGuess() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player guess the number between 0 to 10");
		playerGuess=sc.nextInt();
		if(playerGuess>=10 ||playerGuess <=0) {
			System.out.println("Enter correct input");
			playerGuess();
		}
	}
	void judge() 
	{
		Scanner sc = new Scanner(System.in);
		boolean k =false;
	 for(int i=0;i<2;i++) {
		
		if(comp==playerGuess) 
		{
			System.out.println("Computer Guess is "+ comp);
			System.out.println("Player won the game");
			k=true;
			break;
		}
		else if(comp > playerGuess) 
		{
			System.out.println("Player guess the number higher");
			
		}
		else if(comp < playerGuess) 
		{
			System.out.println("Player guess the number lower");
		}
	    playerGuess=sc.nextInt();
		}
	 if(k==false) 
	 {
		 System.out.println("Computer Guess is "+ comp);
		 System.out.println("Player lost the game");
	 }
	 
		
	}
}
class Mode{
	void mode() {
	Scanner sc =new Scanner(System.in);
	System.out.println("Please select 1 for Single Player And "+ "2 for multiplayer");
	  int mode=sc.nextInt();
	  if(mode==1) 
	  {
		  System.out.println("You have 3 chances to guess the number");
		  SinglePlayer p = new SinglePlayer();
		  p.compGuess();
		  p.playerGuess();
		  p.judge();
	  }
	 
	  else if (mode ==2) 
	  {
		Judge j1=new Judge();
		j1.collectNumFromComputer();
		j1.collectNumFromPlayers();
		j1.compare();
	  }
	  else 
	  {
		  System.out.println("Wrong input");
	  }
	
       
}
	
	
}
public class GuesserGame {
      public static void main(String args[])
      {
    	  
    	  System.out.println("Welcome to Guesser Game");
    	  Mode m = new Mode();
    	  m.mode();
    	  
    	 
      }
}
