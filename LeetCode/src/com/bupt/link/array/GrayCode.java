package com.bupt.link.array;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public static void main(String[] args) {
		grayCode(2);
	}

	public static List<Integer> grayCode(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String byteString = "";
		for (int i = 0; i < n; i++) {
			byteString = byteString + "0";
		}
		byte b = Byte.valueOf(byteString);
		System.out.println(b);
		return list;
	}
}
