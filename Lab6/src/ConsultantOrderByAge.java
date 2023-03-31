import java.util.Arrays;
import java.util.Comparator;

public class ConsultantOrderByAge implements Consultant {
    @Override
    public void ExecuteOrder(Student[] students){
        Arrays.sort(students, Comparator.comparingInt(Student::getAge));
    }
}
