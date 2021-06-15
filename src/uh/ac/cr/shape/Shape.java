package uh.ac.cr.shape;

public class Shape {
    public static void printDiamond(int lengthDesired) {

        //Creating a new line, just an visual printing.
        System.out.println();

        //Calculating number of rows that should be printed.
        int n1 = lengthDesired / 2 + 1;

        //For loop to print all the blanks required before printing the * on the next for loop.
        for (int actualRow = 1; actualRow <= n1; actualRow++) {
            //Blank spaces to print
            for (int blank = 1; blank <= n1 - actualRow; blank++) {
                System.out.print(" ");
            }
            //Printing all the * required.
            for (int symbol = 1; symbol <= (2 * actualRow) - 1; symbol++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Printing second half of the shape.
        n1--;
        for (int actualRow = 1; actualRow <= n1; actualRow++) {
            //For loop to print all the blanks required before printing the * on the next for loop.
            for (int blank = 1; blank <= actualRow; blank++) {
                System.out.print(" ");
            }
            //Printing all the * required.
            for (int symbol = 1; symbol <= (n1 - actualRow) * 2 + 1; symbol++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printSquare(int large) {
        int n1 = large;
        for (int i = 0; i < n1; ++i) {//filas
            for (int k = 0; k < n1; ++k) {//columnas
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    public static void printRectangle(int n1, int n2) {
        int base = n1;
        int altura = n2;
        for (int i = 0; i <= n2; i++) {
            for (int j = 0; j < n1; j++)
                System.out.print(" *");
            System.out.println(" ");

        }


    }

    public static void printcircle(int radio) {
        int r=radio;
        for (int x = 0; x <= r * 2; ++x){
            for (int y = 0; y <= r * 2; ++y)
                if ((Math.pow( y - r,2) +Math.pow( x - r,2)) <=Math.pow(r,2))
                    System.out.print("*");

                    else{
                        System.out.print(" ");
                }
            System.out.println(" ");


            }
        return ;


    }}