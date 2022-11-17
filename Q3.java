class shape{
    public void Draw(){
    System.out.println("A shape drawn");
 }
public void erase(){
    System.out.println("The shape erased");
}}


 class triangle extends shape{
public void Draw(){
    System.out.println("A triangle drawn");
}
public void erase(){
    System.out.println("The triangle erased");
}}

class circle extends shape{
    public void Draw(){
        System.out.println("A circle drawn");
    }
    public void erase(){
        System.out.println("The circle erased");
    }}

 
 
class square extends shape{
    public void Draw(){
        System.out.println("A square drawn");
    }
    public void erase(){
        System.out.println("The square erased");
    }}


class work{
    public static void main(String args[]){
        shape a=new shape();
        shape b=new triangle();
        shape c= new circle();
        shape d=new square();
        a.Draw();
        b.Draw();
        c.Draw();
        d.Draw();
        a.erase();
        b.erase();
        c.erase();
        d.erase();
    }
}