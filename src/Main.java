//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Person person = new Person(26,"奥巴巴");
        System.out.printf("姓名：%s 年龄：%d\n",person.getName(),person.getAge());
        person.setAge(18);
        person.setName("嘻嘻");
        System.out.printf("姓名：%s 年龄：%d\n",person.getName(),person.getAge());

        Student student  = new Student(100,26,"奥巴巴");
        System.out.printf("姓名：%s 年龄：%d 分数：%.2f\n",student.getName(),student.getAge(),student.getScore());
        student.setAge(18);
        student.setName("嘻嘻");
        student.setScore(0);
        System.out.printf("姓名：%s 年龄：%d 分数：%.2f\n",student.getName(),student.getAge(),student.getScore());

    }
}