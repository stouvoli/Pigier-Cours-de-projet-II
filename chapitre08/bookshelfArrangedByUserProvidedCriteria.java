@Test
void bookshelfArrangedByUserProvidedCriteria() {
	shelf.add(effectiveJava, codeComplete, mythicalManMonth);
	List<Book> books = shelf.arrange(Comparator.<Book>naturalOrder().reversed());
	assertEquals(asList(mythicalManMonth, effectiveJava, codeComplete), books, () -> "Books in a bookshelf are arranged in descending order of book title");
}
