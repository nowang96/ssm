package demo01_��ϰ_��ӡ����;

import java.util.Scanner;
//�ɰ��ı�ǵ�23
//���Ƿ�֧
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������1-12���·�ֵ��");
		int m = sc.nextInt();
		switch(m){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("���������������");
				break;
		}
	}
}
