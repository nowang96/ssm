package demo06_��ϰ_����Ļ�������;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,43,240,32,543,41,4,3,545,249,3214,35};
		//�����ҳ���һ�����ֵ�24
		int index = findNum(arr,24);
		if(index == -1){
			System.out.println("û�ҵ���");
		}else{
			System.out.println("�Ҵ�����λ�ã�" + index);
		}
		
	}
	//��дһ���������������в���һ����,����ҵ����������������򣺷���-1
	public static int findNum(int[] arr,int num){
		for(int i = 0 ;i < arr.length ; i++){
			if(arr[i] == num){
				return i;
			}
		}
		//ֻҪ����ִ�е�����϶���û�ҵ�
		return -1;
	}
}
