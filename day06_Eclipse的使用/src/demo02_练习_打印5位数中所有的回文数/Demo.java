package demo02_��ϰ_��ӡ5λ�������еĻ�����;
/*
 * 2.2	��ӡ5λ�������еĻ�����
 * 		��������12321
 * 
 * 		˼·��
 * 		1).��λ����10000 -- 99999
 * 		2).������λ����ÿһλ��
 * 			���֣�
 * 			��λ������ % 10
 * 			ʮλ������ / 10 % 10
 * 			��λ������ / 100 % 10
 * 			...
 * 		3).�ж�
 */
public class Demo {
	public static void main(String[] args) {
		//1.������λ��
		for(int i = 10000 ; i <= 99999 ; i++){
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			int qian = i / 1000 % 10;
			int wan = i / 10000 % 10;
			
			if(ge == wan && shi == qian){
				System.out.println("��������" + i);
			}
		}
	}
}
