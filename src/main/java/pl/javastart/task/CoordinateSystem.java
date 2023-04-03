package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    private final Point point = new Point();

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        System.out.println("Podaj X");
        int x = scanner.nextInt();
        System.out.println("Podaj Y");
        int y = scanner.nextInt();
        System.out.print("Punkt (" + x + "," + y + ") ");
        point.checkPoint(x, y);
    }
}
