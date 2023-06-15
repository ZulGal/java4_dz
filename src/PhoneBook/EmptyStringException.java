package PhoneBook;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Пустая строка");
    }
}

