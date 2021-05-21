def solution(s):
    answer = ''
    # 띄어쓰기를 제거한 문자열을 만든다.
    s = s.split(' ')
    for i in range(len(s)):
        # capitalize 내장함수를 사용하면
        # 첫 문자가 알파벳일 경우 대문자로 만들고 두번째 문자부터는 자동으로 소문자로 만든다
        s[i] = s[i].capitalize()

    # s의 원소 사이에 띄어쓰기가 들어간 하나의 문자열로 만든다.
    answer = ' '.join(s)
    return answer
