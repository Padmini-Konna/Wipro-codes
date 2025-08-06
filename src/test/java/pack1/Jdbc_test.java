package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://127.0.0.1:3306/aug04-2025";
		String user="root";
		String password="Padmini@2002";
		try(Connection con=DriverManager.getConnection(url,user,password))
		{
			System.out.println("Connect to DB");
			String insertsql="INSERT INTO Students(id,name,age) VALUES(?,?,?)";
			try(PreparedStatement pstmt=con.prepareStatement(insertsql))
			{
				pstmt.setInt(1, 101);
				pstmt.setString(2, "Padmini");
				pstmt.setInt(3, 25);
				int rows=pstmt.executeUpdate();
				System.out.println("inserted:" +rows);
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		
		
		String readsql="SELECT * FROM Students";
		try(Statement stmt=con.createStatement())
		{
			ResultSet rs=stmt.executeQuery(readsql);
			while(rs.next()) {
				System.out.println("id:" +rs.getInt("id"));
				System.out.println("id:" +rs.getString("name"));
				System.out.println("id:" +rs.getInt("age"));
			}
		}


		catch(SQLException e)
		{
			e.printStackTrace();
		}
		String updatesql="UPDATE Students SET name=? WHERE id=?";
		try(PreparedStatement pstmt1=con.prepareStatement(updatesql))
		{
			pstmt1.setString(1, "yodha");
			pstmt1.setInt(2, 101);
			//pstmt.setInt(3, 25);
			int rows=pstmt1.executeUpdate();
			System.out.println("Updated:" +rows);
			
		}
		

	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		String deletesql="DELETE FROM Students WHERE id=?";
		try(PreparedStatement pstmt2=con.prepareStatement(deletesql))
		{
			pstmt2.setInt(1, 101);
			//pstmt2.setString(2, "yodha");
			//pstmt.setInt(3, 25);
			int rows=pstmt2.executeUpdate();
			System.out.println("Delete:" +rows);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		}

	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}

