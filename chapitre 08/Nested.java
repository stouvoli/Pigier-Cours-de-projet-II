@Nested
@DisplayName("Est vide")
class IsEmpty {
	@Test
	@DisplayName("Quand aucun livre n'y est ajouté")
	public void emptyBookShelfWhenNoBookAdded() {
		List<Book> books = shelf.books();
		assertTrue(books.isEmpty(), () -> "BookShelf devrait être vide.");
	}
	@Test
	@DisplayName("Quand add est appelé sans livres")
	void emptyBookShelfWhenAddIsCalledWithoutBooks() {
		shelf.add();
		List<Book> books = shelf.books();
		assertTrue(books.isEmpty(), () -> "BookShelf devrait être vide.");
	}
}

@Nested
@DisplayName("Après avoir ajouté des livres")
class BooksAreAdded {
	@Test
	@DisplayName("Contient deux livres")
	void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
		// Test case removed for brevity
	}
	@Test
	@DisplayName("Renvoie au client une collection de livres immuable ")
	void bookshelfIsImmutableForClient() {
		// Test case removed for brevity
	}
}
