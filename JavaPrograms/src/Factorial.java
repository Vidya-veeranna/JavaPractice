
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialSolution sol = new FactorialSolution();
		System.out.println("Factorial of a number is: " +sol.factorial(3));
	}

}

class FactorialSolution{
	public int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}