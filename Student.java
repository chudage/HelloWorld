public class Student{
  private int sid;
  private String name;
  
  public int getSid() {
   return this.sid;
  }
  public void setSid(int sid) {
    this.sid = sid;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  public static void main(String[] args) {
    System.out.println("This is a new student");
  }
}
