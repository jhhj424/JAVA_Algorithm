/*
문제 설명

N(1000이하의 자연수)을 입력하고 N 이하의 자연수중 3의 배수,5의 배수의 합을 구하는 프로그램을 작성하시오

입력 - 1000이하의 자연수

출력 - N이하의 자연수중 모든 3의 배수 그리고 5의 배수의 합

*/

package project;

import java.io.*;
import java.util.*;

public class Today_algorithm_003 {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		int result = 0;
		for(int i=1; i<num+1; i++) {
			if(i%3==0) {
				result += i;
			}else if(i%5==0) {
				result += i;
			}
		}
		System.out.println(result);
	}
}