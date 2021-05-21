package dev.cifo.example.programming1;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "BOOK")

public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String ISBN;
	private int pages;



	public Book() {
		super();
	}

	public Book(Long id, String title, String ISBN, int pages) {
		super();
		this.id = id;
		this.title = title;
		this.ISBN = ISBN;
		this.pages = pages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String Title) {
		this.title = Title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	

	@Override
	public String toString() {
		return "Book [title=" + title + ", ISBN=" + ISBN + ", pages=" + pages + "]";
	}

}
