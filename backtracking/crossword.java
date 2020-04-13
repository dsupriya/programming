import java.util.Scanner;

public class Main {
public static  char [][] grid;

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner sc = new Scanner(System.in);
        //System.out.println("hellow");
         grid = new char[10][10];
        String temp;
        for(int i=0;i<10;i++)
        {
            temp=sc.nextLine();
            for(int j=0;j<10;j++)
            {
                grid[i][j]=temp.charAt(j);
            }
        }
        temp=sc.nextLine();
        String [] word= temp.split(";",0);
        //printSol();
        solve(word,0);
       
        /*for(int i=0;i<word.length;i++)
        {
            System.out.println(word[i]);
        }*/
        

	}
    public static boolean solve( String  [] word, int l)
    {
        int n= word.length;
        //System.out.println(word[l]);
        if(l==word.length&& isBoardFull()==true)
        {
            printSol();
           return true;
        }
        
            //System.out.println("ypp");
            for(int i=0;i<10;i++ )
            {
                for(int j=0;j<10;j++)
                {
                    //System.out.print(grid[i][j]);
                    if(grid[i][j]=='-'||grid[i][j] == word[l].charAt(0))
                    {
                        
                        if(isVertical(word[l],i,j)==true)
                        {
                            int []vertical_pos=setVertical(word[l],i,j);
                            //System.out.println("vertically set"+word[l]);
                            if(solve(word,l+1) == true)
                                return true;
                            grid=unSetVertical(vertical_pos,i,j);
                        }
                        if(isHorizontal(word[l],i,j)==true)
                        {
                            int []horizontal_pos=setHorizontal(word[l],i,j);
                           if(solve(word,l+1)== true)
                               return true;
                            grid=unSetHorizontal(horizontal_pos,i,j);
                        }
                    }
                }
            }
            
        
        return false;
    }
    public static boolean isVertical(String word, int row, int col)
    {
        //System.out.println("isVertical"+" "+word);
        
        boolean ans=false;
        int j=0;
        for(int i=row;i<10&&j<word.length();i++,j++)
        {
        	if((grid[i][col]=='-')||(grid[i][col]==word.charAt(j)))
            {
                continue;
                   
                
            }
            else
                return false;
            	
        }
        if(j==word.length())
            return true;
        else
            return false;
    }
      public static boolean isHorizontal(String word, int row, int col)
    {
         // System.out.println("isHorizontal"+" "+word);
        boolean ans=false;
        int j=0;
        for(int i=col;i<10&&j<word.length();i++,j++)
        {
        	if(grid[row][i]=='-'||grid[row][i]==word.charAt(j))   
            {
                //System.out.println(grid[row][i]+" horizonatl  "+word);
                continue;
            }
            else
                return false;
            	
        }
         if(j==word.length())
            return true;
        else
            return false;
    }
    public static int [] setVertical(String word, int row, int col)
    {
        //System.out.println("SetVertical"+" "+word);
      	int [] pos = new int[word.length()];
        int j=0;
    	for(int i=row;i<10&&j<word.length();i++,j++)
        {
        	if(grid[i][col]=='-')      
            {
                grid[i][col]=word.charAt(j);
                pos[j]=1;
                
            }
            else
            	pos[j]=0;
        }
    	return pos;
    }
    public static int [] setHorizontal(String word, int row, int col)
    {
       //System.out.println("setHorizontal "+word);
      	int [] pos = new int[word.length()];
        int j=0;
    	for(int i=col;i<10&&j<word.length();i++,j++)
        {
        	if(grid[row][i]=='-')      
            {
                grid[row][i]=word.charAt(j);
                pos[j]=1;
                
            }
            else
            	pos[j]=0;
        }
    	return pos;
    }
    public static  char [][] unSetVertical(int []pos, int row, int col)
    {
        int j=0;
        int n=pos.length;
        for(int i=row;i<10&&j<n;i++,j++)
        {
            if(pos[j]==1)
                grid[i][col]='-';
             
        }
        return grid;
    }
    public static  char [][] unSetHorizontal(int []pos, int row, int col)
    {
        //System.out.println("unsetHorizontal "+row);
        int n=pos.length;
        for(int i=col,j=0;i<10&&j<n;i++,j++)
        {
            if(pos[j]==1)
                grid[row][i]='-';
            
        }
        return grid;
    }
    
    public static void printSol()
    {
        for(int i=0;i<10;i++)
        {
        	for(int j=0;j<10;j++)
            {
         		System.out.print(grid[i][j]);       
            }
            System.out.println();
       
        }
    }
	public static boolean isBoardFull()
    {
        for(int i=0;i<10;i++)
        {
        	for(int j=0;j<10;j++)
            {
         		if(grid[i][j]=='-')
                    return false;
            }
            
       
        }
        return true;
    }
    
    
    
    
    
    
    
}
