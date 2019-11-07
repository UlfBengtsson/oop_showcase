package se.lexicon.skovde;

import org.junit.Test;
import se.lexicon.skovde.models.BankAccount;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BankAccountTest
{

    @Test
    public void createBankAccountWithAccNumber()
    {
        //Arrange
        int accNumber = 666;
        String name = "The Devil";
        double balence = 999_999_999;
        String email = "Lucifer@hell.nine";
        String phone = "0123-456789";

        //Act
        BankAccount test = new BankAccount( accNumber, balence, name, email, phone);

        //Assert
        assertNotNull( test );
        assertEquals(accNumber , test.getAccountNumber());
        assertEquals(balence , test.getBalance(), 0);
        assertEquals(name , test.getCustomerName());
        assertEquals(email, test.getEmail());
        assertEquals(phone , test.getPhoneNumber());
    }

    @Test
    public void createBankAccount()
    {
        //Arrange
        String name = "The Devil";
        double balence = 999_999_999;
        String email = "Lucifer@hell.nine";
        String phone = "0123-456789";

        //Act
        BankAccount test = new BankAccount( balence, name, email, phone);

        //Assert
        assertNotNull( test );
        assertTrue ( test.getAccountNumber() > 0 );
        assertEquals(balence , test.getBalance(), 0);
        assertEquals(name , test.getCustomerName());
        assertEquals(email, test.getEmail());
        assertEquals(phone , test.getPhoneNumber());
    }

    @Test
    public void withdrawOk()
    {
        //Arrange
        String name = "The Devil";
        double balence = 999_999_999;
        double amount = 333_333_333;
        String email = "Lucifer@hell.nine";
        String phone = "0123-456789";
        BankAccount testAcc = new BankAccount( balence, name, email, phone);

        //Act
        boolean result = testAcc.withdraw(amount);

        //Assert
        assertTrue( result );
        assertTrue( testAcc.getBalance() < balence);
    }

    @Test
    public void withdrawBadAmount()
    {
        //Arrange
        String name = "The Devil";
        double balence = 333_333_333;
        double amount = 999_999_999;
        String email = "Lucifer@hell.nine";
        String phone = "0123-456789";
        BankAccount testAcc = new BankAccount( balence, name, email, phone);

        //Act
        boolean result = testAcc.withdraw(amount);

        //Assert
        assertFalse( result );
        assertTrue( testAcc.getBalance() == balence);
    }
}
