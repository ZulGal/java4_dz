package PhoneBook;

public class BirthdaySizeIsMore extends Exception{

    public BirthdaySizeIsMore(String message) {
        super(message);
    }
    public BirthdaySizeIsMore(int size) {
        this(String.format("Количество элементов даты рождения больше %d",size));
    }
}
