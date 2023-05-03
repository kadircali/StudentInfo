
import java.util.ArrayList;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    double noteOran;
    double sozluOran;
    static ArrayList<Teacher> teachers = new ArrayList<>();

    public Course() {
    }

    public Course(String name, String code, String prefix,double noteOran,double sozluOran) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.noteOran=noteOran;
        this.sozluOran=sozluOran;
    }

    void addTeacher(Teacher teacher) {

        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            teachers.add(teacher);
        }
        else{
            System.out.println("Öğretmen ve Ders Bölümleri Uyuşmuyor");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }

    void printAllTeachers() {
        for (Teacher teacher1 : teachers) {
            System.out.println(teacher1.name);
        }
    }
}
