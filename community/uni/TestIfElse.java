package community.uni;

import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Moi ban nhap vao thang");
		int t=sc.nextInt();
		if (t==1 || t==3 || t==5 || t==7)
		{
			System.out.println("THang" +t+" 31 ngay");
		}
		else if (t==4 || t==6 || t==9)
		{
			System.out.println("Thang"+t+"30 ngay");
		}
		else
		{
			System.out.println("Khong co thang " +t+"cua ban");
		}
	}

	

}
