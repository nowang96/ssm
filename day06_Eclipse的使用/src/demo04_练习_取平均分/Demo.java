package demo04_��ϰ_ȡƽ����;

import java.util.Scanner;

/*
 *   ����
	(1)�ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
	(2)ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ����4��ѡ�ֵ�ƽ��ֵ��
	(3)��д����ʵ�֡�(������С������)
	
	˼·��
	1.6����ί--6��int��-->int[]
	2.�������ӿ���̨���գ�
	3.�ҵ�һ�����ֵ���ҵ�һ����Сֵ����ȥ��������ֵ��
	   1).�������ֵ����Сֵ
	   2).��6���������ܺ�
	   3).���ܺͼ������ֵ����Сֵ
	   4).��� / 4
	  
		
 */
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���ڹ̶���6��
		int[] scoreArray = new int[6];
		//���
		for(int i = 0 ;i < scoreArray.length ; i++){
			System.out.println("������� " + (i + 1) + " ��������");
			int s = sc.nextInt();
			scoreArray[i] = s;
		}
		//�ҵ���߷֣�
		int max = getMax(scoreArray) ;
		//�ҵ���ͷ֣�
		int min = getMin(scoreArray);
		
		//�������÷֣�
		int sum = getSum(scoreArray);
		sum = sum - max - min;
		
		int avg = sum / 4;
		
		System.out.println("ȥ��һ����߷֣�" + max);
		System.out.println("ȥ��һ����ͷ֣�" + min);
		System.out.println("���÷֣�" + avg);
	}

	private static int getSum(int[] scoreArray) {
		int sum = 0;
		for (int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
		}
		return sum;
	}

	private static int getMin(int[] scoreArray) {
		int min = scoreArray[0];
		for(int i = 0; i < scoreArray.length ; i++){
			min = scoreArray[i] < min ? scoreArray[i] : min;
		}
		return min;
	}

	private static int getMax(int[] scoreArray) {
		int max = scoreArray[0];
		for(int i = 0; i < scoreArray.length ; i++){
			max = scoreArray[i] > max ? scoreArray[i] : max;
		}
		return max;
	}

	
}
