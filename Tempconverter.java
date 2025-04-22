import java.util.Scanner;
class Temperature{
    private double fahrenheit;
    private double kelvin;
    private double celsius;
    
    void setfar(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }
    void setkelvin(double kelvin){
        this.kelvin = kelvin;
    }
    void setcelsius(double celsius){
        this.celsius = celsius;                       
    }
    double getfar(){
        return fahrenheit;
    }
    double getkelvin(){
        return kelvin;
    }
    double getcelsius(){
        return celsius;
    }
    
}
class Subtemperature extends Temperature{
    double result;
    void display(){
        System.out.println("=================================");
        System.out.println("      TEMPERATURE CONVERTER      ");
        System.out.println("=================================");
    }
    void menu(){
        System.out.println("\nChoose the conversion type: \n");
        System.out.println("_________________________________\n");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Kelvin to Celsius");
        System.out.println("4. Celsius to Kelvin");
        System.out.println("5. Exit");
        System.out.println("_________________________________\n");
        System.out.print("Enter your choice: ");
    }
    void formula(){
        System.out.print("Enter the temperature value(°K, °F, °C): ");
    }
    void option(int option){
        switch(option){
            case 1 -> result = (getcelsius() * 1.8) + 32;
            case 2 -> result = (getfar() - 32) * 5 / 9;
            case 3 -> result = getcelsius() + 273.4;
            case 4 -> result = getkelvin() - 273.4;
            case 5 -> System.exit(0);
        }
    }
    void finalresult(){
        System.out.println("\nConverted temperature: " + result + "\n\n");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Subtemperature s1 = new Subtemperature();
	    Scanner scan = new Scanner(System.in);
	    int option; double temp; char type;
        while(true){
            s1.display();
    	    s1.menu();
    	    option = scan.nextInt();
    	    s1.option(option);
    	    s1.formula();
            temp = scan.nextDouble();
            s1.setcelsius(temp);
            s1.setfar(temp);
            s1.setkelvin(temp);
            s1.finalresult();
        }    
	}
}
