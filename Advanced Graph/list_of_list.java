//sample code for list of list demo   
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        LinkedList <LinkedList>list = new LinkedList<LinkedList>();
        LinkedList <Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        list.add(l1);
        LinkedList <Integer> l2 = new LinkedList<Integer>();
        l2.add(100);
        l2.add(101);
        list.add(l2);
        System.out.println(list);
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            LinkedList <Integer> temp = (LinkedList <Integer>)itr.next();
            
            Iterator i2 = temp.iterator();
            while(i2.hasNext())
                System.out.print(i2.next()+" ");
            System.out.println();
                
        }
        
         
     }
     public static void takeAdjListAsGraph()
     {
          Scanner sc = new Scanner(System.in);
          //no of vertex
          int n = sc.nextInt();
          //no of edges
          int e = sc.nextInt();
          ArrayList <ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
          for(int i=0;i<n;i++)
               list.add(i, new ArrayList<Integer>());
          while(e>0)
          {
               e--;
               int t1 = sc.nextInt();
               int t2 = sc.nextInt();
               list.get(t1).add(t2);
               list.get(t2).add(t1);
          }
          System.out.println(list);
     }
}
