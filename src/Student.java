public class Student extends Person {
    private double score;

    public Student(double score, int age, String name) {
        super(age, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void say(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student = new Student(12,32,"xx");
        student.say();
    }
}
