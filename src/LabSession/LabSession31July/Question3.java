package LabSession31July;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

	public static void main(String[] args) {
	String s="aabbbccccdde";
		Map<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				int count=map.get(c);
				map.put(c, count+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character,Integer>e:map.entrySet()) {
			if(e.getValue()==1)System.out.print("Non repeating value is :"+ e.getKey());
		}

	}

}
