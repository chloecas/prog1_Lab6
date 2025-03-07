
/**
 * Lab 5 Questions
 * 12.java.util package, it generates random numbers, construct an instance by 
 * creating a random number generator, generates a stream of random numbers 
 * using a seed of 48-bits.
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();
            //Question 8,9 & 11 Lab 5
            input= input.trim();
            input= input.toLowerCase();
            if(input.equals("bye")) {
                finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}