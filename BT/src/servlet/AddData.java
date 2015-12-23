package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datas.data;



@SuppressWarnings("serial")
public class AddData extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		System.out.println("AddData is in");
		doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		String jsondata=request.getParameter("jsonstring");
		System.out.println(jsondata);
		data addData = new data();
		
		String[] datas = new String[]{};
		String tem = "Tem";
		String moi = "Moi";
		String lig = "Lig";
		String co2 = "SEN0159";
		/*List<Double> Tem = new ArrayList<Double>();  
		List<Double> Moi = new ArrayList<Double>();
		List<Double> Lig = new ArrayList<Double>();
		List<Double> Co2 = new ArrayList<Double>();*/
		 datas = jsondata.split("\\+");
         for (int i = 0; i < datas.length; i++) {
             System.out.println(datas[i]);
         }
        
        	 String[] tags = new String[]{};
        	 tags = datas[0].split(":");
        	 //System.out.println("tags 0:"+tags[0]+ " 1:"+tags[1]);
        	 if(tags[0].equals(tem))
        	 {
        		 System.out.println("Tem "+Double.valueOf(tags[1]) + "Time: "+datas[1]);
        		 //boolean b  = addData.addTem(tags[1], datas[1]);
        		 boolean b  = addData.addData(tags[0], tags[1], datas[1]);
                 if (b) 
        		{
        			out.write("t");
        		}
        		else {
        			out.write("f");
        		}
        		out.flush();
        		out.close();
        		//Tem.add(Double.valueOf(tags[1]));
        	 }
        	 else if(tags[0].equals(moi))
        	 {
        		 System.out.println("Moi "+Double.valueOf(tags[1]));
        		 //boolean b  = addData.addMoi(tags[1], datas[1]);
        		 boolean b  = addData.addData(tags[0], tags[1], datas[1]);
                 if (b) 
        		{
        			out.write("t");
        		}
        		else {
        			out.write("f");
        		}
        		out.flush();
        		out.close();
        		// Moi.add(Double.valueOf(tags[1]));
        	 }
        	 else if(tags[0].equals(lig))
        	 {
        		 System.out.println("Lig "+Double.valueOf(tags[1]));
        		 //boolean b  = addData.addLig(tags[1], datas[1]);
        		 boolean b  = addData.addData(tags[0], tags[1], datas[1]);
                 if (b) 
        		{
        			out.write("t");
        		}
        		else {
        			out.write("f");
        		}
        		out.flush();
        		out.close();
        		// Lig.add(Double.valueOf(tags[1]));
        	 }
        	 else if(tags[0].equals(co2))
        	 {
        		 System.out.println("Co2 "+Double.valueOf(tags[2]));
        		 //boolean b  = addData.addCo2(tags[2], datas[1]);
        		 boolean b  = addData.addData(tags[0], tags[2], datas[1]);
                 if (b) 
        		{
        			out.write("t");
        		}
        		else {
        			out.write("f");
        		}
        		out.flush();
        		out.close();
        	 }
        	 else
        	 {
        		 System.out.println("Nothing");
        	 }
         

         System.out.println("---------End of add--------");
		
		//boolean b= addData.addData(datas);
		
	}

}