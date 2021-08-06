 /*2)Same as task1 but you should only count unique vowel count i.e
* if a word is having aeeeeee like that so that count of vowel is 2 not 8.*/

package Vowel_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class Count {

	public static void main(String[] args) {
		String str="aeeeeeeee hiiiiiii helloooooo javaaaaaa";
		
		System.out.println(countVowels(str));

	}
	
	public static String countVowels(String str)
	{
		Map<Integer, String> map = new TreeMap<>();
		String arr[] = str.toLowerCase().split(" ");
		Arrays.sort(arr,Collections.reverseOrder());
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			char[] ch = arr[i].toCharArray();
			if (ch[0] == 'a' || ch[0] == 'e' || ch[0] == 'i' || ch[0] == 'o' || ch[0] == 'u') {
				count++;
			}
			for (int j = 1; j < ch.length; j++) {
				if ((ch[j] == 'a' && ch[j-1] != 'a') || (ch[j] == 'e' && ch[j-1] != 'e') || (ch[j] == 'i' && ch[j-1] != 'i') || (ch[j] == 'o' &&ch[j-1] != 'o') || (ch[j] == 'u'&&ch[j-1] != 'u'))
					count++;
				

			}
			// System.out.print(count+" ");

			if (map.containsKey(count)) {
				String temp = map.get(count);
				temp = temp + " " + arr[i];
				map.put(count, temp);
			} else {
				map.put(count, arr[i]);
			}

		}
		
		System.out.println(map);
		
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer, String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();

}
}
