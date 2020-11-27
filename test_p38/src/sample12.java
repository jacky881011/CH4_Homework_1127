public class sample12 {
    public static void main(String[] args){
        iVerhicle[] ivc=new iVerhicle[2];
        ivc[0]=new Car(1234,20.5);
        ivc[1]=new Plane(232);
        for(int i=0;i<ivc.length;i++){
            ivc[i].show();
        }
    }
}
interface iVerhicle{
    int weight=1000;
    void show();
}
class Car implements iVerhicle{
    protected int num;
    protected double gas;
    public Car(int n,double g){
        num=n;
        gas=g;
        System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
    }
    public void show(){
        System.out.print("車號是"+num);
        System.out.print("汽油量是"+gas);
    }
}
class Plane implements iVerhicle{
    private int flight;
    public  Plane(int f){
        flight =f;
        System.out.println("生產了"+flight+"班次的飛機");
    }
    public void show(){
        System.out.println("飛機的班次是"+flight);
    }
}
