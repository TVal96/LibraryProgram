package src;

import java.util.Scanner;

public class CheckOut extends Item {
    //class that extends item class.
    //display the checkoutitems.txt
    //see if item is checked out
    //request item
    public void checkOutMenu() {
        boolean flag = false;
        Scanner input = new Scanner(System.in);

        while (flag == false) {
            System.out.println("\n"+"What would you like to do?");
            System.out.println("Please select one of the following options:");
            System.out.println("  1. Show items that can be checked out." + "\n" +
                "  2. Check out or request item by item ID number." + "\n" +
                "  9. Exit.");
            System.out.println("Your choice:");

            String userInput = input.nextLine();
            int userChoice = Integer.parseInt(userInput);

            if(userChoice == 1){
                //display the ID, type, and name
                displayCheckOut();
            }
            else if(userChoice == 2){
                //!!!!need to add check out function!!!!!
                System.out.println("Option 2");
            }
            else if(userChoice == 9){
                //sends back to library
                flag = true;
            }
        }
    }

    public void displayCheckOut() {
        displayFile("C:\\Users\\mckee\\Downloads\\LibraryProgram-main\\CheckOutItems.txt");
    }
}
