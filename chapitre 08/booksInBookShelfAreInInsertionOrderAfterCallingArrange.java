@Test
void booksInBookShelfAreInInsertionOrderAfterCallingArrange() {
	shelf.add("Effective Java", "Code Complete", "The Mythical Man-Month");
	shelf.arrange();
	List<String> books = shelf.books();
	assertEquals(Arrays.asList("Effective Java", "Code Complete", "The Mythical Man-Month"), books, () -> "Books in bookshelf are in insertion order");
}
