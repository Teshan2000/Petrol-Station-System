import java.util.Scanner;

public class Petrol_Station {
    public static void main(String[] args) {
        
        System.out.println("Welcome to our Petrol Station System!");
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose your urgency");
        System.out.println("Enter the number of your choice: ");  
        int urgency = reader.nextInt();

        switch (urgency) {
            case 1:
            Urgent();
            break; 

            case 2:
            Normal(); 
            break;

            case 3:
            NotUrgent(); 
            break;
        }

        System.out.println("Choose your distance");
        System.out.println("Enter the number of your choice: ");  
        int distance = reader.nextInt();

        switch (distance) {
            case 1:
                Faraway();                
            break;

            case 2:
                NotSoFar(); 
            break;

            case 3:
                Near();
            break;
}

        System.out.println("");
    }
    
}
