import java.util.Scanner;

class Temperature{
    double temp;
    Temperature(double temp){
      this.temp=temp;
    }

    double fahrenheitToCelsius(){
        return (temp-32)*5/9;
    }

    double celsiusToFahrenheit(){
        return (temp*9/5)+32;
    }
    
    void displayCelsius(double tempCelsius){
        System.out.println("Temperature in celsius would be "+tempCelsius+" degree celsius.");
    }

    void displayFahrenheit(double tempFahrenheit){
        System.out.println("Temperature in fahrenheit would be "+tempFahrenheit+" degree fahrenheit.");
    }
}
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature :");
        double temp=input.nextDouble();
        Temperature temperature=new Temperature(temp);
        double tempCelsius=temperature.fahrenheitToCelsius();
        double tempFahrenheit=temperature.celsiusToFahrenheit();
        temperature.displayCelsius(tempCelsius);
        temperature.displayFahrenheit(tempFahrenheit);

        input.close();
    }
}
