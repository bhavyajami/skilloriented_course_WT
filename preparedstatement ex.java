import java.sql.*;
class Example
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC88","IPC88");
System.out.println("Established");
String sql="insert into stud values(?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setInt(1,10);
ps.setString(3,"cse");
ps.setString(2,"Bhavya");
ps.executeUpdate();
}

catch(Exception e)
{
System.out.println(e);
}
}
}