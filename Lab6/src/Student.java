public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int grade;

    public Student(){}
    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this. grade = grade;
    }

    public Student(Student st) {
        this.name = st.name;
        this.age = st.age;
        this.grade =st.grade;
    }

    public Student Student (Student st){
        this.name = st.name;
        this.age = st.age;
        this.grade =st.grade;

        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "\nName:"+name+
                "\nAge:"+age+
                "\nGrade:"+grade;
    }

    @Override
    public Student clone(){
        return  new Student(this);
    }

    @Override
    public int compareTo(Student student){
        if(this.name.compareTo(student.name) != 0){
            return this.name.compareTo(student.name);
        }

        if(this.grade != student.grade){
            return this.grade - student.grade;
        }

        return this.age - student.grade;
    }
}
