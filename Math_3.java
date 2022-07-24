import java.util.ArrayList;

public class math3 {
	public static void main(String[] args) {
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
    }
