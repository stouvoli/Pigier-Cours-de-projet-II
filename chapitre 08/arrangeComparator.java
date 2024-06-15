	public List<Book> arrange() {
		return books.stream().sorted().collect(Collectors.toList());
	}

	public List<Book> arrange(Comparator<Book> criteria) {
		return books.stream().sorted(criteria).collect(Collectors.toList());
	}
