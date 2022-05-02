import java.util.*;
public class Solution {
    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
		int [][] dp = new int[n][4];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<4;j++)
				dp[i][j] = -1;
		}
		return f(points, dp, n-1, 3);
		
		
		
    }
	
	public static int f(int points[][], int [][]dp, int day, int last)
	{
		if (dp[day][last] != -1) return dp[day][last];

        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last)
                    maxi = Math.max(maxi, points[0][i]);
            }
            return dp[day][last] = maxi;
        }

        int maxi = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                int activity = points[day][i] + f( points, dp, day-1, i);
                maxi = Math.max(maxi, activity);
            }

        }

        return dp[day][last] = maxi;
	}

}
