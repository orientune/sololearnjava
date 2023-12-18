import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       
       Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
      
      
       customer.saveCustomerInfo(firstName,secondName,age,roomNumber);
   }
}

class Customer {
    
   
   
  
   public static void saveCustomerInfo(String firstName,String secondName,int age,int roomNumber) {
       System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
}
