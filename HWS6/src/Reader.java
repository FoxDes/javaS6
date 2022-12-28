//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//1. ФИО,
//2. номер читательского билета,
//3. факультет,
//4. дата рождения,
//5. телефон.
//6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//7. Разработать программу, в которой создается массив объектов данного класса.
//8. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг.
//      Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг.
//      Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество (Тип... parameterName)
//      объектов класса Book (создать новый класс, содержащий имя и автора книги).
//      Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//9. Аналогичным образом перегрузить метод returnBook().
//      Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".

import java.awt.print.Book;
import java.lang.reflect.Array;

public class Reader {
    String name;
    String readTicket;
    String faculty;
    String dateOfBirth;
    String numberPhone;
    String book;
    String authors;

    public Reader(String name, String readTicket, String faculty, String dateOfBirth, String numberPhone, String book) {
        this.name = name;
        this.readTicket = readTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.numberPhone = numberPhone;
        this.book = book;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", readTicket='" + readTicket + '\'' +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", book='" + book + '\'' +
                ", authors='" + authors + '\'' +
                '}';
    }

    public void takeBook(String name) {
        System.out.println(name + " взял 3 книги");
    }

    public void returnBook(String name) {
        System.out.println(name + " вернул 3 книги");
    }

    public void takeBook() {
        System.out.println(name + " взял книги: " + book);
    }

    public void returnBook() {
        System.out.println(name + " вернул книги: " + book);
    }

    public void setBook(String... parameterName) {
        for (String book : parameterName) {
            System.out.println("Книги: " + book);
        }
    }

    public void setAuthors(String... parameterName) {
        for (String authors : parameterName) {
            System.out.println("Авторы: " + authors);
        }
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("Petrov P.P.", "112", "Grifendor", "12.12.2005", "9193384345", "Приключения, Словарь, Энциклопедия");
        Reader reader2 = new Reader("Ivanov I.I.", "171", "Sliserin", "04.05.2002", "9879898900", "Приключения, Словарь, Энциклопедия");
        Reader reader3 = new Reader("Gavrilov G.G.", "324", "Pufinduy", "13.12.2000", "9173434562", "Приключения, Словарь, Энциклопедия");
        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(reader3);
        reader1.takeBook("Petrov P.P.");
        reader1.returnBook("Petrov P.P.");
        reader2.takeBook();
        reader2.returnBook();
        reader3.setBook("Приключения, Словарь, Энциклопедия");
        reader3.setAuthors("Август Грин, Грибоедов С.А., Вассерман Г.Л.");
    }
}