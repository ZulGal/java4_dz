package PhoneBook;

public class BirthdaySizeIsLess extends Exception{
    public BirthdaySizeIsLess(String message) {
        super(message);
    }
    public BirthdaySizeIsLess(int size) {
        this(String.format("Количество элементов даты рождения меньше %d",size));
    }
}
