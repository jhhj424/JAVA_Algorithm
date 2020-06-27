/*
문제 설명

구름이는 자신의 국어 수학 영어 3과목의 시험 성적을 확인했습니다. 
평균과 등급을 알고싶어하는 구름이를 도와줄 수 있는 프로그램을 작성하십시오.

평균은 소수점 2번째 자리까지만(3 번째 자리에서 반올림) 출력하며 등급은 평균 90점 이상일 경우 A, 90점 미만 80점 이상인 경우 B, 80점 미만 70점 이상이 C, 70점 미만 60점 이상이 D이고 60점 미만으로는 F입니다.


입력
국어 영어 수학 순으로 점수 입력(각 과목 당 100점 만점)

출력
평균 등급

*/

package project;

import java.io.*;
import java.text.DecimalFormat;

public class Today_algorithm_006 {
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###########.00");
		String input = br.readLine();
		String[] a = input.split(" ");
		int sum = 0;
		for(String i: a) {
			sum += Integer.parseInt(i);			
		}
		double num = sum/3f;
		double resultNum = Math.round(num*100)/100.0;
		String result = df.format(resultNum);
		
		if(resultNum >= 90) {
			result += " A";
		} else if(resultNum >= 80) {
			result += " B";
		} else if(resultNum >= 70) {
			result += " C";
		} else if(resultNum >= 60) {
			result += " D";
		} else {
			result += " F";
		}
		
		System.out.println(result);
	}
}