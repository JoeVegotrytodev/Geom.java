package com.pflb.at.l4;

public class EntryPoint {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        Rectangle rectangle1 = new Rectangle(5.5, 6.8);
        Rectangle rectangle2 = new Rectangle(6.5, 2.8);

        Object[] Objects = new Object[3];
        Objects[0] = circle1;
        Objects[1] = rectangle1;
        Objects[2] = rectangle2;

        for (int i = 0; i < 3; i++){
            System.out.println(Objects[i].toString());
            System.out.println("- - - - - - - - -");
        }

        Geom[] Geoms = new Geom[3];
        Geoms[0] = circle1;
        Geoms[1] = rectangle1;
        Geoms[2] = rectangle2;

        for (int i = 0; i < 3; i++){
            System.out.println(Geoms[i].toString());
            System.out.println("- - - - - - - - -");
        }
    }
}
