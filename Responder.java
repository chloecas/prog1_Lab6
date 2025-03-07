import java.util.ArrayList;
import java.util.Random;
/**
 * Question 22 Lab 5
 * Question 23: it does still work even if we change the amount of responses 
 * in the list. Since it is an ArrayList, it adapts to the size of the collection
 * and the index changes as we remove or add to sync with the changes.
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator= new Random();
        responses= new ArrayList<>();
        fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index= randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
    
    private void fillResponses()
    {
        responses.add("That sounds off. Could you describe this in more detail?");
        responses.add("No other customer has ever complained about this \n" +
        "before. What is your system configuration?");
        responses.add("I need a bit more information on that");
        responses.add("Have you checked that you do not have a dll conflict?");
    }
}
