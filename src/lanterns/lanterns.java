package lanterns;
import java.util.Scanner;
import java.util.Arrays;

public class lanterns {

	public static void main(String[] args) {
		
				Scanner in=new Scanner(System.in);
				int n,l,d=0;// m=> the maximum distance between lanterns 
				n=in.nextInt();//num. of laterns
				l=in.nextInt();// length of street
				int [] arr=new int [n];//array of lanterns
				for(int i=0;i<n;i++) {
					arr[i]=in.nextInt();
				}
				Arrays.sort(arr);//to order lanterns
				
				for(int i=0;i<n-1;i++) {
					if(arr[i+1]-arr[i]>d) {
						d=arr[i+1]-arr[i];
					}	
				}
				double x=arr[0];//left border
				double r=(double)d/2;
				double dist=Math.max(x, r);
				double z=l-arr[n-1];//right border
				dist=Math.max(dist, z);
				System.out.printf("%.10f\n",dist);
				

			}

		

	}


