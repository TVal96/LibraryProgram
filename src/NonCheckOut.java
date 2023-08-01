package src;

public class NonCheckOut extends Item {
    //class that extends item class.
    //will simply just display the noncheckoutitems.txt

    public void displayNonCheckOut() {
        //ask item superclass to display file
        displayFile("C:\\Users\\mckee\\Downloads\\LibraryProgram-main\\NonCheckOutItems.txt");
    }

}