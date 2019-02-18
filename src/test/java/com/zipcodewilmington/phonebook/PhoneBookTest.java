package com.zipcodewilmington.phonebook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    PhoneBook test;
    String givenName;
    String givenPhone;

    @Before
    public void trial() {
        test = new PhoneBook();
        givenName = "Rob Smith";
        givenPhone = "4012568753";

    }

//TODO testAdd(String name, String phoneNumber)
//adds an entry to the composite associate data type
    @Test
    public void testAddingRecord(){
    //Given
        test.add(givenName,givenPhone);

    //When
    ArrayList<String> retrieve = test.get(givenName);
    String phoneNumber = retrieve.get(0);


    //Then
    Assert.assertEquals(givenPhone, phoneNumber);

}
//TODO testRemove(String name)
//removes an entry to the composite associate data type
    @Test
    public void testRemove(){
    //Given
    test.add(givenName,givenPhone);

    //When
        test.remove(givenName);
        ArrayList<String > retrieve = test.get(givenName);

        //Then
        Assert.assertNull(retrieve);

    }

//TODO testLookup(String name)
//returns a phone number for the respective input name
    @Test
    public void testLookup(){
    //Given
    test.add(givenName,givenPhone);

    //When
    ArrayList<String> retrieve = test.get(givenName);
    String phoneNumber = retrieve.get(0);

    //Then
    Assert.assertEquals(givenPhone,phoneNumber);

}

//TODO testReverseLookup(String phoneNumber)
//returns a name for the respective input phoneNumber
@Test
    public void testReverseLookup() {
    //Given
    test.add(givenName,givenPhone);


    //When
    String retrieve = test.reverseLookup(givenPhone);


    //Then
    Assert.assertEquals(givenName, retrieve);

}
//TODO testDisplay()


    @Test
    public void testAddingSecondNumber() {
        //Given
        String num2 = "432957359272";
        test.add(givenName,givenPhone);
        test.add(givenName, num2);

        //When
        ArrayList<String> retrieve = test.get(givenName);
        String phoneNumber = retrieve.get(1);

        //Then
        Assert.assertEquals(num2, phoneNumber);

    }

    @Test
    public void removeOneNumber() {
        //Given
        String num2 = "432957359272";
        test.add(givenName,givenPhone);
        test.add(givenName, num2);
        System.out.println(test.get(givenName).size());


        //When
        test.removePhoneRecord(givenName,givenPhone);
        ArrayList<String> retrieve = test.get(givenName);
        System.out.println(test.get(givenName));
        String phoneNumber = retrieve.get(0);

        //Then
        Assert.assertEquals(num2, phoneNumber);

    }







    }
