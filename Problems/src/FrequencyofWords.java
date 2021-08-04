public class FrequencyofWords {
	
	public static void main(String[] args) {
			String str="hii how are you";
			Frequency(str);

		}
		public static void Frequency(String str)
		{
			String s[]=str.split(" ");
//			char s1[]=str.toCharArray();
			int arr[]=new int[26];
	           for (int i = 0; i < s.length; i++) {
	              char s1[]=s[i].toCharArray();
				for (int j = 0; j < s1.length; j++) {
					arr[s1[j]-'a']++;
				}
			
	           }
		for (int i = 0; i < arr.length; i++) {
			char ans=(char) ('a'+i);
			if(arr[i]>=1)
			System.out.println(ans+" "+arr[i]);
		}
		}

	}



