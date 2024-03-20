import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<>();
        Queue<Integer> sandwichesQueue = new LinkedList<>();


        for(int i = 0; i<students.length; i++){
            studentsQueue.offer(students[i]);
        }
        for(int i = 0; i<sandwiches.length; i++){
            sandwichesQueue.offer(sandwiches[i]);
        }
        int cnt = 0;
        int remain = students.length;
        while(cnt<remain){
            if(studentsQueue.peek()==sandwichesQueue.peek()){
                studentsQueue.poll();
                sandwichesQueue.poll();
                remain--;
                cnt = 0;
                
            }else{
                Integer b = studentsQueue.poll();
                studentsQueue.offer(b);
                cnt++;
            }
        }
        return studentsQueue.size();
    }
}