package org.example;

public class Main {

    public static void main (String [] args) {
        Circle circle1 = new Circle (10, 10, 20);
        Circle circle2 = new Circle (15, 15, 21);

        circle1.calculateArea();    //Calculamos las areas de los círculos para luego compararlos
        circle2.calculateArea();

        int resultCircles = circle1.compareTo (circle2);    //comparamos el tamaño de los círculos

        System.out.println(resultCircles);      //imprimimos el resultado

        Rectangle rec1 = new Rectangle (10, 10, 20, 20);
        Rectangle rec2 = new Rectangle (30, 30, 50, 50);

        rec1.calculateArea();       //Calculamos las areas de los rectángulos para luego compararlos
        rec2.calculateArea();

        int resultRecs = rec1.compareTo (rec2);     //comparamos el tamaño de los rectángulos

        System.out.println(resultRecs);     //imprimimos el resultado
    }

}