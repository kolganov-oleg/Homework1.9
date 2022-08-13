public class Homework9 {
    public static void main(String[] args) {
        Author nikitaZhukov = new Author("Никита", "Жуков");
        Book modicina = new Book("Модицина", 2021, nikitaZhukov);

        Author king = new Author("Стивен", "Кинг");
        Book kudjo = new Book("Куджо", 2000, king);

        kudjo.setPublishDate(1990);

        System.out.println(modicina.getTitle() + " " + modicina.getPublishDate() + " " + nikitaZhukov.getSurname());
        System.out.println(kudjo.getTitle() + " " + kudjo.getPublishDate() + " " + king.getSurname());
    }
}
