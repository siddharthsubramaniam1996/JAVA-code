class armstrong

{  
  public static void main(String args[])  

	{  
    	int c=0,a,temp,n;  
    	n=Integer.parseInt(args[0]);
    	temp=n;  
    	while(n>0)  
    			{  
    				a=n%10;  
    				n=n/10;  
    				c=c+(a*a*a);  
    			}  
    		
		if(temp==c)  
	{
    		System.out.println("armstrong akda aahe re....  thanda ghe");   
	}
    		else  
	{
        		System.out.println("armstrong akda naiye re...... mala raag yetoy!!!");   
	}   	
}  

} 