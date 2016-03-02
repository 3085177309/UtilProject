package com.util.numberutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 常用数字处理工具类
 *
 */
public class NumUtil {
	/**
	 * 字符串转浮点型，如果为空則返回NULL
	 * 
	 * @param num
	 * @return
	 */
	public static Float createFloat(String num) {
		if (num == null || num.equals(""))
			return null;
		try {
			return new Float(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 字符串转整型，如果为空則返回NULL
	 * 
	 * @param num
	 * @return
	 */
	public static Integer createInteger(String num) {
		if (num == null || num.equals(""))
			return null;
		try {
			return new Integer(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 字符串转Double，如果为空則返回NULL
	 * 
	 * @param num
	 * @return
	 */
	public static Double createDouble(String num) {
		if (num == null || num.equals(""))
			return null;
		try {
			return new Double(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 字符串转长整型，如果为空則返回NULL
	 * 
	 * @param num
	 * @return
	 */
	public static Long createLong(String num) {
		if (num == null || num.equals(""))
			return null;
		try {
			return new Long(num);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Integer[] toIntegerArr(String strArr[]) {
		Integer[] ia = new Integer[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			ia[i] = Integer.valueOf(strArr[i]);
		}
		return ia;
	}

	public static List<Integer> toIntegerList(List<String> strList) {
		List<Integer> l = new ArrayList<Integer>();
		Iterator<String> it = strList.iterator();
		while (it.hasNext()) {
			l.add(Integer.valueOf(it.next()));
		}
		return l;
	}

	public static List<Integer> toIntegerList(String[] strArr) {
		List<Integer> l = new ArrayList<Integer>();
		for (String str : strArr) {
			l.add(Integer.valueOf(str));
		}
		return l;
	}

	public static List<Integer> toIntegerList(String bet, String splitStr) {
		List<Integer> l = new ArrayList<Integer>();
		if (bet.indexOf(splitStr) != -1) {
			String[] bets = bet.split(splitStr);
			for (String str : bets) {
				l.add(Integer.valueOf(str));
			}
		} else {
			l.add(Integer.valueOf(bet));
		}
		return l;
	}

	public static Integer[] listToIntegerArr(List<String> intList) {
		Integer[] arr = new Integer[intList.size()];
		for (int i = 0; i < intList.size(); i++) {
			arr[i] = Integer.valueOf(intList.get(i));
		}
		return arr;
	}

	public static Integer compare(Integer[] bet, Integer[] result, Boolean sort) {
		Integer hit = Integer.valueOf("0");
		if (sort) {
			Arrays.sort(bet);
			Arrays.sort(result);
		}
		for (int i = 0; i < bet.length; i++) {
			if (bet[i].equals(result[i])) {
				hit++;
			}
		}
		return hit;
	}
	
	/**
	 * 功能描述：判断是否为质数
	 */
	public static boolean isPrime(int x) {
		if (x <= 7) {
			if (x == 2 || x == 3 || x == 5 || x == 7)
				return true;
		}
		int c = 7;
		if (x % 2 == 0)
			return false;
		if (x % 3 == 0)
			return false;
		if (x % 5 == 0)
			return false;
		int end = (int) Math.sqrt(x);
		while (c <= end) {
			if (x % c == 0) {
				return false;
			}
			c += 4;
			if (x % c == 0) {
				return false;
			}
			c += 2;
			if (x % c == 0) {
				return false;
			}
			c += 4;
			if (x % c == 0) {
				return false;
			}
			c += 2;
			if (x % c == 0) {
				return false;
			}
			c += 4;
			if (x % c == 0) {
				return false;
			}
			c += 6;
			if (x % c == 0) {
				return false;
			}
			c += 2;
			if (x % c == 0) {
				return false;
			}
			c += 6;
		}
		return true;
	}
	
	
	/**
	 * 数字转换字符串 不足长度补零  目标stringLenth字符串长度:2 转为002
	 * @param num
	 * @param stringLenth
	 * @return
	 */
	public static String getNumToString(int num,int stringLenth){
	  String str_m = String.valueOf(num);
	  StringBuffer str = new StringBuffer();
	  for(int i=0;i<stringLenth;i++) {
		  str.append("0");
	  }
	  str_m=str.substring(0, stringLenth-str_m.length())+str_m;
	  return str_m;
	}
}
