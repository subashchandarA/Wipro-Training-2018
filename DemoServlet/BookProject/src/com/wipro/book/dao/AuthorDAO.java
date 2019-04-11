package com.wipro.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.book.bean.AuthorBean;
import com.wipro.book.util.DBUtil;


public class AuthorDAO {
	
	PreparedStatement pGet =null;
//	PreparedStatement pInsert=null;
	Connection con = DBUtil.getDBConnection();
	
	
	AuthorBean getAuthor(int authorCode) {
		AuthorBean author = null;
		// write code here
		
		  try {
			  
			  pGet=con.prepareStatement("select * from Author_tbl where Author_code ="+authorCode);
			  ResultSet rs = pGet.executeQuery(); 
			  if(rs.next())
	         	{ author =new AuthorBean(); 
				  author.setAuthorCode(authorCode);
				  author.setAuthorName(rs.getString(2));
				  author.setContactNo(rs.getLong(3));
				  return author;
		           
				}
		  }catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			  return null;
		}

		return author;
	}

	AuthorBean getAuthor(String authorName) {
		AuthorBean author = null;
		// write code here
		 try {
			  
			  pGet=con.prepareStatement("select * from Author_tbl where Author_name ="+authorName);
			  ResultSet rs = pGet.executeQuery(); 
			  if(rs.next())
	         	{ author =new AuthorBean(); 
	         	
				  author.setAuthorCode(rs.getInt(1));
				  author.setAuthorName(authorName);
				  author.setContactNo(rs.getLong(3));
				  
				  return author;
		           
				}
		  }catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			  return null;
		}
			
		return author;
	}
}
