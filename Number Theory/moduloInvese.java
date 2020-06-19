import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("ax+by=gcd(a,b)");
        // we are solvoinn (a*b)%m = 1 hence b is the ans
        System.out.println("a ans m should be coprime.");
        int ans = multiplicativeModuloInverse(a,m);
        System.out.println("multiplicativeModuloInverse od a, m is "+ ans);
       
        
        
     
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
    public static int multiplicativeModuloInverse(int a, int m)
    {
        Triplet ans = extentedEuclidean(a,m);
        return ans.x;
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
