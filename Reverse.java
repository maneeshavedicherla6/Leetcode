import java.util.*;
class Reverse{
	public void reverseString(char[] s){
		int left=0;
		int right=s.length-1;
		while(left<right){
			char temp=s[left];
			s[left]=s[right];
			s[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		Reverse r=new Reverse();
		char[] s={'h','e','l','l','o'};
		r.reverseString(s);
		System.out.println(s);

		char[] s1={'A','i','m'};
		r.reverseString(s1);
		System.out.println(s1);
	}
}