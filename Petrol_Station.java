import java.util.Scanner;
import java.util.ArrayList;

public class Petrol_Station {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();  
        
        System.out.println("\t\t\t\t\t\t ------------------------------------------------------------------------------"); 
        System.out.println("\t\t\t\t\t\t|                     Welcome to our Petrol Station System!                    |"); 
        System.out.println("\t\t\t\t\t\t|                                                                              |");            
        System.out.println("\t\t\t\t\t\t|  Let's choose your priority to get fuel according to the sorting algorithms  |");
        System.out.println("\t\t\t\t\t\t|                                                                              |");    
        System.out.println("\t\t\t\t\t\t|            You have to select 2 choices to check your priority               |");
        System.out.println("\t\t\t\t\t\t ------------------------------------------------------------------------------"); 
        Scanner reader = new Scanner(System.in);

        for(int i = 1; i <= 9; i++) {

            System.out.println("\n\n ");
            System.out.println("-----------------------------------------------");    
            System.out.println("          Welcome User number " + i    );
            System.out.println("-----------------------------------------------");    
            
            System.out.println("\tThis is your First Option");
            System.out.println(" "); 

            System.out.println("-----------------------------------------------");
            System.out.println("|        (1) Choose your Urgency              |");  
            System.out.println("-----------------------------------------------");
            System.out.println("\t 1. Urgent"); 
            System.out.println("\t 2. Normal"); 
            System.out.println("\t 3. Not Urgent"); 
            System.out.println("-----------------------------------------------");

            System.out.println("Enter the number of your choice: ");  
            int urgency = reader.nextInt();
            System.out.println(" "); 

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
                System.out.println("-----------------------------------------------");
                System.out.println("|            Your answer is wrong!            |");
                System.out.println("|                                             |");
                System.out.println("|            You can't get a token!           |");
                System.out.println("|                                             |");
                System.out.println("|        Please try again in next round!      |");
                System.out.println("-----------------------------------------------");
                main(args);
            }

            System.out.println("\n");
            System.out.println("This is your Second Option");
            System.out.println(" ");  
            
            System.out.println("-----------------------------------------------");
            System.out.println("|        (2) Choose your Distance             |");   
            System.out.println("-----------------------------------------------");
            System.out.println("\t 1. Far Away"); 
            System.out.println("\t 2. Not So Far"); 
            System.out.println("\t 3. Near"); 
            System.out.println("-----------------------------------------------");

            System.out.println("Enter the number of your choice: ");  
            int distance = reader.nextInt();
            System.out.println(" "); 

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
                System.out.println("-----------------------------------------------");
                System.out.println("|            Your answer is wrong!            |");
                System.out.println("|                                             |");
                System.out.println("|            You can't get a token!           |");
                System.out.println("|                                             |");
                System.out.println("|        Please try again in next round!      |");
                System.out.println("-----------------------------------------------");
                main(args);
            }


            if(urgency == 1 && distance == 1){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 1               |");    
                System.out.println("-----------------------------------------------"); 
                arrlist.add(1); 
            }
            else if(urgency == 1 && distance == 2){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 2               |"); 
                System.out.println("-----------------------------------------------");    
                arrlist.add(2); 
            }
            else if(urgency == 1 && distance == 3){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 3               |");    
                System.out.println("-----------------------------------------------"); 
                arrlist.add(3); 
            }
            else if(urgency == 2 && distance == 1){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 4               |"); 
                System.out.println("-----------------------------------------------");    
                arrlist.add(4); 
            }
            else if(urgency == 2 && distance == 2){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 5               |"); 
                System.out.println("-----------------------------------------------");    
                arrlist.add(5); 
            }
            else if(urgency == 2 && distance == 3){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 6               |");     
                System.out.println("-----------------------------------------------");
                arrlist.add(6); 
            }
            else if(urgency == 3 && distance == 1){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 7               |");  
                System.out.println("-----------------------------------------------");   
                arrlist.add(7); 
            }
            else if(urgency == 3 && distance == 2){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 8               |");  
                System.out.println("-----------------------------------------------");   
                arrlist.add(8); 
            }
            else if(urgency == 3 && distance == 3){
                System.out.println("-----------------------------------------------");
                System.out.println("|               Your token is 9               |");   
                System.out.println("-----------------------------------------------");  
                arrlist.add(9); 
            }
        }

        System.out.println("\n\n       9 Clients answered successfully!");         

        System.out.println("\n\n-----------------------------------------------");
        System.out.println("             This is your Token List            \n"); 
        System.out.println("\t  ");
        System.out.println(arrlist);
        System.out.println("-------------------------------------------------");      

        int[] clients = new int[arrlist.size()];
        for (int i = 0; i < arrlist.size(); i++) {
            clients[i] = arrlist.get(i);           
        }
        int c = clients.length;  


        System.out.println("\nFinally, you can choose the sorting method");    
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("\t\t 1. Selection Sort"); 
        System.out.println("\t\t 2. Insertion Sort"); 
        System.out.println("\t\t 3. Bubble Sort"); 
        System.out.println("-----------------------------------------------");

        System.out.println(" ");
        System.out.println("Enter the number of your choice: ");
        int sort = reader.nextInt();
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------");

        switch (sort) {

            case 1:
            selectionSort(clients, 0, c - 1);  
            
            System.out.print("Your tokens were sorted by Selection Sort: ");  
            for (int i = 0; i < c; i++)                   
            System.out.print(clients[i] + " ");         
            System.out.println(" "); 
            break;

            case 2:
            insertionSort(clients);            
                
            System.out.print("Your tokens were sorted by Insertion Sort: ");  
            for (int k = 0; k < c; k++)          
            System.out.print(clients[k] + " "); 
            System.out.println(" ");  
            break;

            case 3:
            bubbleSort(clients);            
                
            System.out.print("Your tokens were sorted by Bubble Sort: ");    
            for (int h = 0; h < c; h++)          
            System.out.print(clients[h] + " "); 
            System.out.println(" "); 
            break;
            
            default:
            System.out.println("-----------------------------------------------");
            System.out.println("|            Your answer is wrong!            |");
            System.out.println("|                                             |");
            System.out.println("|            You can't get a token!           |");
            System.out.println("|                                             |");
            System.out.println("|        Please try again in next round!      |");
            System.out.println("-----------------------------------------------");
            main(args);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("\n   So, You can get fuel in the following order");
        System.out.println(" "); 

        System.out.println("-----------------------------------------------");
        for (int i = 0; i < c; i++) {  
        int j = i + 1;        
            clients[i] = arrlist.get(i); 
            System.out.print("\t");               
            System.out.println("User number " + j + " can get fuel at "+ clients[i]);       
        }     

        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t------------------------------------------------------------------------------");        
        System.out.println("\t\t\t\t\t\t-                              - Thank You! -                                -");
        System.out.println("\t\t\t\t\t\t------------------------------------------------------------------------------");
    }
        
    static void Urgent() {       
        System.out.println("\t--You have an Urgent Journey--\n");    
    }
    static void Normal() {
        System.out.println("\t--You have a Normal Journey--\n");
    }
    static void NotUrgent() {
        System.out.println("\t--You do not have an Urgent Journey--\n");
    }
    

    static void Faraway() {        
        System.out.println("\t--You are going to a Far Away Distance--\n");        
    }
    static void NotSoFar() {
        System.out.println("\t--You are going to a Normal Distance--\n");
    }
    static void Near() {
        System.out.println("\t--You are going to a Near Distance--\n");
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

