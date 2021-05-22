class Solution {
    public int gcd(int a, int b){ //최대공약수를 구하는 함수
    while(b!=0){
        int r = a%b;
        a = b;
        b = r;
    }
    return a;
}
 
public int lcm(int a, int b){ //최소공배수를 구하는 함수
    return (a*b)/gcd(a,b);
}
    
    public int solution(int[] arr) {
        int a = lcm(arr[0], arr[1]);
        int answer = 0;
        for (int i = 2; i<arr.length; i++){
            answer = lcm(a, arr[i]);
            a = answer;
        }
        return answer;
    }
}
