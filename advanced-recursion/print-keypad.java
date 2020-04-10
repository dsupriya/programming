public class solution {

	public static void printKeypad(int n){
		// Write you
        String input =""+n;
        String output =new String();
        if(input.contains("0")||input.contains("1"))
            return;
        myPrintKeypad(n,output);
		
	}
    public static void myPrintKeypad(int n, String output)
    {
        //System.out.println(n);
        
       //System.out.println(output); 
        if(n<=0)
        {
            System.out.println(output);
            return;
        }
        else
        {
            int temp = n%10;
            if(temp==2)
            {
   				//myPrintKeypad(n/10,output);
                myPrintKeypad(n/10,"a"+output);
                myPrintKeypad(n/10,"b"+output);
                myPrintKeypad(n/10,"c"+output);
                
            }
            if(temp==3)
            {
   				//myPrintKeypad(n/10,output);
                myPrintKeypad(n/10,"d"+output);
                myPrintKeypad(n/10,"e"+output);
                myPrintKeypad(n/10,"f"+output);
                
            }
            if(temp==4)
            {
   				//myPrintKeypad(n/10,output);
                myPrintKeypad(n/10,"g"+output);
                myPrintKeypad(n/10,"h"+output);
                myPrintKeypad(n/10,"i"+output);
                
            }
            if(temp==5)
            {
   				//myPrintKeypad(n/10,output);
                myPrintKeypad(n/10,"j"+output);
                myPrintKeypad(n/10,"k"+output);
                myPrintKeypad(n/10,"l"+output);
                
            }
            if(temp==6)
            {
   				//myPrintKeypad(n/10,output);
                myPrintKeypad(n/10,"m"+output);
                myPrintKeypad(n/10,"n"+output);
                myPrintKeypad(n/10,"o"+output);
                
            }
            if(temp==7)
            {
   				
                myPrintKeypad(n/10,"p"+output);
                myPrintKeypad(n/10,"q"+output);
                myPrintKeypad(n/10,"r"+output);
                myPrintKeypad(n/10,"s"+output);
                
            }
            if(temp==8)
            {
   				
                myPrintKeypad(n/10,"t"+output);
                myPrintKeypad(n/10,"u"+output);
                myPrintKeypad(n/10,"v"+output);
                
                
            }
            if(temp==9)
            {
   				
                myPrintKeypad(n/10,"w"+output);
                myPrintKeypad(n/10,"x"+output);
                myPrintKeypad(n/10,"y"+output);
                myPrintKeypad(n/10,"z"+output);
                
                
            }
        }
    }
}
