import java.util.Arrays;
import java.util.Comparator;

public class ConsultantOrderByName implements Consultant{
    @Override
    public void ExecuteOrder(Student[] students){
        Arrays.sort(students, Comparator.comparing(Student::getName));
    }


}
