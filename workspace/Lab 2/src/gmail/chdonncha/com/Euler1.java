package gmail.chdonncha.com;

public class Euler1 {

	public static void main(String[] args){
		
		int total = 0;
		int index = 1000;
		
		while(index > 0)
		{		
			index --;
			
			if(index % 5 == 0 || index % 3 == 0)
			{
				System.out.println(index);
				total += index;
			}
			
		}
		System.out.println("Total: " + total);
	}
}
