import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DeleteContactsTest extends TestBase {
    @Test
    public void deleteOneContact() throws InterruptedException {
     selectContact();
     deleteContact();
     selectContact();
     deleteContact();

    }



}
