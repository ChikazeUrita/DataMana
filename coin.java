import java.util.Scanner;

public class coin{
    public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Who are you?");
	String string = scanner.next();
	System.out.println("Hello, " + string + "!");
	
	System.out.println("Tossing a coin...");
        int head = 0;
	int tail = 0;
	for(int i = 1;i <= 3; i++){
	    int coin = new java.util.Random().nextInt(5);
	    if(coin%2 == 0){
		System.out.println("Round " + i + ": Heads");
		head++;
	    } else if(coin%2 == 1){
		System.out.println("Round " + i + ": Tails");
		tail++;
	    }
	}
	
	System.out.println("Heads: " + head + ", Tails: " + tail);

	if(head > tail) System.out.println(string + " won!");
	else System.out.println(string + " lost!");
    }
}

/*import java.util.Scanner;

public class coin{
    public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Who are you?");
	String string = scanner.next();
	System.out.println("Hello, " + string + "!");
	
	System.out.println("Tossing a coin...");
        int head = 0;
	int tail = 0;
	for(int i = 1;i <= 3; i++){
	    int coin = new java.util.Random().nextInt(5);
	    if(coin%2 == 0){
		System.out.println("Round " + i + ": Heads");
		head++;
	    } else if(coin%2 == 1){
		System.out.println("Round " + i + ": Tails");
		tail++;
	    }
	}
	
	System.out.println("Heads: " + head + ", Tails: " + tail);

	if(head > tail) System.out.println("You won");
	else System.out.println("You lost");
    }
    }*/
//勝敗メッセージ追加

/*import java.util.Scanner;

public class coin{
    public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Who are you?");
	String string = scanner.next();
	System.out.println("Hello, " + string + "!");
	
	System.out.println("Tossing a coin...");
        int head = 0;
	int tail = 0;
	for(int i = 1;i <= 3; i++){
	    int coin = new java.util.Random().nextInt(5);
	    if(coin%2 == 0){
		System.out.println("Round " + i + ": Heads");
		head++;
	    } else if(coin%2 == 1){
		System.out.println("Round " + i + ": Tails");
		tail++;
	    }
	}
	
	System.out.println("Heads: " + head + ", Tails: " + tail);
    }
    }*/
//username追加

/*public class coin{
    public static void main(String[] args){
	
	System.out.println("Tossing a coin...");
        int head = 0;
	int tail = 0;
	for(int i = 1;i <= 3; i++){
	    int coin = new java.util.Random().nextInt(5);
	    if(coin%2 == 0){
		System.out.println("Round " + i + ": Heads");
		head++;
	    } else if(coin%2 == 1){
		System.out.println("Round " + i + ": Tails");
		tail++;
	    }
	}
	
	System.out.println("Heads: " + head + ", Tails: " + tail);
    }
    }*/
// 一番最初
