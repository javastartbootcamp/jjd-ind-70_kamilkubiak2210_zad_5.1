package pl.javastart.task;

public class Point {
    void checkPoint(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("leży na środku układu współrzędnych");
        }
        if (x == 0 && y != 0) {
            System.out.println("leży na osi Y");
        }
        if (x != 0 && y == 0) {
            System.out.println("leży na osi X");
        }
        if (x > 0 && y > 0) {
            System.out.println("leży w I ćwiartce układu współrzędnych ");
        }
        if (x < 0 && y > 0) {
            System.out.println("leży w II ćwiartce układu współrzędnych ");
        }
        if (x < 0 && y < 0) {
            System.out.println("leży w III ćwiartce układu współrzędnych ");
        }
        if (x > 0 && y < 0) {
            System.out.println("leży w IV ćwiartce układu współrzędnych ");
        }
    }
}
