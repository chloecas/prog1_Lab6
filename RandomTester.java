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
    
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
                
    }

    /**
     * Question 14 Lab 5
     */
    public void printOneRandom()
    {
        Random rand= new Random();
        int randomNumber= rand.nextInt();
        System.out.println(randomNumber);
    }
    
    public int maxNumber(int max)
    {
        Random rand= new Random();
        return 0;
    }
    
    /**
     * Question 14 Lab 5
     */
    public void printMultiRandom(int howmany)
    {
        Random rand=new Random();
        for(int i=0; i< howmany; i++) {
            int randomNumber=rand.nextInt();
            System.out.println(randomNumber);
        }
    }
    
    /**
     * Question 16 Lab 5
     */
    public int throwDice()
    {
        Random rand= new Random();
        return rand.nextInt(6)+1;
    }
    
    /**
     * Question 17 Lab 
    */
     public String getResponse()
    { 
        String[] responses = {"yes", "no", "maybe"};
        Random rand= new Random();
        int randomIndex= rand.nextInt(responses.length);
        return responses[randomIndex];
    }
}

    