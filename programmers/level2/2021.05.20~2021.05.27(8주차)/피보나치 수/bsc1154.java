public class {
  
  public int solution(int n) {
	if(n == 1 || n == 2) return 1; // @1
	
	int n1 = 1, n2 = 1, sum = 0; // @2
	for(int i=3; i<=n; i++) { // @3
		sum = n1 + n2; 
		sum %= 1234567; 
		n1 = n2; //n1은 이전 회차의 값이므로 이전 sum값임
		n2 = sum;//이전수에 
	}
	
	return sum;
}
  
}
