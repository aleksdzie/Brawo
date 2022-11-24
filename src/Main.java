import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Brawo " +name+"!");
        }
    }
}