import java.util.Random;
import java.util.ArrayList;
/**
 * Questions from Lab 5
 * 2. They have the name of the class, all the methods/fields/constructors 
 * with a description of their function. Their purpose is to provide details 
 * on the class and its uses.
 * 
 * 3.startsWith(String prefix): tests if the string starts with a specified 
 * prefix. startsWith(String prefix, int toffset): tests if the substring of 
 * this string beginning at the specific index starts with the prefix. 
 * substring: a piece from a given string, smaller part
 * 
 * 4.endsWith(String suffix), return type boolean, parameter is a String suffix
 * 
 * 5.length(), it has no parameters
 * 
 * 7. public String trim() { String text = “ Hello! "; text.trim(); }
 */
public class RandomTester
{
    private ArrayList<String> responses;
    private Random rand;
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
       rand= new Random();
       responses = new ArrayList<>();
       
       responses.add("yes");
       responses.add("no");
       responses.add("who knows");
       responses.add("no idea");
    }

    /**
     * Question 14 Lab 5
     */
    public void printOneRandom()
    {
        int randomNumber= rand.nextInt(1000);
        System.out.println(randomNumber);
    }
    
    /**
     * Question 19 Lab 5
     */
    public void numberRange(int max)
    {
        int randomNumber= rand.nextInt(max)+1;
        System.out.println(randomNumber);
    }
    
    /**
     * Question 20 Lab 5
     */
    public void randomRange(int min, int max)
    {
        int randomNumber=rand.nextInt(max)+ min;
        System.out.println(randomNumber);
    }
    
    /**
     * Question 14 Lab 5
     */
    public void printMultiRandom(int howmany)
    {
        int i=0;
        while(i< howmany) {
            int randomNumber=rand.nextInt();
            printOneRandom();
            i++;
        }
    }
    
    /**
     * Question 16 Lab 5
     */
    public int throwDice()
    {
        return rand.nextInt(6)+1;
    }
    
    /**
     * Question 17+18 Lab 
    */
     public String getBetterResponse()
    { 
        int index= rand.nextInt(responses.size());
        return responses.get(index);
    }
}
