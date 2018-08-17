package demo02_练习_打印5位数中所有的回文数;
/*
 * 2.2	打印5位数中所有的回文数
 * 		回文数：12321
 * 
 * 		思路：
 * 		1).五位数：10000 -- 99999
 * 		2).解析五位数的每一位：
 * 			数字：
 * 			个位：数字 % 10
 * 			十位：数字 / 10 % 10
 * 			百位：数字 / 100 % 10
 * 			...
 * 		3).判断
 */
public class Demo {
	public static void main(String[] args) {
		//1.遍历五位数
		for(int i = 10000 ; i <= 99999 ; i++){
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			int qian = i / 1000 % 10;
			int wan = i / 10000 % 10;
			
			if(ge == wan && shi == qian){
				System.out.println("回文数：" + i);
			}
		}
	}
}
