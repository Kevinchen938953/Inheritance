public class Scholar extends Person
{
  private String major;
  public Scholar(String name, int birth, String major)
  {
    super(name, birth);
    this.major = major;
  }

  public String toString()
  {
    return("The Scholar's name is: " + super.toString());
  }


}
