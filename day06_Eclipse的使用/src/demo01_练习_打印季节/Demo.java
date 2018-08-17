package demo01_练习_打印季节;

import java.util.Scanner;
//可爱的标记的23
//我是分支
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-12的月份值：");
		int m = sc.nextInt();
		switch(m){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("你输入的数据有误！");
				break;
		}
	}
}
