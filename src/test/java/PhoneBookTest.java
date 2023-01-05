import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void add() {
        PhoneBook phoneBook = new PhoneBook();
        String testName = "Test";
        String testNumber = "1234567";

        int expected = 1;

        int actual = phoneBook.add(testName, testNumber);

        assertEquals(expected, actual);
    }

    @Test
    void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();

        String testName = "Test";
        String testNumber = "1234567";
        phoneBook.add(testName, testNumber);

        String expected = testNumber;

        String actual = phoneBook.findByNumber(testName);

        assertEquals(expected, actual);
    }

    @Test
    void findByName() {
        PhoneBook phoneBook = new PhoneBook();

        String testName = "Test";
        String testNumber = "1234567";
        phoneBook.add(testName, testNumber);

        String expected = testName;

        String actual = phoneBook.findByName(testNumber);

        assertEquals(expected, actual);
    }

    @Test
    void printAllNames() {
        PhoneBook phoneBook = new PhoneBook();

        String testName1 = "Test1";
        String testNumber1 = "1234561";

        String testName2 = "Test2";
        String testNumber2 = "1234562";

        String testName3 = "Test3";
        String testNumber3 = "1234563";

        String testName4 = "Test4";
        String testNumber4 = "1234564";

        String expected = "[Test1, Test2, Test3, Test4]";

        phoneBook.add(testName2, testNumber2);
        phoneBook.add(testName4, testNumber4);
        phoneBook.add(testName1, testNumber1);
        phoneBook.add(testName3, testNumber3);

        String actual = phoneBook.printAllNames();
        assertEquals(expected, actual);
    }
}