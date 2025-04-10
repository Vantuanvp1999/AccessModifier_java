//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Student.change();

      Student s1 = new Student("Hoang", 111);
      Student s2 = new Student("Khanh", 222);
      Student s3 = new Student("Nam", 333);

      s1.display();
      s2.display();
      s3.display();
    }
}