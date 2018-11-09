public class Puppy {
    int puppyAge;
    public Puppy(String name){
        //构造器，必须与类同名，可有多个
        System.out.println("Passed name is :" + name);
    }

    public void setAge(int age){
        //方法
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }


    public static void main(String[] args){
        //创建对象
        Puppy myPuppy = new Puppy("Oscar");
        //设置puppyAge的值
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}
