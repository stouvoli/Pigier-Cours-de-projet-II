    @Test
    void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
    	BookShelf shelf = new BookShelf();
    	shelf.add("Effective Java");
    	shelf.add("Code Complete");
    	List<String> books = shelf.books();
    	assertEquals(2, books.size(), () -> "BookShelf should have two books.");
    }
