
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 sol = new Solution2();
		System.out.println(sol.isPalindrome("MOM"));

	}

}

class Solution2{
	public boolean isPalindrome(String str) {
		String reverseStr="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseStr+=str.charAt(i);
		}
		return reverseStr.equals(str);
	}
}