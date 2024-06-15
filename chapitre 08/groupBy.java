	public <K> Map<K, List<Book>> groupBy(Function<Book, K> fx) {
		return books.stream().collect(Collectors.groupingBy(fx));
	}
