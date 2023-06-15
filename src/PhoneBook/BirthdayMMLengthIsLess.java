package PhoneBook;

public class BirthdayMMLengthIsLess extends Exception{
    public BirthdayMMLengthIsLess(String message) {
        super(message);
    }
    public BirthdayMMLengthIsLess(int size) {
        this(String.format("Длина месяца в дате рождения меньше %d", size));
    }
}
