import java.util.Scanner;

public class Kup {
    public void solution() {
        System.out.println("Kúp térfogatszámítás");
        Scanner scanner = new Scanner(System.in);
        System.out.print("> Add meg az oldalát: ");
        String aSideStr = scanner.nextLine();
        System.out.print("> Add meg a magasságot1: ");
        String heightStr = scanner.nextLine();

        double aSide = Double.parseDouble(aSideStr);
        double height = Double.parseDouble(heightStr);
        double volume = 1 / 3.0 * aSide * aSide * height;

        System.out.printf("%.2f", volume);

        scanner.close();
    }
} 
