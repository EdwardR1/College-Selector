import java.util.*;
public class StringText {
	public static void main(String[] args){
		String a = "Hong Kong International School";
		
		String c = "";
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(-1);
		
		
		for(int i=0; i<a.length(); i++){			
				if(a.charAt(i) == ' '){
					nums.add(i);
				}
		}
		
		for(int k=0; k<nums.size(); k++){
			System.out.println(nums.get(k));
		}
		
		for(int j=0; j<nums.size(); j++){
			c += a.substring(nums.get(j) + 1, nums.get(j) + 2) + " ";
		}
		System.out.println(c);
	
	}

}

/*
 * 
 * int index = word.indexOf(guess);
while(index >= 0) {
   System.out.println(index);
   index = word.indexOf(guess, index+1);
}*/
