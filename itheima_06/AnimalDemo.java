package itheima_06;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();

        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+"，"+a.getAge());
        a.eat();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+"，"+a.getAge());
        a.eat();
        System.out.println("---------");

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}
