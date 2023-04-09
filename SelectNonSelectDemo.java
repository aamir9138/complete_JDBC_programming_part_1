class SelectNonSelectDemo{
public static void main(String [] args) throws Exception
{
  String driver = ""



  Statement st = con.createStatement();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Query");
  String sqlQuery = sc.nextLine();
  boolean b = st.execute(sqlQuery);
  if (b==true)//select query
  {
    ResultSet rs = st.getResultSet();
    while(rs.next()){
      System.out.println(rs.getInt(1) + "\1" + rs.getString(2) + "\1" + rs.getInt() ...)
    }
  }
  else // non-select query
  {
    int rowCount = st.getUpdateCount();
    System.out.println("The number of records effected is " + rowCount)
  }
}
}