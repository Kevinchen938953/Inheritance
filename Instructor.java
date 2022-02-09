public class Instructor extends Person
{
   private double salary;
   public Instructor(String name, int birth, double salary);
   {
     super(name, birth);
     this.salary = salary;
   }
   public String toString()
   {
     return("The Instructor's name is:" + super.toString + "The instructor's salary is: " + salary);
}
