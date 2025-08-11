package Arrays;

public class AverageInOddIndex {
		public static void main(String[] args) {
			int[] arr = {3,4,5,6,3,2};
			int size=arr.length;
			int[] res = new int[size/2];
			int pos=0;
			for(int i=0;i<size;i++)
			{
				if(i%2!=0)
				{
					res[pos]=arr[i];
					pos++;
				}
			}
			int sum=0;
			for(int i=0;i<size/2;i++)
			{
				sum+=res[i];
			}
			double avg=sum/(size/2);
			
			
			System.out.println("Average in even Index: "+avg);
		}
			
}
