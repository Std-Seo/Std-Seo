public class math {
	public static void main(String[] args) {
		
		// 2번 프린트 문제 6번
		int x, y;
		for(x = 0; x <= 5; x++) {
			for(y = 0; y <= 5; y++) {
				if(2 * x + y == 5) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		System.out.println("");
		
		// 2번 프린트 문제 7번
		int a, b;
		for(a = 0; a <= 10; a++) {
			for(b = 0; b <= 10; b++) {
				if(a + 4 * b == 10) {
					System.out.println("(" + a + "," + b + ")");
				}
			}
		}
		System.out.println("");
		
		// 2번 프린트 문제 8번
		int c, d;
		for(c = 1; c <= 4; c++) {
			for(d = 1; d <= 4; d++) {
				if(c + d <= 4) {
					System.out.println("(" + c + "," + d + ")");
				}
			}
		}
		System.out.println("");
    
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
      
    //4번 프린트 문제 1번
		int num = 36;
		int count = 0;
		int sum = 0;
		ArrayList list = new ArrayList();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				list.add(i);
			}
		}
		for(int i = 1; i <= list.size(); i++) {
			count++;
		}
		for(int i = 0; i <= list.size() - 1; i++) {
			sum += (int)list.get(i);
		}
		System.out.println(num + "의 약수의 개수 : " + count);
		System.out.println(num + "의 약수의 총합 : " + sum);
	}
  
  // 응용문제 1번 프린트 문제 7번
		int count = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				if((i + j) % 2 == 0) count++;
			}
		}
		System.out.println(count + "가지");

		// 응용문제 1번 프린트 문제 12번
		int num = 20;
		int cnt = 0;
		int a = 2, b = 5;
		for(int i = 1; i <= 100; i++) {
				if(i % a != 0) {
					if(i % b != 0) {
						cnt++;
				}
			}
		}
		System.out.println("20과 서로소인 수 : " + cnt);
	}
}
