package PhoneBook;

public class BirthdayMMLengthIsMore extends Exception{
    public BirthdayMMLengthIsMore(String message) {
        super(message);
    }
    public BirthdayMMLengthIsMore(int size) {
        this(String.format("Длина месяца в дате рождения больше %d", size));
    }
}
