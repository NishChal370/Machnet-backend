package question2and3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private int age;
    private String name;
    private int semester;
    private String gender;

    public Student(String name, int semester, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", semester=" + semester +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Ajay", 4, 40, "male"));
        studentsList.add(new Student("Jack", 3, 30, "male"));
        studentsList.add(new Student("John", 3, 20, "male"));
        studentsList.add(new Student("Sita", 4, 20, "female"));
        studentsList.add(new Student("Summit", 3, 30, "male"));
        studentsList.add(new Student("Dharma", 3, 40, "male"));
        studentsList.add(new Student("Nischal", 2, 30, "male"));
        studentsList.add(new Student("Jenny", 4, 20, "female"));

        /*
        * Question 2
        * */
        List<String> studentsNameList = studentsList.stream()
                .map(e -> e.name)
                .collect(Collectors.toList());

        System.out.println("Names of all the students: "+studentsNameList);

        /*
         * Question 3
         * */
        List<Student> StudentsNameStartWithJ = studentsList.stream()
                .filter(e -> e.name.toLowerCase().startsWith("j") && e.semester == 3)
                .collect(Collectors.toList());

        System.out.println("Students whose name starts with (j or J) and study in the 3rd semester: \n"+StudentsNameStartWithJ);

    }
}
