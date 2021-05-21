def solution(arr1, arr2):

    print(range(len(arr2[0])))
    # arr[0] 길이의 리스트를 만드는데, 원소값은 0이다. => [0, 0]
    #answer = [0 for _ in range(len(arr2[0]))]
    # 3*2 의 행렬을 만든다.즉 첫번째 어레이의 행 X 두번째 어레이의 열 의 길이를 가진 2차원 행렬 만든다.
    answer = [[0 for _ in range(len(arr2[0]))] for _ in range(len(arr1))]

    for i in range(len(arr1)):
        for j in range(len(arr2[0])):
            for k in range(len(arr1[0])):
                answer[i][j] += (arr1[i][k] * arr2[k][j])
    return answer
