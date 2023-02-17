//1.Write a program(WAP) to print INEURON using pattern programming logic.
public class Question1 {

	public static void main(String[] args) {
		int n = 11;
		 
		for (int i =0 ; i<n; i++) {
			//For letter "I"
			for(int j=0;j<n;j++) {
				if((i==n/4 && j>=n/4 && j<=3*n/4) ||
				   (i==3*n/4 && j>=n/4 && j<=3*n/4) ||
				    (j==(n-1)/2 && i>=n/4 && i<=3*n/4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			//For letter "N"
			for(int j=0;j<n;j++) {
				if((j==n/4 && i>=n/4 && i<=3*n/4) ||
				   (j==3*n/4 && i>=n/4 && i<=3*n/4)||
				    (j==i && i>=n/4 && i<=3*n/4 )) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//For letter "E"
			for(int j=0;j<n;j++) {
				if((i==n/4 && j>=n/4 && j<=3*n/4) ||
				   (i==3*n/4 && j>=n/4 && j<=3*n/4) || 
				   (j==n/4 && i>=n/4 && i<=3*n/4)||
				   (i==(n-1)/2 && j>=n/4 && j<3*n/4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//For letter "U"
			for(int j=0;j<n;j++) {
				if((j==n/4 && i>=n/4 && i<3*n/4)||
				   (j==3*n/4 && i>=n/4 && i<3*n/4)||
				   (i==3*n/4 && j>n/4 && j<3*n/4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//For letter "R"
			for(int j=0;j<n;j++) {
				if((j==n/4 && i>=n/4 && i<=3*n/4)||
				   (i==n/4 && j>=n/4 && j<3*n/4)||
				   (i==(n-1)/2 && j>=n/4 && j<3*n/4)||
				   (j==3*n/4 && i>n/4 && i<(n-1)/2)||
				   (i-j==1 && i>=(n-1)/2) && i<=3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//For letter "O"
			for(int j=0;j<n;j++) {
				if((j==n/4 && i>n/4 && i<3*n/4)||
				   (j==3*n/4 && i>n/4 && i<3*n/4)||
				   (i==3*n/4 && j>n/4 && j<3*n/4)||
				   (i==n/4 && j>n/4 && j<3*n/4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			//For letter "N"
			for(int j=0;j<n;j++) {
				if((j==n/4 && i>=n/4 && i<=3*n/4) ||
				   (j==3*n/4 && i>=n/4 && i<=3*n/4)||
				    (j==i && i>=n/4 && i<=3*n/4 )) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}		
 }		
}


