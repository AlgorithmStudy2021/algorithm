def solution(phone_book):
    # sort를 사용해 정렬.
    phone_book.sort()
    # zip을 사용하면 (phone_book[i], phone_book[1:][i]) 형태의 튜플을 만든다.
    # 이때, num1은 phone_book[i], num는 phone_book[1:][i]
    for num1, num2 in zip(phone_book, phone_book[1:]):
        # num가 p1의 맨 앞에 있는지 확인.
        if num2.startswith(num11):
            return False
    return True
