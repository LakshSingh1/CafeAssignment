package CafeAssignment;

public class CafeBussiness {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $";
        // Following the same camelcase naming convention, create drink price variables
        // for drip coffee, latte, and cappuccino.

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 5.0;

        // Customer name variables (add yours below)
        String customer1 = "Laksh";
        // Create customer variables for Sam, Jimmy, and Noah.
        String customer2 = "Heidi";
        String customer3 = "Shawn";
        String customer4 = "John";

        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        // Create the order status flag (true/false) for each customer.
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        // Cindhuri ordered a coffee. Based on her order status, print the correct
        // status message to the console.
        System.out.println(generalGreeting + customer1 + (isReadyOrder1 ? readyMessage + customer1 : pendingMessage)); // Displays
                                                                                                                       // "Your
                                                                                                                       // order
                                                                                                                       // is
                                                                                                                       // ready
                                                                                                                       // cindhuri"
                                                                                                                       // or
                                                                                                                       // "Your
                                                                                                                       // order
                                                                                                                       // will
                                                                                                                       // be
                                                                                                                       // ready
                                                                                                                       // shortly
                                                                                                                       // cindhuri"

        // Noah ordered a cappuccino. Use an if statement to check the status of his
        // order and print the correct status message. If it is ready, also print the
        // message to display the total. Note: Outcomes may be different depending on
        // what you assigned as the status.
        System.out.println(generalGreeting + customer4
                + (isReadyOrder4 ? readyMessage + ',' + displayTotalMessage + cappuccinoPrice : pendingMessage));
        // Sam just ordered 2 lattes, print the message to display their total. Next,
        // use an if statement to print the appropriate order status message. Change the
        // isReady flag value from true to false or vice versa in order to test your
        // control logic (if-statement).
        System.out.println(generalGreeting + customer2
                + (isReadyOrder2 ? readyMessage + ',' + displayTotalMessage + lattePrice * 2 : pendingMessage));

        System.out.println(generalGreeting + customer2
                + (!isReadyOrder2 ? readyMessage + ',' + displayTotalMessage + lattePrice * 2 : pendingMessage));
        // Jimmy just realized he was charged for a coffee but had ordered a latte.
        // Print the total message with the new calculated total (what he owes) to make
        // up the difference.

        System.out.println(generalGreeting + customer3
                + (isReadyOrder3 ? readyMessage + ',' + displayTotalMessage + (lattePrice - mochaPrice)
                        : pendingMessage));

    }
}