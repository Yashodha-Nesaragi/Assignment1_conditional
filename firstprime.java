package assignment1week1;

public class firstprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct=0,n=0,i=1,j=1;  
		while(n<7)  
		{  
		j=1;  
		ct=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		ct++;  
		j++;   
		}  
		if(ct==2)  
		{  
		System.out.printf("%d ",i);  
		n++;  
		}  
		i++;  
		}  

	}

}
