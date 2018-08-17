package demo05_练习_数组反转;
/*
 * 数组反转
 */
public class Demo {
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(1224);
		sBuffer.reverse();
		System.out.println(sBuffer.toString().charAt(0));
		int[] arr = {1,432,4,325,4343,2432,5,9};
		for(int i = 0,j = arr.length - 1; i < j ; i++,j--){
			//交换
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		printArray(arr);
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
}
