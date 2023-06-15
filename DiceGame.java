import java.util.Random;

class Jadge{
    int E = 7;
    void jadge(int x){
	if(x >= E)System.out.println("You won!");
	else System.out.println("You lost.");
    }
}

class DiceGame{
    public static void main(String[] args){	
	Random rand = new Random();
	System.out.println("Rolling dice...");
	int sum = 0;
	for(int i=0 ; i<2 ; i++){
	    int temp = rand.nextInt(5)+1;
	    System.out.println("Die " + (i+1) + ": " + temp);
	    sum += temp;
	}
	System.out.println("Total value: " + sum);

	Jadge ja = new Jadge();
	ja.jadge(sum);
    }
} 
