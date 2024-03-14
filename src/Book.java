public class Book extends Item{
    public String author;
    public int numberOfPages;
    public String genre;

    public Book(java.lang.String name, java.lang.String description, java.lang.String ID, float price, java.lang.String author, int numberOfPages, java.lang.String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    @Override
    public void showInfo(){
        System.out.println("Ten sach: "+name);
        System.out.println("Mo ta" + getDescription());
        System.out.println("ID: "+ID);
        System.out.println("Gia: "+price);
        System.out.println("Tac gia" + author);
        System.out.println("So trang: "+numberOfPages);
        System.out.println("The loai: "+genre);
    }
}
