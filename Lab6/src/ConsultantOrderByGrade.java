public class ConsultantOrderByGrade implements Consultant{
    @Override
    public void ExecuteOrder(Student[] students){
        boolean sorted = false;

        while (!sorted){
            sorted = true;
            for(int i = 0 ; i < students.length -1 ; i++){
                if(students[i].compareTo(students[i+1]) > 0){
                    Student temp = new Student(students[i].clone());
                    students[i] = students[i+1].clone();
                    students[i+1] = temp.clone();

                    sorted = false;
                }
            }
        }
    }


}
