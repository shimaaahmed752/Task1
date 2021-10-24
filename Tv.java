/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;
import java.util.Scanner;


/**
 *
 * @author Shimaa Ahmed
 */
public class Tv {
  public int channel;
  public  int vulomeLevel;
  public boolean on=true;
  
  
  public Tv()
  {
      
  }
  
  public void turnOn()
  {
      if(on==true)
          System.out.println("tv is on ");
      else
          System.out.println("tv is off");
  }
  public void turnOff()
  {
      if(on!=true)
          System.out.println("tv is off");
  }

  public void setChannel(int newChannel)
  {
   channel=newChannel;  
   System.out.println("the channel is" +"------->"+channel);
  }
  public void setVolume(int newVol)
  {
      vulomeLevel=newVol;
      System.out.println("the vulomelevel" +"------->"+vulomeLevel);
  }
  public void channelUp()
  {
      channel++;
      System.out.println("the channelup" +"------->"+channel);
  }
  public void channelDown()
  {
      channel--;
      System.out.println("the channelDown" +"------->" +channel);
  }
  public void volumeUP()
  {
      vulomeLevel++;
      System.out.println("the volumeup" +"------->"+vulomeLevel);
  }
   public void volumeDown()
  {
      vulomeLevel--;
      System.out.println("the volumeDown" +"------->"+vulomeLevel);
  }
  
  
    public static void main(String[] args) {
        Tv t=new Tv();
        t.turnOn();
        t.turnOff();
        t.setChannel(15);
        t.setVolume(5);
        t.channelUp();
        t.channelDown();
        t.volumeUP();
        t.volumeDown();
    }
    
}
