package demo06_练习_数组的基本查找;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,43,240,32,543,41,4,3,545,249,3214,35};
		//需求：找出第一个出现的24
		int index = findNum(arr,24);
		if(index == -1){
			System.out.println("没找到！");
		}else{
			System.out.println("找打啦，位置：" + index);
		}
		
	}
	//编写一个方法，在数组中查找一个数,如果找到，返回索引，否则：返回-1
	public static int findNum(int[] arr,int num){
		for(int i = 0 ;i < arr.length ; i++){
			if(arr[i] == num){
				return i;
			}
		}
		//只要代码执行到这里，肯定：没找到
		return -1;
	}
}
