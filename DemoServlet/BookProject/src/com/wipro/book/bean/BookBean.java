package com.wipro.book.bean;

public class BookBean {
	String isbn;
	String bookName;
	AuthorBean author;
	char bookType;
	float cost;

	public char getBookType() {
		return bookType;
	}

	public void setBookType(char bookType) {
		this.bookType = bookType;
	}

	/*
	 * public String getCategory() { return category; } public void
	 * setCategory(String category) { this.category = category; }
	 */
	public AuthorBean getAuthor() {
		return author;
	}

	public void setAuthor(AuthorBean author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
