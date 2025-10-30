import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfEleInArray sol = new CountOfEleInArray();
		int arr[]= {3, 5, 2, 3, 8, 5, 5, 9};

		System.out.println("Array duplicate counts: " + sol.countEleInArray(arr));

	}

}

class CountOfEleInArray{
	public Map<Integer, Integer> countEleInArray(int arr[]) {
		Map<Integer,Integer> counts = new LinkedHashMap<>();
		if(arr==null) return Collections.emptyMap();
		for(int v: arr) {
			counts.put(v, counts.getOrDefault(v, 0)+1);
		}
		/*Iterator<Map.Entry<Integer,Integer>> it = counts.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() <= 1) it.remove();
        }*/
        return counts;

	}
}