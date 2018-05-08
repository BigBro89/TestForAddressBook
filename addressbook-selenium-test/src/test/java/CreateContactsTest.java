import org.testng.annotations.Test;


public class CreateContactsTest extends TestBase {

    @Test
    public void addingContact(){
        addContact("Alex","Vasin","Russia","0987654321","123456789","a@a.com");
    }
    @Test
    public void addingContactWithoutEmail(){
        addContact("Alex","Vasin","Russia","0987654321","123456789","");
    }
    @Test
    public void addingContactWithoutPhone(){
        addContact("Alex","Vasin","Russia","","","vasya@mail.ru");
    }
}
