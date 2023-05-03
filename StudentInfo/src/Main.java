
public class Main {

    public static void main(String[] args) {
        //1.ders ve öğretmen
        Teacher t1 = new Teacher("Murat", "05555", "TRH");
        Course tarih = new Course("Tarih", "101", "TRH",0.80,0.20);             
        tarih.addTeacher(t1);
       //  tarih.printTeacherInfo();
        
        
        //2.ders ve öğretmen
        Teacher t2 = new Teacher("Selma", "05444", "TRK");
        Course turkce = new Course("TURKCE", "102", "TRK",0.70,0.30);
        turkce.addTeacher(t2);
        //turkce.printTeacherInfo();

        
        //3.ders ve öğretmen
        Teacher t3 = new Teacher("Ayşe", "0333", "FZK");
         Course fizik = new Course("FIZIK", "103", "FZK",0.90,0.10);
        fizik.addTeacher(t3);
        
        
        
        //öğrenci nesnesi
       Student s1 = new Student(tarih, turkce, fizik, "Akın", "2689", "4");
        
       s1.addBulkExamNote(50,40, 60,80,80, 90);
      // s1.printNote();
       s1.isPass();

        // Course course = new Course();
        //   course.printAllTeachers();
    }

}
