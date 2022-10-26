package week4;

public class Book {
	private String title;
	private int pages;
	private String writer;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Book() {
		
	}
	public Book(String title, int pages, String writer) {
		this.title = title;
		this.pages = pages;
		this.writer = writer;
	}
}

class Magazine extends Book{
	private String data;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public Magazine(String title, int pages, String writer, String data) {
		super(title, pages, writer);
		this.data = data;
	}
	
	public String toString() {
		return "책이름: "+getTitle()+"\n페이지수: "+getPages()+"\n저자: "+getWriter()+"\n발매일: "+getData();
	}
}