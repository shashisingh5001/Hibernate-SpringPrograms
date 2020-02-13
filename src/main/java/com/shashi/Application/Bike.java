package com.shashi.Application;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vechile
{
  public void drive()
  {
	  System.out.println("Seconf Goofy");
  }
}
