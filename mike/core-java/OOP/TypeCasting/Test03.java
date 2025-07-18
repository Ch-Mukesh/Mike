class  Person{

}

class Faculty extends Person{

}

class Student extends Person{

}

class DegreeStudent extends Student{

}

class Tiger{

}

public class Test03 {
        public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Student();
            Person p3 = new Faculty();
            Person p4 = new DegreeStudent();
            //Person p5 = new Tiger(); // CE 


            //Student s1 = new Person();  // CE : incompatible types
            Student s2 = new Student();
            //Student s3 = new Faculty();
            Student s4 = new DegreeStudent();
           
            Object o1 = new Object();
            System.out.println(o1);

            Object o2 = new Person();
            Object o3 = new Student();
            Object o4 = new DegreeStudent();
            Object o5 = new Faculty();

            //Person p2 = new Student();
            //Student s1 = p2; // CE : incompatible types
            Student sx =(Student)p2;
            Person px = p2;
            //Faculty fx = (Faculty) p2; // RE:java.lang.ClassCastException
            //DegreeStudent dx = (DegreeStudent) p2; // RE:java.lang.ClassCastException

            Student sy = (DegreeStudent) p4;
            // p4 -> Type Person
            // -> Contains DegreeStudent Object
            // -> is Person is child of DegreeStudent == No
            // -> is DegreeStudent is child of Person == Yes
            // -> So no CE

            // ->NOw checking P4 had DegreeStudent obj
            // -> DegreeStudent == castOPerater DegreeStudent
            //So No CE

        }
}
