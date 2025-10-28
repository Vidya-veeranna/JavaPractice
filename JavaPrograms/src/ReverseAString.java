
public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Vidya";
		Solution sol = new Solution();
		System.out.println(sol.reverseString(str));
	}

}

class Solution{
	public String reverseString(String str) {
		String reverseStr="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseStr+=str.charAt(i);
		}
		return reverseStr;
	}
}