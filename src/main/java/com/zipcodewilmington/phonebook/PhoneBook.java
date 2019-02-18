package com.zipcodewilmington.phonebook;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.lang.String;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    Map<String, ArrayList> phoneRecords;
    ArrayList<String> phoneList;

    public PhoneBook() {
        phoneRecords = new HashMap<String, ArrayList>();

    }

    //Map.Entry<String,ArrayList> byName = phoneRecords.entrySet();
//    String nameEntry = byName.getValue();
//    String phoneNumber = byName.getValue();


    public void add(String name, String phone) {
        phoneList = phoneRecords.get(name);
        if (phoneList == null) {
            phoneList = new ArrayList<String>();
            phoneList.add(phone);
            phoneRecords.put(name, phoneList);

        } else {
            phoneList.add(phone);
        }


    }

    public ArrayList<String> get(String name) {
        ArrayList<String> getPhones = phoneRecords.get(name);

        return getPhones;

    }

    public void remove(String name) {
        phoneRecords.remove(name);
    }


    public void removePhoneRecord(String name, String phone) {
        phoneRecords.get(name);
        phoneList.remove(phone);
    }


    public String reverseLookup(String givenPhone) {
        String match = null;
        for (String entry : phoneRecords.keySet()) {
            if (phoneRecords.get(entry).contains(givenPhone)) {
                match = entry;

            }
        }
        return match;
    }

}

//    public String display(ArrayList<String> n){
//
//
//
//        for (int i = 0; i <n.size() ; i++) {
//            System.out.println(n.get(i).toString());
//
//        }
//// IMPORTANT: Save the old System.out!
//        PrintStream oldPrintStream = System.out;
//// Tell Java to use your special stream
//        System.setOut(printStream);
//// Print some output: goes to your special stream
//        printStream.print("this is"+ n);
//// Put things back
//        System.out.flush();
//        System.setOut(oldPrintStream);}}
//// Show what happened








//
//          }           key = entry.getKey();
//break; //breaking because its one to one map

//        String val = null;
//        Set ref = phoneRecords.keySet();
//        Iterator it = ref.iterator();
//        List list = new ArrayList();
//
//        while (it.hasNext()) {
//            Object o = it.next();
//            if (phoneRecords.get(o).equals(givenPhone)) {
//                list.add(o);
//                val =list.toString();
//



//        String key=null;
//        for(Map.Entry entry: phoneRecords.entrySet()){
//
//            if(givenPhone.equals(entry.getValue())){
//                key = entry.getKey();
//        }


//        for (Map.Entry entry : phoneRecords.entrySet()) {
//            if (givenPhone.equals(entry.getValue())) {
//                key = entry.getKey();
//                break; //breaking because its one to one map












//ArrayList<String> phoneList = new ArrayList<String>();
//        phoneList.add(phone);
//        phoneRecords.put(name,phoneList);