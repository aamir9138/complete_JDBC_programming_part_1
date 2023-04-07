import java.sql.*;
public class JdbcDemo
{
  public static void main(String [] args) throw Exception{
    Class.forName("oracle.jdbc.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from Employee");
    while(rs.next()){
      System.out.println(rs.getInt(1)+ "---"+rs.getString(2)+"---"+rs.getDouble(3))
    }
    con.close();
  }
}