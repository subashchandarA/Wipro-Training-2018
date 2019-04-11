package com.wipro.book.service;

import com.wipro.book.bean.BookBean;
import com.wipro.book.dao.BookDAO;

public class Administrator {
	public String addBook(BookBean bookBean) {
		// write code here
		
		if(bookBean==null)
			 return "INVALID";
		if(bookBean.getBookName()==null)
			 return "INVALID";
		if(bookBean.getIsbn()==null)
			return "INVALID";
		//if(Character.isSpaceChar(bookBean.getBookType()))
			//return "INVALID";
		if(bookBean.getBookType()==' ')
			return "INVALID";
		if((bookBean.getBookType()=='G') || (bookBean.getBookType()=='T'))
		{
			;
		}else
		{			return "INVALID";
		}
		
		
		if(bookBean.getCost()==0)
			return "INVALID";
      //  if(bookBean.getAuthor().getAuthorName().isEmpty())
        	//return "INVALID";
        if(bookBean.getAuthor().getAuthorName().equals(null))
        	return "INVALID";
        
		BookDAO bDao =new BookDAO();
		
		int res = bDao.createBook(bookBean);
		if(res==1)
			return "SUCCESS";
		else
			return "FAILURE";
		
	}

	public BookBean viewBook(String isbn) {
	
		// write code here
		/*if(isbn == null)
		return null;*/
		
		BookDAO bDao =new BookDAO();
		BookBean bookBean = bDao.fetchBook(isbn);
		return bookBean;
		

		
	}

}
