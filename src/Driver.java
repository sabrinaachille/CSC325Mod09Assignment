import java.util.Scanner;

// This client code accepts user input to which is passed to the application to generate a styled garment
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int style;

        // Loop validates user input
        while (true) {
            System.out.println("Select a style to generate your garment! \n1. Professional\n2. Casual\n3. Party\nStyle selection: ");
            try{
                style = sc.nextInt();
                // Valid input
                if (style > 0 && style < 4) {
                    break;
                }
                else {
                    System.out.println("Please enter a valid style.\nStyle selection:");
                }
            // Handles non int input
            } catch (Exception e) {
                System.out.println("Invalid input.");
                sc.next();
            }
        }

        // Generates and displays styled garment
        Application app = new Application(style);
        app.displayGarment();
    }
}