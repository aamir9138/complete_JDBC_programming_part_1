class Student{
  static{
    System.out.println("This is the static block of Student Class");
  }
}

class Test{
  public static void main(String [] args) throws Exception{
    Class.forName("Student");
  }
}