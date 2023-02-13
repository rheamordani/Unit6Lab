import java.util.Scanner;
public class DrawingGeometricFigures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Welcome! This program will draw a geometry figure of your choice.");
            System.out.println("Make your choice from the following:");
            System.out.println("1. a square");
            System.out.println("2. a rectangle");
            System.out.println("3. a triangle");
            System.out.println("-1 to quit");
            int choice1 = input.nextInt();
            if (choice1 == -1) {
                run = false;
                System.out.println("Thank you and have a great day!");
            }
            if (choice1 == 1) {
                System.out.println("What is the length of a side: ");
                int sideLength = input.nextInt();
                System.out.println("Border-only or solid (enter border/solid): ");
                input.nextLine();
                String borderOrSolid = input.nextLine();
                System.out.println("Character to use for drawing?");
                char charForDrawing = input.next().charAt(0);
                drawingSquare(sideLength, borderOrSolid, charForDrawing);
            }
            if (choice1 == 2) {
                System.out.println("What is the width of the rectangle: ");
                int sideWidth = input.nextInt();
                System.out.println("What is the length of the rectangle: ");
                int sideLength = input.nextInt();
                System.out.println("Border-only or solid (enter border/solid): ");
                String borderOrSolid = input.nextLine();
                System.out.println("Character to use for drawing?");
                char charForDrawing = input.next().charAt(0);
                drawingRectangle(sideWidth, sideLength, charForDrawing, borderOrSolid);
            }
            if (choice1 == 3) {
                System.out.println("Enter the height: ");
                double height = input.nextDouble();
                System.out.println("Triangle points up or down (up/down): ");
                String upOrDown = input.nextLine();
                System.out.println("Border-only or solid (enter border/solid): ");
                String borderOrSolid = input.nextLine();
                System.out.println("Character to use for drawing?");
                char charForDrawing = input.next().charAt(0);
            }
        }
    }

    public static void drawingSquare(int sideLength, String borderOrSolid, char charForDrawing) {
        int i = 1;
        int j = 1;
        if (borderOrSolid.equalsIgnoreCase("solid")) {
            for (i = 1; i <= sideLength; i++) {
                System.out.println();
                for (j = 1; j <= sideLength; j++) {
                    System.out.print(charForDrawing + " ");
                }
            }
            System.out.println();
        }
        if (borderOrSolid.equalsIgnoreCase("border")) {
            for (i = 1; i <= sideLength; i++) {
                System.out.print(charForDrawing + " ");
            }
            System.out.println();
            for (i = 1; i <= sideLength - 2; i++) {
                System.out.print(charForDrawing);
                for (j = 1; j <= 2 * sideLength - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print(charForDrawing);
                System.out.println();
            }
            for (i = 1; i <= sideLength; i++) {
                System.out.print(charForDrawing + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void drawingRectangle(int width, int length, char charForDrawing, String borderOrSolid) {
        int i = 1;
        int j = 1;
        if (borderOrSolid.equalsIgnoreCase("solid")) {
            for (i = 1; i <= width; i++) {
                System.out.println();
                for (j = 1; j <= length; j++) {
                    System.out.print(charForDrawing);
                }
            }
            System.out.println();
        }
    }
    /*
    public static void drawingTriangle(int height, String upOrDown, char charForDrawing, String borderOrSolid) {
        int sideLength = (int)((2*Math.sqrt(3)/3));
        for (int i=0; i<sideLength; i++){
            for(int j=0; j<sideLength){

            }
        }
    }

     */
}




