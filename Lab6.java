import java.util.*;

public class Lab6{
    public static void main(String[] args)
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("1.TreeSet\n2.stack\n3.Exit\n \nEnter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: treeSet();
                       break;
                case 2: stack();
                       break;
                default:
                    System.exit(0);
            }
        }
    }
    private static void treeSet()
{
    TreeSet<String>playerSet = new TreeSet<String>();
    playerSet.add("Sachin");
    playerSet.add("Virat");
    playerSet.add("Kohli");
    playerSet.add("Umesh");
    playerSet.add("Dhoni");
    playerSet.add("Mahi");
    playerSet.add("Bhaji");
    playerSet.add("Rahul");
    System.out.println("Original set = "+playerSet);
    System.out.println("First name = "+playerSet.first());
    System.out.println("Last name = "+playerSet.last());
    System.out.println("Contains Kohli?:"+playerSet.contains("Kohli"));
    System.out.println("SubSet(Mahi-Umesh):"+playerSet.subSet("Mahi","Umesh"));
    
}

private static void stack()
{
    Stack<String> stackArray = new Stack<String>();
    stackArray.push("Raju");
    stackArray.push("Ram");
    stackArray.push("Raghu");
    stackArray.push("Raman");
    System.out.println("Stack --"+stackArray);
    System.out.println();
    String ele = stackArray.pop();
    System.out.println("Stack pop()--"+ele);
    ele = stackArray.push("new");
    System.out.println("Stack push()--"+stackArray);
}
}