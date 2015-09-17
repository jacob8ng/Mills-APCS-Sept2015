/*
 * Jacob Ng
 * Sept. 17, 2015
 * Hourglass (prints hourglass shape using loops)
 */
public class Hourglass{
    public static void main(String[] args){
        lineQuote();
        countDown();
        lines();
        countUp();
        lineQuote();
    }
    public static void lineQuote(){
        System.out.print("|");
        for(int i=1; i<=10; i++){
            System.out.print("\"");
        }
        System.out.println("|");
    }
    public static void countDown(){
        for(int i=4; i>0; i--){
            