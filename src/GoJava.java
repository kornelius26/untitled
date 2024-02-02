public class GoJava {
    public static void main(String[] args) {
        Human human1 = new Human("nj", 12);
     

    }

}
class Human {
    String name;
    int age;
    public Human(String name, int age){
        System.out.println("Hello");
        this.name = name;
        this.age = age;

    }

    public void setName(String name) {
        this.name = name;

    } public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println(name+", " + age);
    }
}
