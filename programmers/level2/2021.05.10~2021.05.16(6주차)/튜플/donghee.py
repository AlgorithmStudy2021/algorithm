def solution(s):
    # "{{. }}" 를 잘라낸다.
    # 2},{2,1},{2,1,3},{2,1,3,4
    s = s[2:-2]

    # },{을 없앤 뒤 숫자만 담은 리스트를 만든다. split은 왼쪽에서부터 },{ 을 만나면, 즉 기준을 만나면 그떄까지의 데이터를 하나의 원소로 리스트에 넣는다.
    #['2', '2,1', '2,1,3', '2,1,3,4']
    # 그리고 원소들의 길이순대로 나열되도록 한다.
    s = sorted(s.split("},{"), key=lambda x: len(x))

    answer = []

    for i in s:
        # , 를 제거해 리스트에 넣어준다.
        #['2'], ['2', '1'],  ['2', '1', '3'], ['2', '1', '3', '4']
        i_ = i.split(',')
        print('this is i_')
        print(i_)
        print('-----------------')
        for j in i_:
            # 만약 answer 리스트에 없다면 넣어준다.
            if int(j) not in answer:
                answer.append(int(j))

    return answer
