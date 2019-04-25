package homework;

import java.math.BigInteger;

public class Fibonacci {
	public static void main(String[] args) {
		int i = 0;
		//返回值为int时的输出值
		for(i=1; i<=200;i++){
			//System.out.println(of(i));
		}
		
		//返回值为long时的输出值
		for(i=1; i<=200;i++){
			//System.out.println(ofReturnLong(i));
		}
		
		//返回值为BigInteger时的输出值
		for(i=1; i<=200;i++){
			//System.out.println(ofReturnBiginteger(i).toString());
		}
	}
	
	/**
	 * 返回值为int
	 * num等于47时，越界
	 */
	private static int of(int num){
		if(num == 1 || num == 2) return 1;
		int f = 1, s = 1, tmp =0;
		while((num--)>=3){
			tmp = f + s;
			f = s;
			s = tmp;
		}
		return s;
	}
	
	/**
	 * 返回值为long
	 * num等于93时，越界
	 */
	private static long ofReturnLong(int num) {
		if(num == 1 || num == 2) return 1;
		long f = 1, s = 1, tmp =0;
		while((num--)>=3){
			tmp = f + s;
			f = s;
			s = tmp;
		}
		return s;
	}
	
	/**
	 * 返回值为BigInteger
	 * 不越界
	 */
	private static BigInteger ofReturnBiginteger(int num) {
		if(num == 1 || num == 2) return BigInteger.ONE;
		BigInteger f = BigInteger.valueOf(1), s = BigInteger.valueOf(1), tmp = BigInteger.valueOf(0);
		while((num--)>=3){
			tmp = f.add(s);
			f = s;
			s = tmp;
		}
		return s;
	}
}
