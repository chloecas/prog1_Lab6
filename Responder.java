import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 * Question 22 Lab 5
 * Question 23: it does still work even if we change the amount of responses 
 * in the list. Since it is an ArrayList, it adapts to the size of the collection
 * and the index changes as we remove or add to sync with the changes.
 * 
 * Question 35. {"hello", "goodbye", "next"} 
 * 
 * Question 36. space would be separated as " "
 * 
 * Question 37. HashSets do not allow duplicate values whereas ArrayLists 
 * maintains the order and allows duplicates. HashSets are backed by HashMaps so 
 * elements are kept in a table.
 * 
 * Question 39.
 */
public class Responder
{
    private Random randomGenerator;
    // no longer needed private ArrayList<String> responses;
    private HashMap<String, String> betterResponses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator= new Random();
        // no longer needed responses= new ArrayList<>();
        betterResponses= new HashMap<>();
        // no longer needed fillResponses();
        
        fillResponsesMap("crash", "You are experiencing a crash in the \n" +
        "system, I can assist with that"); 
        fillResponsesMap("problem", "That sounds off. Could you describe \n"+
        "this in more detail?");  
        fillResponsesMap("issue", "I need a bit more information on that");  
        fillResponsesMap("system", "What is your system configuration?");
    }

    /**
     * Question 33
     */
    public String generateResponse(String word)
    {
        String answer = betterResponses.get(word);
        return answer;
    }
    
    /** no longer needed 
     * 
     *private void fillResponses()
    *{
        *responses.add("That sounds off. Could you describe this in more detail?");
        *responses.add("No other customer has ever complained about this \n" +
        *"before. What is your system configuration?");
        *responses.add("I need a bit more information on that");
        *responses.add("Have you checked that you do not have a dll conflict?");
    *}
    */
    
    //Question 33
    private void fillResponsesMap(String word, String answer)
    {
        betterResponses.put(word, answer);  
    }
}
