//yo chai class banako
class Pen{
    String color;  //properties
    String type;

    public void write(){   //method banako
        System.out.println("writing");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

}
}



public class OopsExample {
    public static void main(String[] args) {
        //object chai jaile main function vitra hunxa
        // Pen pen1=new Pen();
        // pen1.color="blue";   // dot le chai properties access garxa
        // pen1.type="gel";
        
        // Pen pen2=new Pen();
        // pen2.color="green";
        // pen2.type="ballpoint";

        // pen1.printColor();
        // pen2.printColor();



        Student s1= new Student();
        s1.name="isha";
        s1.age=21;
        s1.printInfo();
    }
    
}
