import java.util.Scanner;


public class SelectionSort {

	
	public static void main(String[] args) {
		int r,temp,min=0;
		Scanner ob=new Scanner (System.in);
		System.out.println("Enter number");
		 r=ob.nextInt();
		 System.out.println("Enter elements for sorting:");
		 int b[]=new int[100];
		 for(int p=0;p<r;p++)
		 {
			 b[p]=ob.nextInt();
		 }
		 for(int p=0;p<r-1;p++)
		 {
			 min=p;
			 for(int q=p+1;q<r;q++)
			 {
				 if(b[q]<b[p])
				 {
					 temp=b[p];
					 b[p]=b[q];
					 b[q]=temp;
				 }
			 }
		 }
		 System.out.println("Elements after sorting:");
		 for(int p=0;p<r;p++)
		 {
			 System.out.println(b[p]); 
		 }

	}

}
