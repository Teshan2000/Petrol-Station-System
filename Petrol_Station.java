import java.util.Scanner;
import java.util.ArrayList;

public class Petrol_Station {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();  
        
        System.out.println("Welcome to our Petrol Station System!");
        Scanner reader = new Scanner(System.in);

        for(int i = 1; i <= 9; i++) {

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
                System.out.println("Your Token is 1");
                arrlist.add(1); 
            }
            else if(urgency == 1 && distance == 2){
                System.out.println("Your Token is 2");
                arrlist.add(2); 
            }
            else if(urgency == 1 && distance == 3){
                System.out.println("Your Token is 3");
                arrlist.add(3); 
            }
            else if(urgency == 2 && distance == 1){
                System.out.println("Your Token is 4");
                arrlist.add(4); 
            }
            else if(urgency == 2 && distance == 2){
                System.out.println("Your Token is 5");
                arrlist.add(5); 
            }
            else if(urgency == 2 && distance == 3){
                System.out.println("Your Token is 6");
                arrlist.add(6); 
            }
            else if(urgency == 3 && distance == 1){
                System.out.println("Your Token is 7");
                arrlist.add(7); 
            }
            else if(urgency == 3 && distance == 2){
                System.out.println("Your Token is 8");
                arrlist.add(8); 
            }
            else if(urgency == 3 && distance == 3){
                System.out.println("Your Token is 9");
                arrlist.add(9); 
            }
        }

        System.out.println("------------------------------------"); 
        System.out.println("------ This is your Token List------\n"); 
        System.out.println(arrlist);



        System.out.println("\t\t 1. Selection Sort"); 
        System.out.println("\t\t 2. Insertion Sort"); 
        System.out.println("\t\t 3. Bubble Sort"); 

        System.out.println("Enter the number of your choice: ");
        int sort = reader.nextInt();

        switch (sort) {

            case 1:
                selectionSort(clients, 0, c - 1);  
            
                System.out.print("\t\tSelection Sort: ");
                for (int i = 0; i < c; i++)                   
                System.out.print(clients[i] + " ");         
                System.out.println(" "); 
            break;

            case 2:
                insertionSort(clients);            
                
                System.out.print("\t\t Insertion Sort: ");
                for (int k = 0; k < c; k++)          
                System.out.print(clients[k] + " "); 
                System.out.println(" ");  
            break;

            case 3:
                bubbleSort(clients);            
                
                System.out.print("\t\tBubble Sort ");            
                for (int h = 0; h < c; h++)          
                System.out.print(clients[h] + " "); 
                System.out.println(" "); 
            break;
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


    //Selection Sort
    static void selectionSort(int[] clients, int low, int high) {
        
        for (int h = low; h <= high; h++)
            swap (clients, h, getSmallest(clients, h, high));
    }
    static int getSmallest(int[] clients, int low, int high) {

        int small = low;
        for (int i = low + 1; i <= high; i++)
          if (clients[i] < clients[small])   
            small = i;     
        return small;
    }
    static void swap(int[] clients, int i, int j) {

        int temp = clients[i];
        clients[i] = clients[j];
        clients[j] = temp;        
    }

    //Insertion Sort
    static void insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {

          int key = elements[i];
          int j = i - 1;
          while (j >= 0 && key < elements[j]) {
            elements[j + 1] = elements[j];
            j--;
          }
          elements[j + 1] = key;
        }
    }

    //Bubble Sort
    static void bubbleSort(int[] clients) {
    
        int n = clients.length;
        int temp = 0;
  
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
  
                if (clients[j - 1] > clients[j]) {
                  
                    temp = clients[j - 1];
                    clients[j - 1] = clients[j];
                    clients[j] = temp;
                }  
            }
        }
    }
}

