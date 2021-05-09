from itertools import combinations
from collections import Counter


def solution(orders, course):
    answer = []
    for count in course:
        array = []
        for order in orders:
            # course의 원소는 메뉴의 갯수. 메뉴 갯수에 맞는 조합이 튜플로 만들어짐.
            combi = combinations(sorted(order), count)
            array += combi
        # 각 조합의 갯수를 샌다.
        counter = Counter(array)
        # 길이가 0 = 조합이 하나도 없음.
        # counter.values의 최대값이 1 = 주문한 사람이 1명
        # 즉 만들어진 조합이 1개 이상이고, 주문한 사람이 2명 이상이면
        if len(counter) != 0 and max(counter.values()) != 1:
            print('counter in if')
            print(counter)
            # 현재 count에 해당하는 메뉴 조합 중 가장 많이 주문된 것을 주문 조합으로 넣음.
            answer += [''.join(f) for f in counter if counter[f]
                       == max(counter.values())]
            print('this is answer')
            print(answer)
    return sorted(answer)
