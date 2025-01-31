package registration;

import org.testng.annotations.Test;
import pages.Registration;

public class RegisterTest {
    final Registration registration = new Registration();
    @Test
    public void RegistrationSuccessfully(){
        registration.Register();

    }
}
