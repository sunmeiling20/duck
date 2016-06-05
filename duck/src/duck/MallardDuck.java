package duck;

import fly.FlyWithWings;
import quack.Quack;
//Ò°Ñ¼×Ó
public class MallardDuck extends Duck{  
  
    public MallardDuck(){  
        quackBehavior = new Quack();  
        flyBehavior = new FlyWithWings();  
    }  
      
    @Override  
    public void display() {  
        System.out.println("I'm a real Mallard duck");  
    }  
  
}  
