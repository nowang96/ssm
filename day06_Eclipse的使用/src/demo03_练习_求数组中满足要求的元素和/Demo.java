package demo03_��ϰ_������������Ҫ���Ԫ�غ�;
/*
 * 2.3	������������Ҫ���Ԫ�غ�
 * 
 * ����
 * 	(1)����һ��int���͵�һά���飬����Ϊ{171,72,19,16,118,51,210,7,18}
	(2)���������������Ҫ���Ԫ�غ͡�
	(3)��͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż����

 */
public class Demo {
	public static void main(String[] args) {
		int[] arr = {171,72,19,17,178,51,210,7,18};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0 && 
					arr[i] % 10 != 7 && 
					arr[i] / 10 % 10 != 7){
				System.out.println("����" + arr[i]);
				sum += arr[i];
			}
		}
		System.out.println("���ǣ�" + sum);
	}
}
