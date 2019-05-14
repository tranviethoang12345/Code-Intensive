public class Human {
    //thuộc tính
    String name;
    int age;
    String gender;

    //hàm tạo
    public Human() {
        name = "New Person";
        age = 20;
        gender = "male";
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //phương thức
    public void eat() {
        System.out.println(name + " eating..");
    }

    public void sleep() {
        System.out.println(name + " sleeping..");
    }
}
