public Map<Year, List<Book>> groupByPublicationYear() {
	return  books.stream().collect(Collectors.groupingBy(book -> Year.of(book.getPublishedOn().getYear())));
}	
