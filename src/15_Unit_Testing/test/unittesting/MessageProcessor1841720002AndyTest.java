package unittesting;

import unittest.MessageProcessor1841720002Andy;
import org.junit.Assert;
import org.junit.Test;

public class MessageProcessor1841720002AndyTest {

    MessageProcessor1841720002Andy mProcessor;

    public MessageProcessor1841720002AndyTest() {
        mProcessor = new MessageProcessor1841720002Andy();
        mProcessor.setSenderAndy("Ronaldo");
        mProcessor.setRecipientAndy("Rafael");
        mProcessor.setMessageAndy("Whats up bro?");
    }

    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo. \nThe message as follows : "
                + "Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatAndy());
    }

}
