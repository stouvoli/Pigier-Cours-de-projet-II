	public List<String> arrange() {
		return books.stream().sorted().collect(Collectors.toList());
	}
