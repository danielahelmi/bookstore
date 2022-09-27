package hh.swd20.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.bookstore.domain.Book;
import hh.swd20.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book b1 = new Book("Hannibal", "Thomas Harris", 1988, "951-20-3416-6", 0);
			Book b2 = new Book("Silence of the Lambs", "Thomas Harris", 1999, "951-20-5655-0", 0);

			repository.save(b1);
			repository.save(b2);
		};
	}
}