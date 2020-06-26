/*
문제 설명


비트 연산의 꽃이라고 할 수 있는 시프트(Shift) 연산에 대해 배우고 실습하는 문제입니다. 시프트(Shift)의 결과값이 출력되는 프로그램을 작성하십시오.

비트 값(열)을 지시한 만큼 왼쪽이나 오른쪽으로 이동시키는 연산자 입니다. 많은 상황에서 효율적으로 사용될 수 있으므로 잘 익혀두시길 바랍니다.

1. Right Shift ( >> )
오른쪽으로 특정 비트 수 만큼 이동하고 빈자리는 양수 일때는 0, 음수 일때는 1로 채운다.

2. Left Shift ( << )
왼쪽으로 특정 비트 수 만큼 이동하고 빈자리는 0으로 채운다.

입력 : 두개의 수 a, p

출력 : 첫 줄에 a >> b의 결과, 다음 줄에 a << b의 결과  

*/

package project;

import java.io.*;
import java.util.*;

public class Today_algorithm_003 {
    public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] arr = input.split(" ");
		int result = Integer.parseInt(arr[0]) >> Integer.parseInt(arr[1]);
		System.out.println(result);
		result = Integer.parseInt(arr[0]) << Integer.parseInt(arr[1]);
		System.out.println(result);
    }
}