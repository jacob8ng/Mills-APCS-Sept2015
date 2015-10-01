/*
 * Jacob Ng
 * APCS
 * Sept. 26, 2015
 * Print trees using parameters
 * 2 segments, 5 lines
 * HEIGHT<2
 */
public class Trees2{
    public static final int SEGMENT=2;
    public static final int HEIGHT=5;
    public static void main(String[] args){
        tree(SEGMENT, HEIGHT);
    }
    public static void tree(int segment, int height){
        for(int part=1; part<=segment; part++){
            for(int lines=1; lines<=height; lines++){
                for(int spaces=1; spaces<=((((segment*height)/2)-(((height/2)-(((height-1)/2))*1)+((lines*1)-1)))+(((height/2)-((height-1)/2))*((segment+segment)/(segment*segment))))-(part-1); spaces++){
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
        for(int spaces=1; spaces<=((SEGMENT*HEIGHT)/2)-((((SEGMENT+1)/2)-(SEGMENT/2))*((HEIGHT/2)-((HEIGHT-1)/2))); spaces++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
    public static void base(){
        for(int spaces=1; spaces<=((SEGMENT*HEIGHT)/2)-(((((SEGMENT+1)/2)-(SEGMENT/2))*((HEIGHT/2)-((HEIGHT-1)/2)))+3); spaces++){
            System.out.print(" ");
        }
        System.out.println("*******");
    }
}