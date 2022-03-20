package itheima_01;

import java.util.TreeSet;

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();


        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 30);
        Student s3 = new Student("diaochan", 20);
        Student s4 = new Student("yangyuhuan", 18);
        Student s5 = new Student("zhaona", 18);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
