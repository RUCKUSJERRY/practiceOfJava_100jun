package com.level02;

import java.util.Arrays;

public class phoneNumList {

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		solution(phone_book);
	}
	
	public static boolean solution(String[] phone_book) {
        
        boolean answer = true;
        
        Arrays.sort(phone_book);
        // ���� ������������ �迭 ����
        System.out.println(Arrays.toString(phone_book));
        for (int i = 0; i < phone_book.length-1; i++) {
        	// �迭�� ���� -1 ��ŭ for�� �ݺ�
        	if(phone_book[i+1].startsWith(phone_book[i])) {
        		// i+1�� i�� ���� �����Ѵٸ� false �����ϱ�
        		answer = false;
				break;
        	}  	
		}
        System.out.println(answer); 
        return answer;
    }
	
}