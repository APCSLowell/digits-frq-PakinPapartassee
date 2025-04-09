import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    newList = new ArrayList <Interger>();
		if(num==0)
			newList.add(0);
		int n = num;
		for(int i =0;i<num.length;i++){
			num = num%10;
			newList.add(num);
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i = 1;i<num.length;i++){
			while(num[i]>num[i-1])
				return true;
			
		}
		return false;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
