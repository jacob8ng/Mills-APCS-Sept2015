/*
 * Jacob Ng
 * September 21,2015
 * Stars and Lines (program using nested for loops)
 */
public class StarsAndLines{
    public static void main(String[] args){
        for(int lines=1; lines<=7; lines++){
            for(int stars=1; stars<=7-lines; stars++){
                System.out.print("*");
            }
            for(int spaces=1; spaces<=lines; spaces++){
                System.out.print(" ");
            }
            for(int slash=1; slash<=12-2*(lines-1); slash++){
                System.out.print("/");
            }
            for(int backslash=1; backslash<=2*(lines-1); backslash++){
                System.out.print("\\");
            }
            for(int spaces=1; spaces<=lines; spaces++){
                System.out.print(" ");
            }
            for(int stars=1; stars<=7-lines; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}