/*
Tasks - 1)Arrange the sentence by words with the word which is having highest vowel count first and followed by rest, 
if two or more words have same vowel count then arrange it reverse alphabetical order
*/

package Vowel_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Vowels_map {

	public static void main(String[] args) {
		String str = "hello everyone I am mahesh and i am in full stack java batch and i can do more well now";

		System.out.println("\n\n"+sortByLengthofVowel(str));

	}

	private static String sortByLengthofVowel(String str) {
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
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u') {
					count++;
				}

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