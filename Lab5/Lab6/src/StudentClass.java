public class StudentClass implements ConsultantPrint,ConsultantSort{
    private Student[] students;
    private int nr;
    private final int N = 10;

    public StudentClass(){
        nr = 0;
    }
    public StudentClass(int n){
        nr = 0;
        students = new Student[n];
    }

    public void Add(Student s){
        if(nr+1 < N){
            students[nr] = s;

            nr++;
        }
    }

    public void Print(){
        for(int i = 0 ; i < nr ; i++){
            System.out.println(students[i].toString());
        }
    }

    public void Sort(){
        boolean sorted = false;

        while (!sorted){
            sorted = true;
            for(int i = 0 ; i < nr -1 ; i++){
                if(students[i].compareTo(students[i+1]) > 0){
                    Student temp = new Student(students[i].clone());
                    students[i] = students[i+1].clone();
                    students[i+1] = temp.clone();

                    sorted = false;
                }
            }
        }
    }

    public void AddConsultant(Consultant consultant){

    }

    public void ExecuteOrder(){

    }



    public int getN(){
        return nr;
    }
}
