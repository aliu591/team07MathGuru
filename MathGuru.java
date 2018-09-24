import java.util.*;

/**
  * Group 07
  * HW3
  * 9/24/2018
  * Main function
**/
public class MathGuru{
    static Scanner scan = new Scanner(System.in);
    static boolean retry = true;

    public static void main(String[] args){
        while (retry)
            try { 
            	boolean judge=true;
            	int choice=0;
                while(judge){             	
                    System.out.println("Calculations: 1. 2^n     2. n!     3. fab(n). ");
                    System.out.print("Please enter the option number of calculation: ");
                    //read option
                    choice = Integer.parseInt(scan.nextLine().trim()); 
                    if(choice>3){
                	System.out.print("Invalid choice number. Please enter again!\n");
                	}else{
                		break;
                	}
                }
                

                

                while (true){
                    //read n
                    System.out.print("The input value of n: ");
                    int n = Integer.parseInt(scan.nextLine().trim());
                    if (n >= 0 && n <= 20){
                        if(choice == 1 || choice == 2 || choice == 3){
                            //2^n
                            if (choice == 1){
                                calculation1 obj = new calculation1();
                                System.out.println("The result of 2^" + n + " is " + obj.calculation1(n));
                                
                            }
                            //n!
                            if (choice == 2){
                            	calculation2 obj = new calculation2();
                                System.out.println("The result of " + n + "! is " + obj.function2(n) );
                                
                            }
                            //fab(n)
                            if (choice == 3){
                                calculation3 obj = new calculation3();
                                System.out.println("The result of fab(" + n + ") is " + obj.fab(n));
                               
                            }
                            
                            //check if the user want to try again
                            while(true){
                                System.out.print("Do you want to try again? (yes or no) : ");
                                String again = scan.nextLine().trim();
                                if (again.equals("yes")){
                                    break;
                                } else if (again.equals("no")){
                                    System.exit(0);
                                } else{
                                    System.out.println("Invalid Answer");
                                }
                            }
                            break;
                        } else {
                            System.out.println("Invalid choice number. Please enter again.");
                            break;
                        }

                    } else {
                        System.out.print("Please select a value above 0 and below 20.");
                    }
                }
 
            } catch(Exception ex) {
                System.out.println("Invalid Input");
            }
        System.exit(0);
        }
}
