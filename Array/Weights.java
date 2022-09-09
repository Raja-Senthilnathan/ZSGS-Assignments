package Zoho;

import java.util.Arrays;

public class Weights {
	
	public static boolean sqrt(int value) {
		
		double temp = Math.sqrt(value);
		return (temp-Math.floor(temp)==0);
		
	}
	
	public static void sort(int[][] arr) {
		Arrays.sort(arr,(a,b)->(Integer.compare(b[1], a[1]))==0 ? Integer.compare(b[0], a[0]) : Integer.compare(b[1], a[1]));
	}
	
    public static void main(String[]args) {
		
		int[] input = {49,36,8,10,12};
		int n = input.length;
		int[][] output = new int[n][2];
		
		for(int i=0; i<input.length; i++) {
			int count = 0;
			if(sqrt(input[i])==true) {
				count+=5;
			}
			if(input[i]%4==0 && input[i]%6==0) {
				count+=4;
			}
			if(input[i]%2==0) {
				count+=3;
			}
			output[i][0]= input[i];
			output[i][1]=count;
		}	
		sort(output);
		System.out.println(Arrays.deepToString(output));
	}
}
