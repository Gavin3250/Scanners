public abstract class Animal
{
  // instance variables - replace the example below with your own
  private String color;
  private int legs;
  private String studentName;
  private String disposition;
  private String type;
  private String sound;

  
  public Animal() //initializes instance of Animal class for variables
  {
    this("Gavin Martinez", "Brown", 4); // Default is a black animal with 4 legs
  }
  
  
  public Animal(String studentName, String color, int legs) {
    this.studentName = studentName;
    this.color = color;
    this.legs = legs;
  }
  //getting method returns values of instance variables
 
  public String getColor() {
    return this.color;
  }
  //setter method sets value of instance variable
 
  public void setColor(String color) {
    this.color = color;
  }
  //setter method sets values of variables
  
  public int getLegs() {
    return this.legs;
  }
  
 
  public void setLegs(int legs) {
    this.legs = legs;
  }
  
  
  public String getStudentName() {
    return this.studentName;
  }
  
  public String speak() {
    return "Bwaaaa";
  }
  
  
  public String getDisposition() {
    return "nonchalant";
  }
  
  
  public String getType() {
    return "Buffalo";
  }
  
  public String getName() {
    return "Bill";
  }
  
  
  public String toString() {
    StringBuffer buffer = new StringBuffer("");
    buffer.append("It is a "+this.getType()+"\n");
    buffer.append("Its name is "+this.getName()+", it is "+this.getColor()+" with "+this.getLegs()+" legs\n");
    buffer.append("Its disposition is "+this.getDisposition()+" and it says "+this.speak()+"\n");
    return buffer.toString();
  }

}