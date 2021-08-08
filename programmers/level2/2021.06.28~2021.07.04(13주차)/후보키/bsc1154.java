package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class Solution {

    static ArrayList<HashSet<Integer>> candidateKey;
    static String Table[][];
    static int length;
    static int answer;
    public static int solution(String[][] relation) {
        answer = 0;
        candidateKey = new ArrayList<HashSet<Integer>>();
        Table = relation;
        length = relation[0].length;//컬럼개수
        for(int i = 1; i <= length; i++) {
            makeSet(-1, i, 0, new HashSet<Integer>());
        }

        return answer;
    }

    public static void makeSet(int index, int target, int count, HashSet<Integer> set) {//0번째 로우의 카운트

        if(count == target) {//검사할 타겟 로우와 카운팅이 같으면
            if(!isUnique(set)) {
                return;
            }
            for(HashSet<Integer> key: candidateKey) {
                if(set.containsAll(key)) {//후보키조합에 포함되어잇으면 종료
                    return;
                }
            }
            candidateKey.add(set);//후보키 증가
            answer++;
            return;
        }

        for(int i = index + 1; i < length; i++) {
            HashSet<Integer> newSet = new HashSet<Integer>(set);
            newSet.add(i);
            makeSet(i, target, count + 1, newSet);
        }

    }

    public static boolean isUnique(HashSet<Integer> set) {

        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < Table.length; i++) { //5
            String temp = "";
            for(int index: set) {//한 로우의 요소를 하나씩 누적
                temp+= Table[i][index];
            }
            if(!list.contains(temp)) {//해당 조합이 포함되는지 검사
                list.add(temp);//안 포함되면 리스트에 넣음
            }else {
                return false;
            }
        }
        return true;
    }
}
