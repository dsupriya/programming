import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int i= sc.nextInt();
            int p =sc.nextInt();
            System.out.println((i+p)%12);
        }
		
	}
}
