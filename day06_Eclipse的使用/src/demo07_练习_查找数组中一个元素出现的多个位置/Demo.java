package demo07_��ϰ_����������һ��Ԫ�س��ֵĶ��λ��;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,43,24,32,5,4,63,32,54,5,24,32,543,24};
		int[] result = findNum(arr,24);//result = 2233;
		if(result == null){
			System.out.println("����û���ҵ���");
		}else{
			printArray(result);
		}
	}
	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1){
				System.out.print(" ,");
			}
		}
		System.out.print("]");
	}
	private static int[] findNum(int[] arr, int num) {
		//1.ȷ�����Ԫ������������г��ֵ�"����"
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num){
				count++;
			}
		}
		//2.ʹ��count����һ������
		if(count == 0){//���ж��Ƿ������Ԫ�أ����û�У����أ�null
			return null;
		}
		//����һ��������--����洢Ԫ�ص�����
		int[] indexArray = new int[count];//indexArray = 2233;
		int index = 0;//���������ΪindexArray���������ʹ��
		//��ʼ��������
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] == num){
				//��"����"�浽indexArray������
				indexArray[index] = i;
				index++;
			}
		}
		//��indexArray���鷵��
		return indexArray;//return 2233
	}
}
