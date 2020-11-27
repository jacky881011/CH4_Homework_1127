public class sample4 {
    public static void main(String[] args){
        RacingCar rcc1=new RacingCar();
        rcc1.newShow();
    }
}
class Car{
    protected int num;
    protected double gas;
    public Car(){
        num=0;
        gas=0.0;
        System.out.println("生產了車子");
    }
    public void setCar(int n,double g){
        num=n;
        gas=g;
        System.out.println("將車號設為"+num+"汽油量設為"+gas);
    }
    public void show(){
        System.out.print("車號是"+num);
        System.out.print("汽油量是"+gas);
    }

}
class RacingCar extends Car{
    private int course;
    public RacingCar(){
        course=0;
        System.out.println("生產了賽車");
    }
    public void setCourse(int c){
        course=c;
        System.out.println("將賽車編號設為"+course);
    }
    public void newShow(){
        System.out.println("賽車車號是"+num);
        System.out.println("汽油量是"+gas);
        System.out.println("賽車編號是"+course);
    }
}
