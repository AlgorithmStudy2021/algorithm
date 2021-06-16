def solution(s):
    answer = []
    result = ""
    count = 0
    while_count = 0
    while s != "1":
        list_s = list(s)
        s = format(list_s.count("1"), 'b')
        count += list_s.count("0")
        while_count += 1
    return [while_count, count]