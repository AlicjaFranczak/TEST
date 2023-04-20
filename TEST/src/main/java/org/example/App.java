package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello hello hello " );

        String[] citiesEU = new String[] {"Berlin", "Sofia", "Wrocław", "Praque"};

        for(String city : citiesEU) {
            System.out.println(city);
        }
        for (int i = citiesEU.length -1 ; i >= 0 ; i--) {
            System.out.println(citiesEU[i]);
        }
        for (int i = 0; i < citiesEU.length ; i = i+2) {
            System.out.println(citiesEU[i]);
        }
    }
}
