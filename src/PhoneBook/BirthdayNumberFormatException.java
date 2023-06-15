package PhoneBook;

public class BirthdayNumberFormatException extends Exception{
    public BirthdayNumberFormatException() {
        super("В дате дня рождения не цифра");
    }
}
