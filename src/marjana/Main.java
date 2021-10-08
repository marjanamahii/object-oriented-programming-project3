package marjana;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player("Shakib", 75);
        Cricket cricket = new Cricket("International match", 20, player);
        cricket.display();
        Football football = new Football();
//        new Football();
    }
}
