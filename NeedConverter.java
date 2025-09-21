public class Converter 
{  
 public float mmtom(float mm) 
 { 
  float m=(mm/1000); 
  return m;  
 } 
 public float cmtom(float cm) 
 { 
  float m=(cm/100); 
  return m; 
 } 
 public float mtokm(float m) 
 { 
  float km=(m/1000); 
  return km; 
 } 
} 
 
import Measure.*; 
public class NeedConverter 
{ 
 public static void main(String args[]) 
 { 
  Converter c=new Converter(); 
  System.out.println(" mm to m is  "+c.mmtom(100)); 
  System.out.println(" cm to m is  "+c.cmtom(1000)); 
  System.out.println(" m to km is  "+c.mtokm(3000)); 
 } 
} 
 
 
