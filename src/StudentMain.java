public class StudentMain {
    public static void main(String[] args) {
        testStudent student1 = new testStudent();
        student1.setName("James");
        student1.setClasses("N02");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
    }
}
