package day05_variables;

public class School {
    public static void main(String[] args) {
        int numberOfStudentsInGrade1 =30;
        int numberOfStudentsInGrade2 =40;
        int numberOfStudentsInGrade3 =25;
        int numberOfStudentsInGrade4 =10;
        int numberOfStudentsInGrade5 =38;


        //How can I calculate the total amout of students
        int  totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;

        //System.out.println(numberOfStudentsInGrade1 + numberOfStudentsInGrade2);

         double numberOfDaysInAYear = 100.5;
         double numberOfSnowDaysInAYear = 10;
         double averageGRAInSchool = 3.5;

        System.out.println("Number of students in Grade 1:" + numberOfStudentsInGrade1);
        System.out.println("Number of students in Grade 2:" + numberOfStudentsInGrade2);
        System.out.println("Number of students in Grade 3:" + numberOfStudentsInGrade3);
        System.out.println("Number of students in Grade 4:" + numberOfStudentsInGrade4);
        System.out.println("Number of students in Grade 5:" + numberOfStudentsInGrade5);
        System.out.println("Total Number of students:" + numberOfStudentsInGrade1 +numberOfStudentsInGrade2);
        // This will concatinate
        System.out.println("Total Number of students:" + totalNumberOfStudents);
        System.out.println("Number  of dates in a Year" + numberOfDaysInAYear);
        //num1.sout variable name.sout short cut
        System.out.println("Average GPA In School" + averageGRAInSchool);
    }


}

        /*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/