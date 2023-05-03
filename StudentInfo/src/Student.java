
public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    //boolean isPass;

    public Student(Course c1, Course c2, Course c3, String name, String stuNo, String classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0.0;
        //this.isPass = false;

    }

    void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (sozlu1 >= 0 && sozlu1 <= 100) {
            c1.sozlu = sozlu1;
        }

        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100) {
            c2.sozlu = sozlu2;
        }

        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100) {
            c3.sozlu = sozlu3;
        }
    }

    void printNote() {
        System.out.println(c1.name + " Notu: " + c1.note);
        System.out.println(c2.name + " Notu: " + c2.note);
        System.out.println(c3.name + " Notu: " + c3.note);
    }

    void isPass() {
        this.avarage = ((c1.note*c1.noteOran+c1.sozlu*c1.sozluOran) + (c2.note*c2.noteOran+c2.sozlu*c2.sozluOran)+ (c3.note*c3.noteOran+c3.sozlu*c3.sozluOran)) / 3;
        if (this.avarage >= 55) {
            System.out.println("Geçti");
            System.out.println("Ortalama:" + this.avarage);
        } else {
            System.out.println("Geçemedi");
            System.out.println("Ortalama:" + this.avarage);
        }
    }

}
