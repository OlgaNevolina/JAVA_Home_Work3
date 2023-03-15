package Task3;
import Task3.model.Items;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Items book1 = new Items("Война и мир", "Толстой", 290.23, 1996, 13);
        Items book2 = new Items("Авокадо", "Тайландова", 200.99, 2020, 7);
        Items book3 = new Items("Масло", "Росси", 190.99, 1800, 1);
        Items book4 = new Items("Метафизика", "Аристотель", 54.99, -400, 100);
        Items book5 = new Items("Хлеб и зрелища", "Маркс", 45.99, 1850, 200);
        Items book6 = new Items("Айран", "Казахстан", 20.99, 2010, 23);
        Items book7 = new Items("Устрицы королевские высший свет", "Тай", 490.23, 2023, 100);
        Items book8 = new Items("Айран2", "Казакович", 20.99, 2017, 13);

        List<Items> booksList = new ArrayList<>();

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        booksList.add(book7);
        booksList.add(book8);
        System.out.println(booksList);

        StringBuilder sortedBooks = new StringBuilder();
        for (Items books : booksList) {
            if (isPrime(books.getPgNum()) && books.getAuthor().toLowerCase().contains("а")) {
                if (books.getYear() >= 2010 && books.getYear() <= 2023) {
                    sortedBooks.append(books.getName()).append("\n");
                }
            }
        }
        System.out.println(sortedBooks);
    }

    private static boolean isPrime(Integer num) {

        if (num == 1) {
            return true;
        }
        if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)) {
            return false;
        }
        for (int i = 2; i < num * num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }


}