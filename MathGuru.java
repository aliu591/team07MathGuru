import java.io*;

public class MathGuru{
    Scanner scan = new Scanner(System.in);
    boolean retry = true;
    public static void main(String[] args){
        while (retry)
            try { 
                System.out.println("Calculations: 1. 2^n     2. n!     3. fab(n). ");
                System.out.println("Please enter the option number of calculation");
                //read option
                int choice;
                choice = Integer.parseInt(scan.nextLine().trim()); 

                if(choice == 1 || choice == 2 || choice == 3){
                    //2^n
                    if (choice == 1){

                    }
                    //n!
                    if (choice == 2){
                        
                    }
                    //fab(n)
                    if (choice == 3){

                    }
                } else {
                    System.out.println("Invalid choice number. Please enter again.");
                }
            } catch(Exception ex) {
                    System.out.println("Invalid Input");
            }
        }
    }
}