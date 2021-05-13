import Foundation

func makeArray(_ text: String) -> [[Int]] {
    let text = text.split(separator: ",")
    var group = [[Int]](repeating: [], count: text.count)
    var index = 0
    for i in 0..<text.count {
        let num = text[i]
            .replacingOccurrences(of: "{", with: "")
            .replacingOccurrences(of: "}", with: "")
        group[index].append(contentsOf: [Int(num)!])
        if text[i].contains("}") {
            index += 1
        }
    }
    return group
}

func solution(_ s: String) -> [Int] {
    var answer = [Int]()
    let group = makeArray(s).sorted { return $0.count <= $1.count }

    for i in 0..<group.count {
        for num in group[i] {
            if !answer.contains(num) {
                answer.append(num)
            }
        }
    }
    return answer
}

print(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")) // [2, 1, 3, 4]
print(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")) // [2, 1, 3, 4]
print(solution("{{20,111},{111}}")) // [111, 20]
print(solution("{{123}}")) // [123]
print(solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")) // [3, 2, 4, 1]
