package demo07_练习_查找数组中一个元素出现的多个位置;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,43,24,32,5,4,63,32,54,5,24,32,543,24};
		int[] result = findNum(arr,24);//result = 2233;
		if(result == null){
			System.out.println("数字没有找到！");
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
		//1.确定这个元素在这个数组中出现的"次数"
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num){
				count++;
			}
		}
		//2.使用count创建一个数组
		if(count == 0){//先判断是否有这个元素，如果没有，返回：null
			return null;
		}
		//定义一个新数组--数组存储元素的索引
		int[] indexArray = new int[count];//indexArray = 2233;
		int index = 0;//这个索引作为indexArray数组的索引使用
		//开始遍历查找
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] == num){
				//将"索引"存到indexArray数组中
				indexArray[index] = i;
				index++;
			}
		}
		//将indexArray数组返回
		return indexArray;//return 2233
	}
}
