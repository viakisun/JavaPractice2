package com.via.practice;

public class Util {
	public static float convertCelciusToFarenheit(float celciusValue) {
		// Formula : (0¡ÆC ¡¿ 9/5) + 32 = 32¡ÆF
		return celciusValue * 9 / 5.0f + 32;
	}

	public static long sumFromTo(int startNum, int endNum) {
		if (startNum >= endNum)
			return -1;

		int nSumValue = 0;
		for (int i = startNum; i <= endNum; i++) {
			nSumValue += i;
		}

		return nSumValue;
	}
}
