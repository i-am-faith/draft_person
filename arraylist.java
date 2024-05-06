
import java.util.*;
 
public class arraylist
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        // //Arraylist creation
        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // System.out.println("First List 1 = " + list);

        // //adding value to particular position in arraylist
        // list.add(2,100);
        // System.out.println("Updated List 1 = " + list);

        
        // List<Integer> newlist = new ArrayList<>();
        // newlist.add(500);
        // newlist.add(600);
        // System.out.println("List 2 = " + newlist);

        // //adding a full list to existing list
        // list.addAll(newlist);
        // System.out.println("Full List = " + list);


        // //acessing element by position
        // System.out.println("First Element in Full List  = " + list.get(0));


        List<Integer> list = new ArrayList<>();
        System.out.print("Enter size = ");
        int n = sc.nextInt();
        System.out.print("Enter elements = ");
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("List = " + list);

        // //remove list by index
        // list.remove(3);
        // list.remove(Integer.valueOf(10));
        // System.out.println("Updated List = " + list);

        // list.clear();
        // System.out.println("Your List = " + list);

        // //setting elements by index
        // list.set(2,1000);
        // System.out.println("Updated List = " + list);


        //contains function
        // System.out.println(list.contains(50));


        

    }
}