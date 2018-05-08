import org.testng.annotations.Test;

public class CreateGroupTest extends TestBase {

  @Test
  public void testCreateGroupLongName(){
    goToGroupsPage();
    initGroupCreation();
    fillGroupForm("name", "header", "footer");
    submitGroupCreation();
    returnToGroupsPage();
    System.out.println("First test");
  }

  @Test
  public void testCreateShortLongName(){
    goToGroupsPage();
    initGroupCreation();
    fillGroupForm("n", "h", "f");
    submitGroupCreation();
    returnToGroupsPage();
    System.out.println("Second test");
  }
  @Test
  public void testCreateGroupEmptyName(){
    goToGroupsPage();
    initGroupCreation();
    fillGroupForm("", "", "");
    submitGroupCreation();
    returnToGroupsPage();
    System.out.println("Third test");
  }


}
