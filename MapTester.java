import java.util.HashMap;
/**
 * Question 27 Lab 5
 * 
 * Question 28: It allowed me to add the name and number already in the list, 
 * when I lookupNumber(), the number it showed me the same number.
 * 
 *  Question 29. There is an error when I try to add an entry with two different 
 *  Strings as keys.
 *  
 *  Question 30. public boolean containsKey(String name);
 *  
 *  Question 31. It returns null value
 *  
 *  Question 32. keySet()
 *  
 */
public class MapTester
{
    private HashMap<String,String> contacts;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        contacts= new HashMap<>();

        enterNumber("Chloe Castrataro", "(555) 555 5555");
        enterNumber("Connor Castrataro", "(444) 444 4444");
        enterNumber("Leslie Lockhart", "(333) 333 3333");        
    }

    /**
     * Question 27
     */
    public void enterNumber(String name, String number)
    {
        contacts.put(name, number);
    }
    
     /**
     * Question 27
     */
    public String lookupNumber(String name)
    {
        String number = contacts.get(name);
        return number;
    }
    
}
