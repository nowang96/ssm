package demo03_练习_求数组中满足要求的元素和;
/*
 * 2.3	求数组中满足要求的元素和
 * 
 * 需求：
 * 	(1)定义一个int类型的一维数组，内容为{171,72,19,16,118,51,210,7,18}
	(2)求出该数组中满足要求的元素和。
	(3)求和的元素的个位和十位不能包含7,并且只能为偶数。

 */
public class Demo {
	public static void main(String[] args) {
		int[] arr = {171,72,19,17,178,51,210,7,18};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 && 
					arr[i] % 10 != 7 && 
					arr[i] / 10 % 10 != 7){
				System.out.println("数：" + arr[i]);
				sum += arr[i];
			}
		}
		System.out.println("和是：" + sum);
	}
}
