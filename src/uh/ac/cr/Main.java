package uh.ac.cr;

import uh.ac.cr.shape.Shape;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Shape shape= new Shape();
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcionNun;
        var op = true;
        while (op) {
            System.out.println("-------------");
            System.out.println("Menu");
            System.out.println("1. Diamond");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Circle");
            System.out.println("5.Salir");
            opcionNun = entrada.nextInt();
            if (opcionNun == 5) {
                System.out.println("finalizo");
                break;
            } else {
                switch (opcionNun) {
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Selects number of rows.");
                        int lengthDesired = scanner1.nextInt();
                        shape.printDiamond(lengthDesired);
                        break;
                    case 2:
                        Scanner scanner2= new Scanner(System.in);
                        System.out.println("Selects number large");
                        int large =scanner2.nextInt();
                        shape.printSquare(large);
                        break;
                    case 3:
                        Scanner scanner3= new Scanner(System.in);
                        System.out.println("Ingrese la base: ");
                        int base = scanner3.nextInt();
                        System.out.println("Ingrese la altura: ");
                        int altura = scanner3.nextInt();
                        shape.printRectangle(base, altura);
                        break;
                    case 4:
                        Scanner scanner4 = new Scanner(System.in);
                        System.out.println("Ingrese la radio: ");
                        int radio = scanner4.nextInt();
                        shape.printcircle(radio);
                        break;
                    default:
                        System.out.print("Opcion no valida");

                }

            }
        }
    }
    }
