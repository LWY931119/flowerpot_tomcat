package datas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.google.gson.Gson;





import db.connection;


public class data {
	public String getall()
	{
		connection getConn=new connection();	
		Connection conn=getConn.getConnection();
		ArrayList<String> list = new ArrayList<String>();
		
        String gsonString = new String();
		try {
			PreparedStatement ps=conn.prepareStatement("select * from btapp_datas limit 20");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
				String s = rs.getString(2);
				System.out.println("select * from btapp_datas " + s);
				gsonString += rs.getString(2)+':'+rs.getString(3)+'+'+rs.getString(4)+"*"; 
				
			}
            //gsonString = gson.toJson(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gsonString;
	}
	public boolean addData(String name,String data,String time)
	{
		boolean b=false;
		connection getConn=new connection();
		int num = 0;
		Connection conn=getConn.getConnection();
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into btapp_datas(data,time,name) values (?,?,?)");
			ps.setString(1,data);
			ps.setString(2,time);
			ps.setString(3,name);
			num=ps.executeUpdate();
			if (num>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
		
	}
	public boolean addTem(String data,String time)
	{
		boolean b=false;
		connection getConn=new connection();
		int num = 0;
		Connection conn=getConn.getConnection();
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into btapp_tem(data,time) values (?,?)");
			ps.setString(1,data);
			ps.setString(2, time);
			num=ps.executeUpdate();
			if (num>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
		
	}
	public boolean addMoi(String data,String time)
	{
		boolean b=false;
		connection getConn=new connection();
		int num = 0;
		Connection conn=getConn.getConnection();
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into btapp_moi(data,time) values (?,?)");
			ps.setString(1,data);
			ps.setString(2, time);
			num=ps.executeUpdate();
			if (num>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
		
	}
	public boolean addCo2(String data,String time)
	{
		boolean b=false;
		connection getConn=new connection();
		int num = 0;
		Connection conn=getConn.getConnection();
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into btapp_co2(data,time) values (?,?)");
			ps.setString(1,data);
			ps.setString(2, time);
			num=ps.executeUpdate();
			if (num>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
		
	}
	public boolean addLig(String data,String time)
	{
		boolean b=false;
		connection getConn=new connection();
		int num = 0;
		Connection conn=getConn.getConnection();
		try {
			
			PreparedStatement ps=conn.prepareStatement("insert into btapp_lig(data,time) values (?,?)");
			ps.setString(1,data);
			ps.setString(2, time);
			num=ps.executeUpdate();
			if (num>0)
			{
				b=true;
			}
			else
			{
				b=false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
		
	}
}
