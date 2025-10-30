
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSolution sol = new FibonacciSolution();
		System.out.println(sol.fibonacci(7));
	}

}

class FibonacciSolution{
	public int fibonacci(int n) {
		if(n==0) {
			return 0;
		}else if((n==1)) {
			return 1;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}