import java.util.*;

public class stack
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Stack<String> animals = new Stack<>();

        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        animals.add("Hipo");

        System.out.println("Stack = " + animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println("Stack = " + animals);

    }
}
