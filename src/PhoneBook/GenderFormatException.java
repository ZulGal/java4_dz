package PhoneBook;

public class GenderFormatException extends Exception{
    public GenderFormatException() {
        super("Пол должен быть f или m");
    }
}
