import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       StudentClass group = new StudentClass(6);

       group.Add(new Student("Gica",20,5));
       group.Add(new Student("Erich",20,4));
       group.Add(new Student("Cezar",20,10));
       group.Add(new Student("Dumitru",20,2));
       group.Add(new Student("Viorel",20,9));
       group.Add(new Student("Mihai",20,7));


       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

       group.AddConsultant(new ConsultantOrderByName());
       group.ExecuteOrder(group.getStudents());
       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

       group.AddConsultant(new ConsultantOrderByAge());
       group.ExecuteOrder(group.getStudents());
       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

       group.AddConsultant(new ConsultantOrderByGrade());
       group.ExecuteOrder(group.getStudents());
       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

    }
}