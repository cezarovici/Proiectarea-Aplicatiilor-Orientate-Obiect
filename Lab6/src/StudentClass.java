public class StudentClass implements Consultant{
    private Student[] students;
    private Consultant consultant;
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

    }

    public void AddConsultant(Consultant consultant){
        this.consultant = consultant;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getN(){
        return nr;
    }

    @Override
    public void ExecuteOrder(Student[] students) {
        consultant.ExecuteOrder(students);
    }
}
