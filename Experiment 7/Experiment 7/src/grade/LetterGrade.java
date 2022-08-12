package grade;

public class LetterGrade extends Marks{
    final private String[] letterGrade = new String[3];
    final private float[] percentage = new float[3];
    public String[] getLetterGrade() {
        setPercentage();
        setLetterGrade();
        return letterGrade;
    }

    private void setPercentage() {
        float[] marks = getMark();
        float[] courseMarks = getCourseMark();
        for (int i = 0; i < 3; i++) {
            percentage[i] = (marks[i]/courseMarks[i])*100;
        }
    }

    private void setLetterGrade(){
        for(int i = 0; i < 3; i++){
            if(percentage[i] < 40)
                letterGrade[i] = "F";
            else if(percentage[i] < 45)
                letterGrade[i] = "D";
            else if(percentage[i] < 50)
                letterGrade[i] = "C";
            else if(percentage[i] < 55)
                letterGrade[i] = "C+";
            else if(percentage[i] < 60)
                letterGrade[i] = "B-";
            else if(percentage[i] < 65)
                letterGrade[i] = "B";
            else if(percentage[i] < 70)
                letterGrade[i] = "B+";
            else if(percentage[i] < 75)
                letterGrade[i] = "A-";
            else if(percentage[i] < 80)
                letterGrade[i] = "A";
            else
                letterGrade[i] = "A+";
        }
    }
}
