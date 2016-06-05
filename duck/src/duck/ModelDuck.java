package duck;

import fly.FlyNoWay;
import quack.Quack;

//ģ��Ѽ
public class ModelDuck extends Duck{  
  
    public void ModelDuck(){  
        quackBehavior = new Quack();  
        flyBehavior = new FlyNoWay();  
    }  
      
    @Override  
    public void display() {  
        System.out.println("I'm a model duck");  
    }  
  
}  
