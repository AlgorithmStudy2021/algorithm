def solution(n, a, b):
    answer = 0

    # a와 b의 값이 같아질때까지 반복.
    while (a != b):
        # 라운드 수 카운트.
        answer += 1
        # A의 다음 라운드 번호
        a = (a + 1)//2
        # B의 다음 라운드 번호.
        b = (b + 1)//2

        # A, B가 만나는 라운드 반환.
    return answer
