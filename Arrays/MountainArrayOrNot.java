package Arrays;

public class MountainArrayOrNot {
	public static void main(String[] args) {
		int[] arr = {6,7,8,8,7,6};
		
		if(checkMountain(arr))
			System.out.println("Mountain");
		else
			System.out.println("Not Mountain");
	}
	public static boolean checkMountain(int[] arr)
	{
		int i=0;
		while(i<arr.length-1 && arr[i]<arr[i+1])
		{
			i++;
		}
		if(i==0 || i==arr.length-1)
			return false;
		while(i<arr.length-1 && arr[i]>arr[i+1])
		{
			i++;
		}
		return i==arr.length-1;
	}
	

}
