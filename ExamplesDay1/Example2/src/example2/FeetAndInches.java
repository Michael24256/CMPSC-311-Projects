/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example2;

/**
 *
 * @author Jean Mehta
 */
public class FeetAndInches {
 
 private int feet;
  private int inches;
  public FeetAndInches ()
  { feet=0;
    inches=0;}
  public FeetAndInches (int newf, int newi)
  { feet=newf;
    inches=newi;}
   public void setFeet(int newf)
  {feet = newf;}
   public void setInches(int newi)
  { inches = newi;}
   
   public  int compareTo(FeetAndInches c)
   {int thisInches, inches;
     thisInches = this.feet*12 + this.inches;
     inches = c.feet*12 + c.inches;
     if (thisInches < inches)return -1;
     else if (thisInches>inches) return 1;
     else return 0;  
   }
   public String toString()
   { return this.feet + " feet and " + this.inches + " inches";
   }
}//end FeetAndInches class


