package lab.student.control;

import lab.student.entity.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("20230001", "김민수", "컴퓨터공학", 3);
        student.printInfo();
        
        System.out.println("5학년으로 변경 ");
        student.setGrade(5); // 잘못된 학년 → 오류 메시지 출력
    }
}