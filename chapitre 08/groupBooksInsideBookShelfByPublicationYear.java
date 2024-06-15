@Test
@DisplayName("books inside bookshelf are grouped by publication year")
void groupBooksInsideBookShelfByPublicationYear() {
	shelf.add(effectiveJava, codeComplete, mythicalManMonth, cleanCode);
	Map<Year, List<Book>> booksByPublicationYear = shelf.groupByPublicationYear();
	assertThat(booksByPublicationYear).containsKey(Year.of(2008)).containsValues(Arrays.asList(effectiveJava, cleanCode));
	assertThat(booksByPublicationYear).containsKey(Year.of(2004)).containsValues(Collections.singletonList(codeComplete));
	assertThat(booksByPublicationYear).containsKey(Year.of(1975)).containsValues(Collections.singletonList(mythicalManMonth));
}
