// This program will print out a continent and the largest city in that continent, based on the value of an integer.

public class Continents {
    public static void main(String[] args) {
        // Define a variable to represent the selected continent
        int continent = 4;

        // Use a switch statement to determine which continent and city to display
        switch (continent) {
            case 1: 
                // If continent is 1, print the details for North America
                System.out.println("North America: Mexico City, Mexico.");
                break;
            case 2:
                // If continent is 2, print the details for South America
                System.out.println("South America: Sao Paulo, Brazil.");
                break;
            case 3:
                // If continent is 3, print the details for Europe
                System.out.println("Europe: Moscow, Russia.");
                break;
            case 4:
                // If continent is 4, print the details for Africa
                System.out.println("Africa: Lagos, Nigeria.");
                break;
            case 5:
                // If continent is 5, print the details for Asia
                System.out.println("Asia: Shanghai, China.");
                break;
            case 6:
                // If continent is 6, print the details for Australia
                System.out.println("Australia: Sydney, Australia.");
                break;
            case 7:
                // If continent is 7, print the details for Antarctica
                System.out.println("Antarctica: McMurdo Station, US.");
                break;
            default:
                // If none of the cases match, print an undefined continent message
                System.out.println("Undefined continent!");
        }
    }
}
