import java.util.*;

public class Queue_Use
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);


        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("Peek Value" + queue.peek());

        queue.remove();
        System.out.println(queue);

    }
}