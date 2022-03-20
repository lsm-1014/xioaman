package itheima_02;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

        Student s1 = new Student("张兴宇", 59, 58);
        Student s2 = new Student("蒋锦涛", 69, 68);
        Student s3 = new Student("李灿", 72, 88);
        Student s4 = new Student("曾俊", 69, 58);
        Student s5 = new Student("李述满", 59, 67);

        Student s6 = new Student("赵娜", 58, 68);
        Student s7 = new Student("赵云", 58, 68);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getSum());
        }

    }
}
