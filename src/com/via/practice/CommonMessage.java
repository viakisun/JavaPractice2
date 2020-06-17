package com.via.practice;

public class CommonMessage {
	public static String MSG_BANK_DEPOSIT 			= "[L] %s 원 입금합니다.%n";
	public static String MSG_BANK_WITHDRAW 			= "[L] %s 원 출금합니다.%n";
	public static String MSG_BANK_AMOUNT 			= "[L] 잔액: %s 원%n";
	public static String MSG_BANK_STATUS 			= "[L] 계좌 %s (예금주:%s)%n잔액: %s 원%n";
	public static String MSG_BANK_ERROR_NEGATIVE 	= "[E] 금액은 음수를 입력할 수 없습니다.";
	public static String MSG_BANK_ERROR_NOT_ENOUGH 	= "[E] 잔액이 부족합니다.";
	public static String MSG_BANK_ERROR_DUPLICATE 	= "[E] 이미 계좌가 있습니다.";
}