package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("20230001", "��μ�", "��ǻ�Ͱ���", 3);
        student.printInfo();
        
        System.out.println("5�г����� ���� ");
        student.setGrade(5); // �߸��� �г� �� ���� �޽��� ���
    }
}