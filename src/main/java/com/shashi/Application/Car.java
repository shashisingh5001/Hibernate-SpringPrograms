package com.shashi.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vechile
{
 @Autowired	
  private Tyre tyre;
  
  	    public Tyre getTyre() 
	    {
	       return tyre;
        }

public void setTyre(Tyre tyre)
{
	this.tyre = tyre;
}

		public void drive()
	    {
	    	System.out.println("car"+tyre);
	    }
	
}

