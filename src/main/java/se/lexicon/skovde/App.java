package se.lexicon.skovde;

import se.lexicon.skovde.models.BankAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount test = new BankAccount(
                //666,
                999_999_999,
                "The Devil",
                "Lucifer@hell.nine",
                "0123-456789"
        );

        BankAccount normie = new BankAccount(
                500_000,
                "Uffe",
                "Nomail@no.no",
                "1234/456789"
        );
    }
}
