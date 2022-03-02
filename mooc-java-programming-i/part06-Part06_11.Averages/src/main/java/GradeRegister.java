
import java.util.ArrayList;

public class GradeRegister {

    private static ArrayList<Integer> pointslist;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.pointslist = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {
        
        pointslist.add(points);

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        
        double average = (double) sum / this.grades.size();
        return average;
    }
    
    public double averageOfPoints() {
        if (this.pointslist.isEmpty()) {
            return -1;
        }
        
        int sum = 0;
        for (int points : pointslist) {
            sum += points;
        }
        
        double average = (double) sum / this.pointslist.size();
        return average;
    }
}
