package exercise;

import java.util.Iterator;

public class Pattern {

	public static void main(String[] args) {
		
			int n=5;
			//char ch='a';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.println("*");
					//ch++;
				}
				else
					System.out.println("");
			}
			//System.out.println();
			//ch++;
		}	

	}

}
