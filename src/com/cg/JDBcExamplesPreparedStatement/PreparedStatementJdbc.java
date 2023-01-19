package com.cg.JDBcExamplesPreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class PreparedStatementJdbc {

public static void main(String[] args) {

try {
Class.forName("org.postgresql.Driver");
Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/cgjamal", "postgres", "Jamal@143");
PreparedStatement pstmt = conn.prepareStatement("insert into Actor values(?,?);");
Scanner sc = new Scanner(System.in);
System.out.println("Enter Actor details...");
System.out.println("enter Actor ID");
int actorid = sc.nextInt();
pstmt.setInt(1, actorid);
System.out.println("enter Actor name");
sc.nextLine();
String actorname = sc.nextLine();
pstmt.setString(2, actorname);
int result = pstmt.executeUpdate();

if(result !=0 )
{
System.out.println("Data inserted successfully");

}else
{
System.out.println("Data not inserted successfully");
}
}catch (Exception e)
{
e.printStackTrace();
}
}
}