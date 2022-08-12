package grade;

import java.util.Arrays;

public class CalculateCGPA extends LetterGrade{
    private float CGPA = 0;
    private String[] letterGrade;
    private float[] courseCredit;

    public float getCGPA(){
        float totalCredit = 0;
        letterGrade = getLetterGrade();
        courseCredit = getCourseCredit();

        for(int i = 0; i < 3; i++)
            totalCredit += courseCredit[i];
        calculateCGPA();
        return CGPA/totalCredit;
    }
    void calculateCGPA(){

        for(int i = 0; i < 3; i++){
            if(letterGrade[i] == "A+")
                CGPA += (4.00 * courseCredit[i]);
            else if(letterGrade[i] == "A")
                CGPA += (3.75 * courseCredit[i]);
            else if(letterGrade[i] == "A-")
                CGPA += (3.50 * courseCredit[i]);
            else if(letterGrade[i] == "B+")
                CGPA += (3.25 * courseCredit[i]);
            else if(letterGrade[i] == "B")
                CGPA += (3.00 * courseCredit[i]);
            else if(letterGrade[i] == "B-")
                CGPA += (2.75 * courseCredit[i]);
            else if(letterGrade[i] == "C+")
                CGPA += (2.50 * courseCredit[i]);
            else if(letterGrade[i] == "C")
                CGPA += (2.25 * courseCredit[i]);
            else if(letterGrade[i] == "D")
                CGPA += (2.00 * courseCredit[i]);
        }
    }

    @Override
    public String toString() {
        return
                "name='" + getName() + '\'' +
                        ", id=" + getName() +
                        ", nameOfDept='" + getNameOfDept() + ", Course Marks = " + Arrays.toString(getMark()) + "\n";
    }
}
