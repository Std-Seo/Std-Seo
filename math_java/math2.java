package math_java;

public class math2 {
	public static void main(String[] args) {
    // 3번 프린트 문제 7번
		int count = 0;
		for(int i = 30; i <= 99; i++) {
			if(i % 2 == 0) {
				count++;
			}
		}
		System.out.println("짝수의 개수 : " + count + "가지");
		
		// 3번 프린트 문제 8번
			int cnt = 0;
			for(int i = 20; i < 70; i++) {
				if(i % 5 == 0) {
					cnt++;
				}
			}
			System.out.println("5의 배수의 개수 : " + cnt + "가지");
     }
  }