package Learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {


    private static List<Student> buildStudentsList() {

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "johan", "saputra", "CSE", 2015));
        studentList.add(new Student(2, "David", "khan", "CSE", 2011));
        studentList.add(new Student(3, "Michael", "Korus", "ECE", 2018 ));
        studentList.add(new Student(4, "Anup", "Rubens", "IT", 2019));

        return studentList;
    }

    private static List<Student> sortStudentListBYJoinYear(List<Student> studentList) {
        List<Student> sortedStudentsList = studentList.stream().sorted(Comparator.comparing(Student::getJoinedYear)).collect(Collectors.toList());
        return  sortedStudentsList;
    }

    private static void print(List<Student> studentList) {
        studentList.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Student> studentList = buildStudentsList();
         print(sortStudentListBYJoinYear(studentList));

    }
}
