public class Scholar extends Person
{
  private String major;
  public Scholar(String name, int birth, String major)
  {
    super(name, birth);//Anything that is related to the super class
    this.major = major;
  }

  public String toString()
  {
    return("The Scholar's name is: " + super.toString() + "The major is " + major); //You can also get scholar name by typing super.name and super.birth
  }


}
