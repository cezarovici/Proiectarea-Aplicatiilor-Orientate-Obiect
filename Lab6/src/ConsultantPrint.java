public class ConsultantPrint implements Consultant{

    @Override
    public void ExecuteOrder(Student[] students) {
        for(Student student :students){
            System.out.println( student.toString());
        }
    }


}
