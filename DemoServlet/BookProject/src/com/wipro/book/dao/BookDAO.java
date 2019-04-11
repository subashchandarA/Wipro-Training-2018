package com.wipro.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.book.bean.AuthorBean;
import com.wipro.book.bean.BookBean;
import com.wipro.book.util.DBUtil;

public class BookDAO {
	PreparedStatement pInsert = null;
	PreparedStatement pGet = null;
	Connection con = DBUtil.getDBConnection();
	
	public int createBook(BookBean bookBean) {
		int count = 0;
		
		 try {
			  pGet=con.prepareStatement("insert into Book_tbl values(?,?,?,?,?)");
			  pGet.setString(1, bookBean.getIsbn());
			  pGet.setString(2, bookBean.getBookName());
			  pGet.setString(3,String.valueOf(bookBean.getBookType()));
			  pGet.setInt(4, bookBean.getAuthor().getAuthorCode());
			  pGet.setDouble(5, bookBean.getCost());

			  count =pGet.executeUpdate(); 
			  if(count==1)
	         	{			  
				  return count;
		         }
			  else
			    { return count; }
			  
		  }catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			  return count;
		    }
		 
	}
		
	public BookBean fetchBook(String isbn) {
		BookBean mybean = null;
		// write code here
	
		
		
			try {
							
				//pGet =con.prepareStatement("select * from Book_tbl where isbn='"+isbn+"'");
				pGet =con.prepareStatement("select * from Book_tbl where isbn= ?");
				pGet.setString(1,isbn);
				
				ResultSet rs = pGet.executeQuery();
								
			    if(rs.next()){
			    	mybean =new BookBean();
			    	mybean.setIsbn(rs.getString(1));
			    	mybean.setBookName(rs.getString(2));
			    	mybean.setBookType(rs.getString(3).charAt(0));
			    	
			    	int authcode = rs.getInt(4);
			    	AuthorDAO auDao= new AuthorDAO();
			    	AuthorBean temp =auDao.getAuthor(authcode) ;
			    	
			    	mybean.setAuthor(temp);
			    	
			    	mybean.setCost(rs.getFloat(5));
			    	
			    	return mybean;
			    }
				
					
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return mybean;
			}
			
				
		return mybean;
	}

}
