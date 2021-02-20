package Searching_n_Sorting;

import java.util.Scanner;

public class DoubleHelix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==0)
				break;
			else {
				int a[]= new int[n];
				for(int i=0;i<n;i++) 
					a[i]=sc.nextInt();
				int m = sc.nextInt();
				int b[]= new int[m];
				
				for(int j=0;j<m;j++) {
					b[j]=sc.nextInt();
					
				}
				
				int s1=0,s2=0;
				int i=0,j=0;
				int tolsum=0;
				 while(i<n && j<m) {
					 if(a[i]<b[j])
						 s1+=a[i++];
						
					 else if(b[j]<a[i])
						 s2+=b[j++];
					  
					 else {
						 tolsum= tolsum + Math.max(s1,s2) + a[i];
						 s1=s2=0;
						 i++;
						 j++;
					 }
					 
					 while(i<n) {
						 s1+=a[i++];
						 
					 }
					 while(j<m) {
						 s2+=b[j++];
						 
					 }
					 tolsum = tolsum + Math.max(s1,s2);
					 System.out.println(tolsum);
					 }
				 }
			}
					
		

	}

	

}
