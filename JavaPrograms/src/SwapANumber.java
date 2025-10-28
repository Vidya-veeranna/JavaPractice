
public class SwapANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 sol = new Solution3();
		sol.swapNumbers(20, 30);
	}

}

class Solution3{
	public void swapNumbers(int a,int b) {
		a=a+b;//a=a^b;
		b=a-b;//b=b^a;
		a=a-b;//a=a^b;
		System.out.println("After Swapping: a="+a+" b="+b);
	}
}