package ru.warehouse.planner;

public class Main {
    public static void main(String... args) {
        Scan scanner = new Scan();
        Point point = new Point();
        System.out.println("Print x");
        point.setX(scanner.scan);
        System.out.println("Print y");
        point.setY(scanner.scan);
        System.out.println(point.getX() + point.getY());


    }
}

