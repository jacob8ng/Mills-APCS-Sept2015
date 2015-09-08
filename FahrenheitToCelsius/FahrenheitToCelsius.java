/*
 * Jacob Ng
 * APCS
 * Fahrenheit to Celsius
 * Sept. 8, 2015
 */
public class FahrenheitToCelsius{
    public static void main (String[] args){
        double fahrenheit = 212.0;
        double celsius;
        celsius = (5.0/9.0) * (fahrenheit - 32.0);
        System.out.println(celsius);
    }
}