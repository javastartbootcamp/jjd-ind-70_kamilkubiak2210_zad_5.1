package pl.javastart.task;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPointLocation() {
        System.out.print("Punkt (" + x + ", " + y + ") ");

        if (x == 0 && y == 0) {
            System.out.println("leży na środku układu współrzędnych");
        } else if (x == 0 && y != 0) {
            System.out.println("leży na osi Y");
        } else if (x != 0 && y == 0) {
            System.out.println("leży na osi X");
        } else if (x > 0 && y > 0) {
            System.out.println(getQuarterInfo("I"));
        } else if (x < 0 && y > 0) {
            System.out.println(getQuarterInfo("II"));
        } else if (x < 0 && y < 0) {
            System.out.println(getQuarterInfo("III"));
        } else if (x > 0 && y < 0) {
            System.out.println(getQuarterInfo("IV"));
        }
    }

    private static String getQuarterInfo(String quarter) {
        return "leży w " + quarter + " ćwiartce układu współrzędnych ";
    }
}
