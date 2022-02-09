public class Tester
{
  public static void main(String[] args)
  {
    Person p1 = new Person("Kevin", 2004);
    System.out.println(p1);
    Person p2 = new Person("Jacky", 2003);
    System.out.println(p2);
    Instructor p3 = new Instructor("Garten", 1960, 400);
    System.out.println(p3);
    Instructor p4 = new Instructor("Torline", 1990, 300);
    System.out.println(p4);
    Scholar p5 = new Scholar("Sebastian", 2004, "Mechanical Engineering");
    System.out.println(p5);
    Scholar p6 = new Scholar("Santiago", 2004, "Mechanical Engineering");
    System.out.println(p6);
  }
}
