class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circleStudentCount = 0, squareStudentCount = 0;
        for (int student : students) {
            if (student == 1)
                squareStudentCount++;
            else
                circleStudentCount++;
        }

        for(int i =0; i<sandwiches.length; i++){
            if(sandwiches[i] ==1 && squareStudentCount != 0){
                squareStudentCount--;
            }else if (sandwiches[i] == 0 && circleStudentCount != 0){
                circleStudentCount--;
            }else if(sandwiches[i] ==1 && squareStudentCount == 0){
                return circleStudentCount;
            }else{
                return squareStudentCount;
            }
        }

        return 0;
    }
}