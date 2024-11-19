class invalidScoreLength extends Exception{
    public invalidScoreLength(String errmsg){
        super(errmsg);
    }
}
class Student{
    String name;
    Integer rollNumber;
    Double[] scores = {0.0, 0.0, 0.0};
    Character grade;
    Student(){
        this.name = "Unknown";
        this.rollNumber = 0;
        System.out.println("Student created: " + this.name + ", Roll Number: " + this.rollNumber);
    }
    Student(String name, Integer rolnum, Double[] scores){
        this.name = name;
        this.rollNumber = rolnum;
        this.scores = scores;
        System.out.println("Student created: " + this.name + ", Roll Number: " + this.rollNumber);
    }
    void setScores(Double[] scores){
        try{
            int l = scores.length;
            if (l != 3){
                throw new invalidScoreLength("Length of score list is not 3!");
            }
        }catch(invalidScoreLength msg){
            System.out.println(msg.getMessage());
        }
        this.scores = scores;
    }
    double calculateAverageScore(){
        double sum = 0;
        for(int i = 0; i < this.scores.length; i ++){
            sum += this.scores[i];
        }
        double average = sum/this.scores.length;
        return average;
    }
    void assignGrade(){
        double avg = this.calculateAverageScore();
        if (avg >= 85){
            this.grade = 'A';
        }else if (70 <= avg && avg < 85){
            this.grade = 'B';
        }else if (50 <= avg && avg < 70){
            this.grade = 'C';
        }else if (avg < 50){
            this.grade = 'D';
        }
        System.out.println("Grade assigned for " + this.name + ": " + this.grade + ".");
    }
    String displayStudentInfo(){
        String nscr = new String();
        nscr += "[";
        for (Integer i = 0; i < this.scores.length - 1; i ++){
            nscr += Double.toString(this.scores[i]) + ", ";
        }
        nscr += this.scores[this.scores.length - 1] + "]";
        return "Student: " + this.name + ".\nRoll Number: " + this.rollNumber + ".\nScores: " + nscr + ".\nAverage Score: " + this.calculateAverageScore() + ".\nGrade: " + this.grade;
    }
}

public class Solution{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, new Double[]{85.0, 90.0, 78.0});
        Student student2 = new Student("Bob", 102, new Double[]{65.0, 72.0, 60.0});
        Student student3 = new Student();
        student3.setScores(new Double[]{95.0, 88.0, 92.0});
        student1.assignGrade();
        student2.assignGrade();
        student3.assignGrade();
        System.out.println(student1.displayStudentInfo());
        System.out.println(student2.displayStudentInfo());
        System.out.println(student3.displayStudentInfo());
    }
}