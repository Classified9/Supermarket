package chapter4.Shopping;

public class ShoppingApplication {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        ShoppingPriceApp user = new ShoppingPriceApp();

        //welcome the user
        user.welcomeMessage();

        //Prompt the user for a choice
        user.prompt();

        //Collect the user choice
        user.collectingUserChoice();

        //iterate prompt
        //user.iteratePrompt();

        //iterate
        user.iterate();




    }
}
