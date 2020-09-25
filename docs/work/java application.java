import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running;
        
        running = true;
        while (running) {
            String userinput;
            
            System.out.println("Enter a temperature in degrees Celsius (blank to quit)");
            userinput = input.nextLine();
            if (userinput.length() > 0) {
                double celsius;
                
                celsius = Double.parseDouble(userinput);
                System.out.print("Temperature in degrees Fahrenheit = ");
                System.out.println(celsiusToFahrenheit(celsius));
            } else {
                running = false;
            }
        }
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        
        fahrenheit = celsius * 9 / 5 + 32;
        
        return fahrenheit;
    }
}
