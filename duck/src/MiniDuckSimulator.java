import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import fly.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {  
        Duck mallard = new MallardDuck();  
        mallard.performFly();  
        mallard.performQuack();  
        System.out.println("------------------");  
        Duck model = new ModelDuck();  
       // model.performFly();  
        //让不会飞的模型鸭子使用助推器 
        //model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());  
        model.performFly();  
    }  
    /** 
     * 运行结果： 
     *  I'm flying! 
        Quack 
        ------------------ 
       
        I'm flying with a rocket 
     */  
}
