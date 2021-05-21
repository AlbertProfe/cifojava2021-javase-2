package dev.cifo.example.programming1;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class BookRestController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("/allBooks")
	public Iterable<Book> findAll() {

		return bookRepository.findAll();
	}

	@GetMapping("/getBook/{id}")
	public Book findByTitle(@PathVariable Long id) {
		Optional<Book> bookByTitle = bookRepository.findById(id);

		if (bookByTitle.isPresent()) {

			return bookByTitle.get();
		}

		return null;
	}

	@PostMapping(path = "/addBook", consumes = "application/json")
	public void insertBook(@RequestBody Book book) {

		System.out.println(book);
		bookRepository.save(book);
	}

	@DeleteMapping("/deleteBook/{id}")
	public void deleteBook(@PathVariable Long id) {

		bookRepository.deleteById(id);

	}

	@PutMapping("/updateBook/{title}")
	public void upadateBook(@RequestBody Book book, @PathVariable Long id) {

		Optional<Book> bookByTitle = bookRepository.findById(id);

		if (bookByTitle.isPresent()) {

			bookByTitle.get().setPages(book.getPages());
			bookByTitle.get().setISBN(book.getISBN());

			bookRepository.save(bookByTitle.get());

		}

	}

}