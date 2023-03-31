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

       System.out.println("_________Normal_________");
       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

         //       /*
         //         _________Normal_________
         //
         //         Name:Gica
         //         Age:20
         //         Grade:5
         //
         //         Name:Erich
         //         Age:20
         //         Grade:4
         //
         //         Name:Cezar
         //         Age:20
         //         Grade:10
         //
         //         Name:Dumitru
         //         Age:20
         //         Grade:2
         //
         //         Name:Viorel
         //         Age:20
         //         Grade:9
         //
         //         Name:Mihai
         //         Age:20
         //         Grade:7
         //        */

       System.out.println("_________Order by name_________");
       group.AddConsultant(new ConsultantOrderByName());
       group.ExecuteOrder(group.getStudents());
       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

         //       _________Order by name_________
         //
         //       Name:Cezar
         //       Age:20
         //       Grade:10
         //
         //       Name:Dumitru
         //       Age:20
         //       Grade:2
         //
         //       Name:Erich
         //       Age:20
         //       Grade:4
         //
         //       Name:Gica
         //       Age:20
         //       Grade:5
         //
         //       Name:Mihai
         //       Age:20
         //       Grade:7
         //
         //       Name:Viorel
         //       Age:20
         //       Grade:9

       System.out.println("_________By age_________");
       group.AddConsultant(new ConsultantOrderByAge());
       group.ExecuteOrder(group.getStudents());
       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

         //       _________By age_________
         //
         //       Name:Cezar
         //       Age:20
         //       Grade:10
         //
         //       Name:Dumitru
         //       Age:20
         //       Grade:2
         //
         //       Name:Erich
         //       Age:20
         //       Grade:4
         //
         //       Name:Gica
         //       Age:20
         //       Grade:5
         //
         //       Name:Mihai
         //       Age:20
         //       Grade:7
         //
         //       Name:Viorel
         //       Age:20
         //       Grade:9

       System.out.println("_________By grade_________");
       group.AddConsultant(new ConsultantOrderByGrade());
       group.ExecuteOrder(group.getStudents());
       group.AddConsultant(new ConsultantPrint());
       group.ExecuteOrder(group.getStudents());

      //       _________By grade_________
      //
      //       Name:Dumitru
      //       Age:20
      //       Grade:2
      //
      //       Name:Erich
      //       Age:20
      //       Grade:4
      //
      //       Name:Gica
      //       Age:20
      //       Grade:5
      //
      //       Name:Mihai
      //       Age:20
      //       Grade:7
      //
      //       Name:Viorel
      //       Age:20
      //       Grade:9
      //
      //       Name:Cezar
      //       Age:20
      //       Grade:10


    }
}