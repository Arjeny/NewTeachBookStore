package com.newtech.vo;

/**
 * book µÃÂ¿‡
 * @author Mr.J
 *
 */
public class BookBean {

	private int book_id;
	private String book_name;
	private String book_author;
	private byte book_sort_id;
	private String book_publisher;
	private short book_price;
	private String book_isbn;
	private String book_description;
	private String book_img;
	
	private int number = 1;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public byte getBook_sort_id() {
		return book_sort_id;
	}
	public void setBook_sort_id(byte book_sort_id) {
		this.book_sort_id = book_sort_id;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public short getBook_price() {
		return book_price;
	}
	public void setBook_price(short book_price) {
		this.book_price = book_price;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public String getBook_description() {
		return book_description;
	}
	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
}
