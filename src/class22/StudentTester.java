package class22;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new SyntaxStudent();
        SyntaxStudent st=(SyntaxStudent) student;
        st.teach();
        st.sleep();

       Student[] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
       student.read();
        student.relax();
        student.walk();


    }
}
