import java.util.Scanner;

public class Petrol_Station {
    public static void main(String[] args) {
        
        System.out.println("Welcome to our Petrol Station System!");
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose your urgency");
        System.out.println("\t 1. Urgent"); 
        System.out.println("\t 2. Normal"); 
        System.out.println("\t 3. Not Urgent"); 

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

            default:
            System.out.println("Enter again");
        }

        System.out.println("Choose your distance");
        System.out.println("\t 1. Far Away"); 
        System.out.println("\t 2. Not So Far"); 
        System.out.println("\t 3. Near"); 

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

            default:
            System.out.println("Enter again");
        }


        if(urgency == 1 && distance == 1){
            System.out.println("Token is 1");
        }
        else if(urgency == 1 && distance == 2){
            System.out.println("Token is 2");
        }
        else if(urgency == 1 && distance == 3){
            System.out.println("Token is 3");
        }

        else if(urgency == 2 && distance == 1){
            System.out.println("Token is 4");
        }
        else if(urgency == 2 && distance == 2){
            System.out.println("Token is 5");
        }
        else if(urgency == 2 && distance == 3){
            System.out.println("Token is 6");
        }

        else if(urgency == 3 && distance == 1){
            System.out.println("Token is 7");
        }
        else if(urgency == 3 && distance == 2){
            System.out.println("Token is 8");
        }
        else if(urgency == 3 && distance == 3){
            System.out.println("Token is 9");
        }

    }
        
    static void Urgent() {       
        System.out.println("\t\t--You have an urgent journey--");    
    }
    static void Normal() {
        System.out.println("\t\t--You have a normal journey--");
    }
    static void NotUrgent() {
        System.out.println("\t\t--You do not have an urgent journey--");
    }
    

    static void Faraway() {        
        System.out.println("\t\t--You are going to a far away distance--");        
    }
    static void NotSoFar() {
        System.out.println("\t\t--You are going to a normal distance--");
    }
    static void Near() {
        System.out.println("\t\t--You are going to a near distance--");
    }

    
}

