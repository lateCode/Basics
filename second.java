public class second{
public static int findSecondSmallest(int[] elements) {
    if (elements == null || elements.length < 2) {
        throw new IllegalArgumentException();
    } 
    int smallest = elements[0]; 
    int secondSmallest = elements[0]; 
    for (int i = 1; i < elements.length; i++) {
        if (elements[i] < smallest) {
            secondSmallest = smallest;
            smallest = elements[i];
        } 
        else if (elements[i] < secondSmallest) {
            secondSmallest = elements[i];
        }
    }
    return secondSmallest;
}

	 public static void main(String args[])
	 {
	    int ar[]= {4,5,4,6,7};
		int num=findSecondSmallest(ar);
		System.out.println(num);
		
	 }
}