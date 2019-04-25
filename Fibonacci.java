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
		
		//返回值为String时的输出值
		for(i=1;i<=200;i++) {
			System.out.println(ofReturnString(i));
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
	
	/**
	 * 返回值为String
	 * 不越界
	 */
	private static String ofReturnString(int num) {
		if(num == 1 || num == 2) return "1";
		String strs[] = new String[num+1];
		strs[1] = new String("1");
		strs[2] = new String("1");
		int count = 3;
		while(count <= num) {
			strs[count] = new String(strAdd(strs[count-1], strs[count-2]));
			count ++;
		}
		return strs[num];
	}
	private static String strAdd(String f, String s) {
		StringBuffer res = new StringBuffer();
		int tmp =0, jin = 0, i = f.length() - 1, j = s.length() - 1;
		while(i>=0 && j >=0) {
			tmp = jin + (f.codePointAt(i--) - 48) + (s.charAt(j--) - 48);
			jin = tmp / 10;
			res.append((char)(tmp % 10 + 48));
		}
		while(i >=0) {
			tmp = jin + (f.codePointAt(i--) - 48);
			jin = tmp / 10;
			res.append((char)(tmp % 10 + 48));
		}
		while(j >=0) {
			tmp = jin + (f.codePointAt(j--) - 48);
			jin = tmp / 10;
			res.append((char)(tmp % 10 + 48));
		}
		if(jin >0) res.append((char)(jin + 48));
		return res.reverse().toString();
	}
}