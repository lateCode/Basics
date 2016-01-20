public class arraysort
{
 public static int sort(int arr[])
 {
	  if(arr[0]>arr[1])
	  {
		 arr[0]=arr[0]+arr[1];
		 arr[1]=arr[0]-arr[1];
		 arr[0]=arr[0]-arr[1];
	   }
	  for(int i =2; i<arr.length;i++)
	  {
			if(arr[i]<arr[0])
			{
			 arr[1]=arr[0];
			 arr[0]=arr[i];
			 
			}
			else if(arr[i]>arr[0]&&arr[i]<arr[1])
			{
			  arr[1]=arr[i];
			}
	  }
  
      return arr[1];
 }

	 public static void main(String args[])
	 {
	  int arr[]={2,4,1,3,10,-5};
	  int sec=arraysort.sort(arr);
	  System.out.println(sec);
	   
	 }
}