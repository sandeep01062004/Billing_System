package bill;
import java.util.*;
public class Item {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String s = sc.nextLine();
		int[] ch= {1,2,3,4,5,6};
		String[] c={"Coffee","Dum Tea","Drinks","Snacks","Samosa","Breads"};
		int a=c.length;
		double[] d= {15.00,12.00,5.00,20.00,10.00,7.00};
		System.out.println("  Items\t \t\tPrice");
		for(int i=0;i<a;i++) {
			System.out.println(ch[i]+"."+c[i]+"\t:\t"+d[i]);
		}
		int[] cho= {1,2,3,4,5,6};
		int[] add = {0,0,0,0,0,0};
		int[] q= {0,0,0,0,0,0};
		int m=0;
		int b=0;
		while(b==0) {
			System.out.println();
			System.out.println("1:Add items\n2:Remove Items\n3:Show cart\n4:show menu\n5:Print Bill");
			System.out.print("Enter Choice :");
			int l=sc.nextInt();
			System.out.println();
			if(l==1) {
				System.out.println("Enter Item Number :");
					add[m]=sc.nextInt();
					int z=-1;
					for(int i=0;i<m;i++) {
						if(add[m]==add[i]) {
							z=i;
						}
					}
					int k=0;
					for(int i=0;i<a;i++) {
						if(add[m]==ch[i]) {
							k=1;
						}
					}
					if(k==1) {
						System.out.println("Enter Quantity");
						if(z==-1) {
						q[m]=sc.nextInt();
						m++;
						}else {
							int y=sc.nextInt();
							q[z]=q[z]+y;
						}
					}
					else {
						System.out.println("Enter Valid Item Number");
					}
			}else if(l==2) {
				System.out.println("Enter Number to remove");
				int o=sc.nextInt();
				if(o<m) {
					for(int i=0;i<m;i++) {
						if(o==cho[i]) {
							for(int j=i;j<m;j++) {
								if(j==m-1) {
									add[j]=0;
									q[j]=0;
									m--;
								}else {
								add[j]=add[j+1];
								q[j]=q[j+1];
								}
							}
						}
					}
				}else {
					System.out.println("Enter valid Number that Present in cart");
				}
			}else if(l==3) {
				System.out.println("Items\t \tQuantity");
				for(int i=0;i<m;i++) {
					System.out.println(cho[i]+"."+c[add[i]-1]+"\t:\t"+q[i]);
				}
			}else if(l==4) {
				System.out.println("  Items\t \t\tPrice");
				for(int i=0;i<a;i++) {
					System.out.println(ch[i]+"."+c[i]+"\t:\t"+d[i]);
				}
			}else {
				b=1;
				double pr=0;
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}
				System.out.println("\nBill to : s");
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}
				System.out.println("\nItems\t\tQuantity\tPrice");
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}System.out.println();
				for(int i=0;i<m;i++) {
					double r = q[i]*d[add[i]-1];
					pr=pr+r;
					System.out.println(c[add[i]-1]+"\t\t"+q[i]+"\t\t"+r);
				}
				for(int i=0;i<40;i++) {
					System.out.print("-");
				}
				System.out.println("\nTotal Price\t\t\t"+pr);
				double g=pr*25/100;
				System.out.println("GST\t\t\t\t"+g);
				pr=pr+g;
				System.out.println("\nTotal Bill\t\t\t"+pr);
			}
		}
	}

}
