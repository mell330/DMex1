import java.util.Random;
import java.util.Scanner;

class Greeting{
    String name;
    Greeting(){
	System.out.println("What is your name?");
	System.out.print("> ");
	Scanner sc = new Scanner(System.in);
	name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
    }
}

class DiceGame{
    public static void main(String[] args){

	Greeting people = new Greeting();
	
	Random rand = new Random();
	System.out.println("Rolling dice...");
	int sum = 0;
	for(int i=0 ; i<2 ; i++){
	    int temp = rand.nextInt(5)+1;
	    System.out.println("Die " + (i+1) + ": " + temp);
	    sum += temp;
	}
	System.out.println("Total value: " + sum);
    }
}
