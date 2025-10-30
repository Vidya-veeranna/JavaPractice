
public class SecondLargestEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,23,67,20};
		SecondLargeElement sol = new SecondLargeElement();
		System.out.println(sol.secondLargest(arr));

	}

}

class SecondLargeElement{
	public int secondLargest(int arr[]) {
		int largest=-1,secondLargest=-1;
		for(int num: arr) {
			if(num>largest || largest==-1) {
				secondLargest=largest;
				largest=num;
			}else if(num != largest && (num>secondLargest || secondLargest==-1)) {
				secondLargest=num;
			}
		}
		return secondLargest;
	}
}