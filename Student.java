class Details{
    String name;
    int age;
    double cgpa;

    Details(){
        this.name="Unknown";
        this.age=0;
        this.cgpa=0.0;
    }

    Details(String name,int age){
        this.name=name;
        this.age=age;
    }

    Details(String name,int age,double cgpa){
        this.name=name;
        this.age=age;
        this.cgpa=cgpa;
    }
}

public class Student{
    public static void main(String[] args) {
        
        Details d=new Details();
        Details d1=new Details("Ananya",20);
        Details d2=new Details("Ananya",20,9.8);

        System.out.println("Default Constructor :"+d.name);
        System.out.println("Default Constructor :"+d.age);
        System.out.println("Default Constructor :"+d.cgpa);

        System.out.println("Constructor 1:"+d1.name);
        System.out.println("Constructor 1:"+d1.age);


        System.out.println("Constructor 2:"+d2.name);
        System.out.println("Constructor 2:"+d2.age);
        System.out.println("Constructor 2:"+d2.cgpa);
        
    }
}
