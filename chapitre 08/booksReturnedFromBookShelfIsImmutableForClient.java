@Test
void booksReturnedFromBookShelfIsImmutableForClient() {
	BookShelf shelf = new BookShelf();
	shelf.add("Effective Java", "Code Complete");
	List<String> books = shelf.books();
	try {
		books.add("The Mythical Man-Month");
		fail(() -> "Should not be able to add book to books");
	} catch (Exception e) {
		assertTrue(e instanceof UnsupportedOperationException, () -> "Should throw UnsupportedOperationException.");
	}
}
