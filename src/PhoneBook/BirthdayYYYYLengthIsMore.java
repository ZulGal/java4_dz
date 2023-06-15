package PhoneBook;

public class BirthdayYYYYLengthIsMore extends Exception{
    public BirthdayYYYYLengthIsMore(String message) {
        super(message);
    }
    public BirthdayYYYYLengthIsMore(int size) {
        this(String.format("Длина года в дате рождения больше %d", size));
    }
}
