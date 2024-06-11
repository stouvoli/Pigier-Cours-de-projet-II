   @Test
    void bookshelfArrangedByBookTitle() {
    	shelf.add("Effective Java", "Code Complete","The Mythical Man-Month" );
    	List<String> books = shelf.arrange();
    	assertEquals(Arrays.asList("Code Complete", "Effective Java", "The Mythical Man-Month"), books, () -> "Books in a bookshelf should be arranged lexicographically by book title");
    }
