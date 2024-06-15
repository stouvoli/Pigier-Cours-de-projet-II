    @Test
    public void emptyBookShelfWhenAddIsCalledWithoutBooks() {
    	BookShelf shelf = new BookShelf();
    	shelf.add();
    	List<String> books = shelf.books();
    	assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
    }
