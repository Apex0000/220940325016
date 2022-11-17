/* 
class GrandParent{
String grandFatherName;
String grandMotherName;
public GrandParent(String gfn, String gmn){
    grandFatherName=gfn;
    grandMotherName=gmn;
    System.out.println("Grandather's name is- "+grandFatherName+" and grandmother's name is- "+grandMotherName);
}
}*/

class Parent extends GrandParent{
    String fatherName;
    String motherName;
    Child c;
    public Parent(String fn,String mn,String gfn,String gmn){
        fatherName=fn;
        motherName=mn;
        System.out.println("Faher's name is- "+fatherName+" and mother's name is- "+motherName);
        c.Parent(gfn,gmn);
    }
    public Parent(String gfn, String gmn){
        c.GrandParent(gfn,gmn);
    }
}
/* 
class Child extends Parent{
    String Name;
    public Child(String name,String fn, String mn,String gfn,String gmn){
        Name=name;
        System.out.println("Child's name is- "+Name);
        this.parent(fn,mn,gfn,gmn);
    }
    public static void main(String args[]){
        Child a=new Child("Raju","Rajendra","Rajeshri","Rajan","Rajni");
    }
}   */