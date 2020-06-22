
public class MyClass {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] seive = new int[n+1];
     for(int i=1;i<n+1;i++)
        seive[i] = i;
    
    for(int i=2;i<n+1;i++)
    {
        if(seive[i]==i)
        {
            seive[i]=i-1;
            for(int j=i+i;j<n+1;j=j+i)
            {
                seive [j] = (int)Math.ceil(seive[j]*(1-(1.0/i)));
                //System.out.println(i+" "+j+" "+seive[j]);
            }
        }
    }
    for(int i=1;i<n+1;i++)
        System.out.println(i+" "+seive[i]);
    
    }
}
