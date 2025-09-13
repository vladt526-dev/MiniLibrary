class Book {
    private final String title;
    private final String author;
    private final int year;
    private boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public String getTitle() { return title; }

    @Override
    public String toString() {

        return title + " (" + author + ", " + year + ")"
                + (isAvailable ? " —  доступна" : " —  видана");
    }
}
