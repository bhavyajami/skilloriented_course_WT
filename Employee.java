import java.sql.*;
import java.util.*;
class Employee
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Driver Loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC88","IPC88");
System.out.println("Connection Success");
Scanner s=new Scanner(System.in);//read empno from user
System.out.println("Enter your employee id");
int empno=s.nextInt();
Statement sct=con.createStatement();
String sql="select *from emp where id="+empno;
ResultSet rs=sct.executeQuery(sql);
boolean result=false;
while(rs.next())//while checking
{
//check the rows line by line until all the records are completed
//verify input with empno with first column of your table
if(empno==rs.getInt(1))
{
System.out.println("You are valid user");
System.out.println("Hello  "+rs.getString(1)  +rs.getString(2)  +rs.getString(3));
result=true;
break;
}
}//while closing
if(result==false)
System.out.println("Invalid user");
}//try
catch(Exception e)
{
System.out.println(e);
}
}
}

