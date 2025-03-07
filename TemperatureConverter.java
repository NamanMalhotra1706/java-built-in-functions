public class TemperatureConverter {
    public static void main(String[] args) {
        double farhenheit = 10.0;  
        double farhenheitTocelsius =  farhenheitToCelsius(farhenheit) ;
        System.out.println( farhenheit + " farhenheit is equal to " + farhenheitTocelsius + " celcius.");

        double celcius = 10.0;
        double celsiusToFarhenheit = celsiusToFarhenheit(celcius);
        System.out.println(celcius + " celcius is equal to " + celsiusToFarhenheit + " farhenheit.");
    }

    public static double farhenheitToCelsius(double farhenheit) {
        double farhenheitTocelsius = (farhenheit - 32) * 5 / 9;
        return farhenheitTocelsius;
    }

    //Method to convert celsius to farhenheit
    public static double celsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

}
