import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/********************************
*************EXAMEN *********
 PROBLEMA NUMERO 21
Aian Mendoza
Bisiesto.java
This program determines if it is a leap year
********************************/
public class Bisiesto {
 InputStreamReader input = new InputStreamReader(System.in);
 BufferedReader buffer = new BufferedReader(input);
 int tmp=0;
 int num[] = new int[4];

 public static void main(String args[]){
  Bisiesto ej = new Bisiesto();
  ej.ingreso();
 }

 private void ingreso() {
  System.out.print("Enter the year: ");
  tmp = leerEntero();
  if( (tmp%400==0) &&  !(tmp%100==0) || (tmp%4==0 ) )
   System.out.print("The year is leap year");
  else
   System.out.print("The year is not leap year");
 }

 private int leerEntero() {
  try {
   tmp = Integer.parseInt( buffer.readLine() );
  } catch (NumberFormatException e) {
   System.out.print("Only numbers, enter the value again:");
   leerEntero();
  } catch (IOException e) {
   System.out.println("An error has occurred");
   return 0;
  }
  return tmp;
 }
}
