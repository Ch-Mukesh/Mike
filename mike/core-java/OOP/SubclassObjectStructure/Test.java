class Person{
    String pName = "mike";
}

class Student extends Person {
    int sNo = 90;
}


public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        Person p1 = new Student();
        Object o1 = new Student();

        System.out.println(s1.pName);
        System.out.println(s1.sNo);
        System.out.println(p1.pName);
        //Not possible 
        // - Because p1 only points to Person class memory  in the Student Object
        // - o1 only point Object class Memory in Student Object
        //So that we cant access Person class fields  with o1
        //So that we cant access Student class fields  with p1

        // System.out.println(p1.sNo);
        // System.out.println(o1.pName);
        // System.out.println(o1.sNo);


        //If you want access use type casting or DownCasting

        Person p2 = new Student();
        //Still Error
        // System.out.println(p2.sNo); 
        // even Student object is created but variable type is still Person
        //so it can just access Person class Memory in Student Object
        //So we need to type cast
        Student s2 = (Student) p2;
        System.out.println(s2.sNo);
        System.out.println(s2.pName);
        
    }
}