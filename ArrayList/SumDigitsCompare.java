package ArrayList;
import java.util.Comparator;

public class SumDigitsCompare implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		int sum1 =0,sum2=0;
		while(o1>0)
		{
			sum1+=o1%10;
			o1/=10;
		}
		while(o2>0)	
		{
			sum2+=o2%10;
			o2/=10;
		}
		return sum1-sum2;
	}
	

}
