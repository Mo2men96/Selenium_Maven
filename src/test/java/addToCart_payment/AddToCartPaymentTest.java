package addToCart_payment;

import org.testng.annotations.Test;
import pages.AddToCart_Payment;

public class AddToCartPaymentTest {
    final AddToCart_Payment AddToCart_Test = new AddToCart_Payment();
    @Test
    public void SuccessfullPayment(){
        AddToCart_Test.AddToCart();
    }
}
