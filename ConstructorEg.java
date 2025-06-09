class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;

    }
}
