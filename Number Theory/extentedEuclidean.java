import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("ax+by=gcd(a,b)");
        Triplet ans = extentedEuclidean(a,b);
        System.out.println("GCD "+ ans.gcd);
        System.out.println("x "+ ans.x);
        System.out.println("y "+ ans.y);
        
        
     
    }
    public static Triplet extentedEuclidean(int a,int b)
    {
        
        if(b==0)
        {
            Triplet ans = new Triplet();
            ans.x=1;
            ans.y=0;
            ans.gcd=a;
            return ans;
        }
        Triplet smallAns = extentedEuclidean(b,a%b);
        Triplet Ans = new Triplet();
        Ans.gcd = smallAns.gcd;
        Ans.x =  smallAns.y;
        Ans.y = smallAns.x - ((a/b)*smallAns.y);
        return Ans;
        
        
    }
}
class Triplet
{
    int x,y,gcd;
    Triplet()
    {
        this.x=this.y=this.gcd=0;
    }
}

/*input
4 2

ouput=GCD 2
x 0
y 1



*/
