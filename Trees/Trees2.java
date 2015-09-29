/*
 * Jacob Ng
 * APCS
 * Sept. 26, 2015
 * Print trees using parameters
 * 2 segments, 5 lines
 */
public class Trees2{
    public static void main(String[] args){
        int segment = 2;
        int height =5;
        tree(segment, height);
    }
    public static void tree(int segment, int height){
        for(int part=1; part<=segment; part++){
            for(int lines=1; lines<=height; lines++){
                for(int spaces=1; spaces<=(6-(lines*1))-(part-1); spaces++){
                    System.out.print(" ");
                }
                for(int stars=1; stars<=((part-1)*2)+(-1+(lines*2)); stars++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        singleStar();
        singleStar();
        base();
    }
    public static void singleStar(){
        System.out.println("     *");
    }
    public static void base(){
        System.out.println("  *******");
    }
}