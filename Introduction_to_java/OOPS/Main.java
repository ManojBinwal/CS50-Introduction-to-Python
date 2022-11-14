package Introduction_to_java.OOPS;

public class Main {
  public static void main(String[] args) {

    // Circle circle = new Circle();
    // circle.setRadius(7);
    // System.out.println(circle.getRadius());

    // Student student = new Student();
    // student.setEng(45);
    // student.setMth(43);
    // student.setSci(44);

    // System.out.println(student.getEng());
    // System.out.println(student.getMth());
    // System.out.println(student.getSci());
    // System.out.println(student.avgMarks());
    // System.out.println(student.total());

    // Rectangle rectangle = new Rectangle(20, 10);
    // System.out.println(rectangle.area());

    Subjects subject = new Subjects("1111", "Maths", 89);
    subject.qualified();
    System.out.println(subject.getMaxMarks());
  }

}
