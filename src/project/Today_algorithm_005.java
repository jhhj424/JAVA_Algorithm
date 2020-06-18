/*
문제 설명

양의 정수를 입력 받고 그 수의 약수를 모두 출력하는 프로그램을 작성하십시오.

입력 양의정수

출력 입력된 수의 약수를 공백으로 구분하여 출력

*/

package project;

import java.io.*;
import java.util.*;

public class Today_algorithm_005 {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		String result = "";
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				result += i + " ";
			}
		}
		System.out.println(result);
	}
}