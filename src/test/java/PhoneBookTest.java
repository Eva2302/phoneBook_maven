import static org.junit.Assert.*;

public class PhoneBookTest {
    public PhoneBook phoneBook;

    @org.junit.Before
    public void setUp() throws Exception {
        phoneBook = new PhoneBook();
    }

    @org.junit.Test
    public void printPhoneLst() throws Exception {
        phoneBook.printPhoneLst("Сидоров");
        assertTrue("Not exists in the phoneBook", phoneBook.phne.contains("+88412222354") );
    }

    @org.junit.After
    public void tearDown() throws Exception {
        phoneBook = null;
    }

}