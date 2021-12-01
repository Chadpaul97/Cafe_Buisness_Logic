import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for(int i=1; i <= 10; i++){
            sum = i + sum;
        }
        return(sum);
    }

    double getOrderTotal(double[] prices){
        double total = 0.0;
        for(int j = 0; j < prices.length; j++){
            total += prices[j];
        }
        return total;
    }

// Given an ArrayList of menu items (strings), print out each index and menu item.

// Sample output, with the argument { "drip coffee", "cappuccino", "latte", "mocha" } :
// String name = myArray.get(0); // to access an element in an ArrayList using an index

    void displayMenu(ArrayList<String> menuItems){
        int num = 0;
        for(String name : menuItems){
            System.out.println(num +" "+ name);
            num++;
        }
    }

//     addCustomer(ArrayList<String>)

// For this method:

// Print this string to the console: "Please enter your name:"
// Then add this line of code to get their answer and store it in the variable  userName: 
// String userName = System.console().readLine();copy
// Next print the userName to the console, saying "Hello, [user name here]!"
// Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
// Then, add the customer's name to the given customers list. And print the list.
// No need to return anything.


// Re-cap of ArrayList Syntax:

// myArray.add("Heidi"); // to add an item to an ArrayList

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are "+ customers.size() +"people in front of you using the number for how many people are ahead of them");
        customers.add(userName);
    }
}