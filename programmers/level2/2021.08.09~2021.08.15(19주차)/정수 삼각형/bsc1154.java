package test;

import java.util.*;

public class candidateKey {
    public static void main(String args[]){
        List<Map<String,Object>> agreelist = new ArrayList<Map<String,Object>>();

        List<Map<String,Object>> st2 = new ArrayList<Map<String,Object>>();
        Map<String,Object> test2 = new HashMap<String,Object>();
        List<Map<String,Object>> eachAgreeList = new ArrayList<Map<String,Object>>();
        stackpush(agreelist);
        int listCnt=0;
        int eachCnt=0;
        int execCnt = agreelist.size()/3;
        int execCnt2 = agreelist.size()%3;
        int i=0;
        for(Map<String,Object> data : agreelist){
            eachCnt++;
            eachAgreeList.add(data);
            i++;

            if((execCnt>0&&eachCnt==3)){
                test2.put("gsragree",eachAgreeList);

                //3단위가 차면 쏜다.(execCnt가 0이상이면서) 쏘고 단위 초기화 i++ 하나쏠떄마다 execCnt 감소 execCnt가 0 일때 나머지 만큼 보낸다.
                System.out.println("rx"+test2);

                //1. 돌면서 하나씩 쏘고 받는다.
                //2. 받은 리스폰스를 배열에 add
                //3. list 10개 이다.
                eachAgreeList.clear();//쏘면 쏜 대상 리스트는 지운다.
                eachCnt=0; //쏘고 나서 실행단위는 초기화 시킨다.
                execCnt--;
            }


            if(execCnt<=0&&agreelist.size()==i){//사이즈 마감이면서 실행단위가 0 이하이면
                test2.put("gsragree",eachAgreeList);
                System.out.println("rx"+test2);
            }


        }





        //저장된 스택에서 3개씩 끊어서 소켓 쏘기 -->




        //1. stack 마지막에 저장한 데이터를 가장 먼저 꺼내게 된다.
        //2. queue 먼저 들어간 데이터를 먼저 꺼내는 구조
        //3. boolean empty 비어있는지 여부 판단,
        // peek 맨위에 저장된 객체 반환, pop과 달리 꺼내지는 않음
        //pop 스택 맨위에 저장된 객체를 꺼냄 비었을때 익셉션 발생
        //
    }

    public static List<Map<String,Object>> stackpush(List<Map<String,Object>> st){
        Map<String,Object> data = new HashMap<String,Object>();
        Map<String,Object> data2 = new HashMap<String,Object>();
        Map<String,Object> data3 = new HashMap<String,Object>();
        Map<String,Object> data4 = new HashMap<String,Object>();
        Map<String,Object> data5 = new HashMap<String,Object>();
        Map<String,Object> data6 = new HashMap<String,Object>();
        Map<String,Object> data7 = new HashMap<String,Object>();
        Map<String,Object> data8 = new HashMap<String,Object>();
        Map<String,Object> data9 = new HashMap<String,Object>();
        Map<String,Object> data10 = new HashMap<String,Object>();
        data.put("GSR_NO","R1");
        data.put("GSH_NO","H1");
        data.put("UNITY_MBER_NO","U1");
        data2.put("GSR_NO","R2");
        data2.put("GSH_NO","H2");
        data2.put("UNITY_MBER_NO","U2");
        data3.put("GSR_NO","R3");
        data3.put("GSH_NO","H3");
        data3.put("UNITY_MBER_NO","U3");
        data4.put("GSR_NO","R4");
        data4.put("GSH_NO","H4");
        data4.put("UNITY_MBER_NO","U4");
        data5.put("GSR_NO","R5");
        data5.put("GSH_NO","H5");
        data5.put("UNITY_MBER_NO","U5");
        data6.put("GSR_NO","R6");
        data6.put("GSH_NO","H6");
        data6.put("UNITY_MBER_NO","U6");
        data7.put("GSR_NO","R7");
        data7.put("GSH_NO","H7");
        data7.put("UNITY_MBER_NO","U7");
        data8.put("GSR_NO","R8");
        data8.put("GSH_NO","H8");
        data8.put("UNITY_MBER_NO","U8");
        data9.put("GSR_NO","R9");
        data9.put("GSH_NO","H9");
        data9.put("UNITY_MBER_NO","U9");
        data10.put("GSR_NO","R10");
        data10.put("GSH_NO","H10");
        data10.put("UNITY_MBER_NO","U10");
        st.add(data);
        st.add(data2);
        st.add(data3);
        st.add(data4);
        st.add(data5);
        st.add(data6);
        st.add(data7);
        st.add(data8);
        st.add(data9);
        st.add(data10);
        return st;
    }
}
