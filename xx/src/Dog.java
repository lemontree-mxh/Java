public class Dog {
    String breed;
    int age;
    String color;

    void barking(){
    }

    void hungry(){
    }

    void sleeping(){
    }

    public Dog(){
    }

    public Dog(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("Passed Name is : " + name);
    }

    public static void main(String []args){
        // 下面的语句将创建一个Puppy对象
        Dog myDog = new Dog("Tommy");
    }
}
