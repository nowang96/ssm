package demo04_练习_取平均分;

import java.util.Scanner;

/*
 *   需求：
	(1)在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
	(2)选手的最后得分为：去掉一个最高分和一个最低分后 其余4个选手的平均值。
	(3)请写代码实现。(不考虑小数部分)
	
	思路：
	1.6个评委--6个int分-->int[]
	2.分数：从控制台接收；
	3.找到一个最大值，找到一个最小值，并去掉这两个值。
	   1).先找最大值、最小值
	   2).求6个分数的总和
	   3).将总和减掉最大值、最小值
	   4).结果 / 4
	  
		
 */
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//由于固定是6个
		int[] scoreArray = new int[6];
		//填充
		for(int i = 0 ;i < scoreArray.length ; i++){
			System.out.println("请输入第 " + (i + 1) + " 个分数：");
			int s = sc.nextInt();
			scoreArray[i] = s;
		}
		//找到最高分：
		int max = getMax(scoreArray) ;
		//找到最低分：
		int min = getMin(scoreArray);
		
		//计算最后得分：
		int sum = getSum(scoreArray);
		sum = sum - max - min;
		
		int avg = sum / 4;
		
		System.out.println("去掉一个最高分：" + max);
		System.out.println("去掉一个最低分：" + min);
		System.out.println("最后得分：" + avg);
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
