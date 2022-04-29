package practiceprograms;

import org.testng.annotations.Test;

import java.util.*;

public class JavaPrograms {

    public static void printfunc(String[] mystr) {
        for (String item : mystr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void showList(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static int sumOfArray(int[] myArray) {

        int Sum = 0;
        for (int iCounter = 0; iCounter <= myArray.length - 1; iCounter++) {
            Sum = Sum + myArray[iCounter];

        }
        return Sum;
    }

    public static void deletecharatindex(String S, int i) {
        StringBuffer sb = new StringBuffer(S);
        sb.deleteCharAt(i);
        System.out.println(sb);
    }

    @Test(description = "Reverse a string to check whether a string is a Palindromen")
    public void test1() {
        String str = "nitin";
        StringBuffer str1 = new StringBuffer(str);

        if (str.equals(str1.reverse().toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    @Test(description = "Another approach to check whether a string is a Palindromen")
    public void test2() {
        String str = "notin";

        int i = 0;
        int j = str.length() - 1;

        boolean flag = true;
        while (i > j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                i++;
                j--;
            }
        }

        if (flag) {
            System.out.println("pallindrome");
        } else {
            System.out.println("not pallindrome");
        }
    }

    @Test(description = "Reverse a string")
    public void test3() {
        StringBuffer str = new StringBuffer("sudhansu");
        System.out.println(str.reverse());

    }

    @Test(description = "Reverse a string - 2nd Approach")
    public void test4() {
        String str = "sudhansu";
        char[] myCharStr = str.toCharArray();
        String
                temp = "";
        for (int i = myCharStr.length - 1; i >= 0; i--) {
            System.out.println(myCharStr[i]);
            temp = temp + myCharStr[i];
        }
        System.out.println(temp);

    }

    @Test(description = "Count the number of words in a string")
    public void test5() {
        String str = "My Name is sudhansu p u i o ";
        String[] strarray = str.split(" ");
        System.out.println(strarray.length);
    }

    @Test(description = "Count the number of DUPLICATE / repeated words in a string using HashMap")
    public void test6() {
        String str = "My My Name Name is is sudhansu ricky patro";
        String[] strarray = str.split(" ");
        //Method 1 using HASHMAP
        int count = 1;
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strarray.length; i++) {

            if (map.containsKey(strarray[i])) {

                map.put(strarray[i], count + 1);
            } else {
                map.put(strarray[i], count);
            }

        }

        System.out.println(map);

    }

    @Test(description = "find whether a number is prime or not")
    public void test7() {

        boolean flag = false;
        int num = 11;
        System.out.println(num);
        for (int i = 2;
             i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is prime");
        }


    }

    @Test(description = "filter out numbers from string")
    public void test8() {

        String str = "Ind12ia45";
        String newstr = str.replaceAll("[\\d]", "");//
        String newstr2 = str.replaceAll("[^\\d]", "");// replace
        //all non digits/character
        String newstr3 = str.replaceAll("[\\d]", "") + str.replaceAll("[^\\d]", "");// op: India1245
        System.out.println(newstr3);

    }

    @Test(description = "find unique numbers in an array - 1st Approach")
    public void test9() {
        int arr[] = {1, 1, 2, 4, 2, 5, 6, 3, 4};
        //Approach 1 - less time complexity using hashmap

        HashMap hm = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);

        }
        System.out.println(hm.keySet());
    }

    @Test(description = "find unique numbers in an array - 2nd Approach")
    public void test10() {
        //second best approach using hashset
        int arr[] = {1, 1, 2, 4, 2, 5, 6, 3, 4};
        HashSet hs = new HashSet();
        for (int i = 0; i < arr.length; i++) {

            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);

            }

        }
        for (Object a : hs) {
            System.out.println(a);
        }
    }

    @Test(description = "find number of duplicate words")
    public void test11() {
        String mystring = "Big black bug bit a big black dog";
        int count = 0;

        String mystrarr[] = mystring.toLowerCase().split(" ");

        for (int i = 0; i < mystrarr.length; i++) {
            for (int j = i + 1; j < mystrarr.length; j++) {
                if (mystrarr[i].equals(mystrarr[j])) {
                    count++;
                    System.out.println(mystrarr[i]);
                }
            }
        }

    }

    @Test(description = "sort the list of strings using Java collection")
    public void test12() {
        //Write code to sort the list of strings using Java collection?
        String[] myStArray = {"Beta", "Alpha", "alp", "Gamma", "beta"};

        printfunc(myStArray);

        Arrays.sort(myStArray);
        printfunc(myStArray);

        Arrays.sort(myStArray, String.CASE_INSENSITIVE_ORDER);
        printfunc(myStArray);
    }

    @Test(description = "Sorting")
    public void test13() {
        String[] inputList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec"};

        // Display input un-sorted list.
        System.out.println("-------Input List-------");
        showList(inputList);

        // Call to sort the input list.
        Arrays.sort(inputList);

        // Display the sorted list.
        System.out.println("\n-------Sorted List-------");
        showList(inputList);

        // Call to sort the input list in case-sensitive order.
        System.out.println("\n-------Sorted list (Case-Sensitive)-------");
        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(null, String.CASE_INSENSITIVE_ORDER);

        // Display the sorted list.
        showList(inputList);
    }

    @Test(description = " sum of all elements in an array")
    public void test14() {
        int[] myArray = {1, 2, 3, 4, 5};

        int sum = sumOfArray(myArray);

        System.out.println(sum);

    }

    @Test(description = "maximum difference between any adjacent index in array")
    public void test15() {
        int[] a = {1, 4, 8, 15, 17};
        int[] diff = new int[4];
        for (int i = 0; i < a.length - 1; i++) {

            diff[i] = a[i + 1] - a[i];
            int difference = a[i + 1] - a[i];
            System.out.println(diff[i]);
            System.out.println(diff[i]);
        }

        int max = 0;
        for (int i = 0; i < diff.length; i++) {

            if (diff[i] > max) {
                max = diff[i];
            }
        }

        System.out.println("maximum difference is : " + max);
    }

    @Test(description = "compare same indexes of 2 array and create a third array with matching values")
    public void test16() {
        int a[] = {1, 4, 5, 7};
        int b[] = {6, 4, 3, 7};

        ArrayList<Integer> AL = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                AL.add(a[i]);
            }
        }

        for (int i = 0; i < AL.size(); i++) {
            System.out.println(AL.get(i));
        }
    }

    @Test(description = "sort array in ascending and descending order")
    public void test17() {
        int a[] = {2, 6, 1, 4, 9};

        int i;
        int j;
        int temp;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }

        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test(description = "swap with and without using third variable")
    public void test18() {
        int a = 4;
        int b = 5;

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a is  " + a);
        System.out.println("b is  " + b);


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is  " + a);
        System.out.println("b is  " + b);

    }

    @Test(description = "printing pyramid pattern as below")
    public void test19() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
                System.out.print("\t");

            }
            System.out.println();


        }
    }

    @Test(description = "printing fibonacci pattern")
    public void test20() {
        //    0  1 1 2 3 5 8 13 21

        int a = 0;
        int b = 1;
        int i = 1;
        int sum = 0;
        while (i <= 8) {
            sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
            i++;
        }
    }

    @Test(description = "Distance between two characters in a string")
    public void test21() {
        String val = "abcdefghijkl";
        char[] myval = val.toCharArray();

        char first = 'a';
        char last = 'c';
        int firstFoundAt = 0;
        int lastFoundAt = 0;

        for (int i = 0; i < myval.length; i++) {


            if (myval[i] == first) {
                firstFoundAt = i;
            }
            if (myval[i] == last) {
                lastFoundAt = i;
            }
        }
        int distance = lastFoundAt - firstFoundAt;
        System.out.println(distance);
    }

    @Test(description = "count the number of repeating characters in a string word using HashMap")
    public void test22() {
        String str = "aabbccccdddddddefff";
        String[] strArr = str.split("");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strArr.length; i++) {

            if (!map.containsKey(strArr[i])) {
                map.put(strArr[i], 1);

            } else {
                int count = map.get(strArr[i]);
                map.put(strArr[i], count + 1);
            }
        }
        System.out.println(map);
    }

    @Test(description = "count the number of repeating words in a string  sentence using HashMap")
    public void test23() {
        String str = "This this is is is my Name Name";
        String[] strArr = str.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strArr.length; i++) {


            if (map.containsKey(strArr[i])) {
                int count = map.get(strArr[i]);
                map.put(strArr[i], count + 1);
            } else {
                map.put(strArr[i], 1);
            }


        }

        System.out.println(map);
    }

    @Test(description = "put _ between a small and capital character in a string")
    public void test24() {
        String str = "SudhansuPatro";
        String newStr = "";
        char[] myArr = str.toCharArray();
        String temp = "";
        for (int i = 0; i < myArr.length - 1; i++) {
            int ASCIIValueofI = myArr[i];
            int ASCIIValueofJ = myArr[i + 1];
            if (ASCIIValueofI >= 65 && ASCIIValueofI <= 90) {
                if (ASCIIValueofJ >= 97 && ASCIIValueofJ <= 122) {
                    temp = temp + myArr[i] + "_";
                } else {
                    temp = temp + myArr[i];
                }
            } else {
                if (ASCIIValueofI >= 97 && ASCIIValueofI <= 122) {
                    if (ASCIIValueofJ >= 65 && ASCIIValueofJ <= 90) {
                        temp = temp + myArr[i] + "_";
                    } else {
                        temp = temp + myArr[i];
                    }
                }
            }

        }


        System.out.println(temp);


        for (int i = 0; i < myArr.length - 1; i++) {

            if (Character.isLowerCase(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i + 1))) {
                    newStr = newStr + str.charAt(i) + "_";
                }
            } else {
                newStr = newStr + str.charAt(i);
            }
        }
    }

    @Test(description = "find out distance between two characters in a string")
    public void test25() {
        String str = "ricky";
        char firstChar = 'r';
        char lastChar = 'y';
        int firstElement = 0;
        int lastElement = 0;
        char[] myArr = str.toCharArray();

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == firstChar) {
                lastElement = i;
                break;
            }
        }

        for (int j = 0; j < myArr.length; j++) {
            if (myArr[j] == lastChar) {
                lastElement = j;
                break;
            }
        }
        int distance = lastElement - firstElement;

        System.out.println(distance);


        System.out.println(str.indexOf(firstChar));
        System.out.println(str.indexOf(lastChar));

        int distance2 = str.indexOf(lastChar) - (str.indexOf(firstChar) + 1);

        System.out.println(distance2);
    }

    @Test(description = "common element from two arrays")
    public void test26() {
        String[] strArr1 = {"A", "B", "C"};
        String[] strArr2 = {"C", "D", "E"};

        for (int i = 0; i < strArr1.length; i++) {
            for (int j = 0; j < strArr2.length; j++) {
                if (strArr1[i].equalsIgnoreCase(strArr2[j])) {
                    System.out.println(strArr1[i]);
                }
            }
        }

        int[] intArr1 = {1, 2, 3, 4};
        int[] intArr2 = {3, 4, 5};

        for (int i = 0; i < intArr1.length; i++) {
            for (int j = 0; j < intArr2.length; j++) {
                if (intArr1[i] == intArr2[j]) {
                    System.out.println(intArr1[i]);
                }
            }
        }

    }

    @Test(description = "Add 2 array lists")
    public void test27() {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        System.out.println(list1);

        list1.addAll(list2);
        System.out.println(list1);
    }

    @Test(description = "remove a particular character from a String")
    public void test28() {
        Character c = 'p';
        String str = "peek";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                deletecharatindex(str, i);
            }
        }
    }

    @Test(description = "swap two String variables without third variable")
    public void test30() {
        String str1 = "hello";
        String str2 = "world";

        str1 = str1 + str2; //helloworld
        str2 = str1.substring(0, str1.length() - str2.length());//hello
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }

    @Test(description = "count the number of words in a String")
    public void test31() {
        String str = "My Name is sudhansu patro";
        String[] myArr = str.split(" ");
        System.out.println(myArr.length);
    }

    @Test(description = "whether one string is a rotation of another")
    public void test32() {
        String str1 = "avajava";
        String str2 = "javaava";

        StringBuffer sb = new StringBuffer(str2);
        if (sb.reverse().toString().equalsIgnoreCase(str1))
            System.out.println("yes , this is rotation");
        else
            System.out.println("no , this is not rotation");

    }

    @Test(description = "convert String to Integer and Integer to String")
    public void test33() {
        String str = "sudhansu";
        Integer.parseInt(str);
        Integer.valueOf(str);

        int i = 100;
        String.valueOf(i);
        Integer.toString(i);
    }

    @Test(description = "check number of upper case , lower case , digits")
    public void test34() {

        String str = "India is my country 100%";
        int lowerCase = 0;
        int upperCase = 0;
        int digit = 0;
        int other = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isLowerCase(str.charAt(i)))
                lowerCase++;
            else if (Character.isUpperCase(str.charAt(i)))
                upperCase++;
            else if (Character.isDigit(str.charAt(i)))
                digit++;
            else
                other++;
        }


        System.out.println("Details are as follows : " + "lowerCase - " + lowerCase + " ; upperCase - " + upperCase + " , digits - " + digit + " ; others - " + other);


    }

    @Test(description = "check of two string are anagrams")
    public void test35() {
        String str1 = "Keep";
        String str2 = "Peek";
        boolean flag;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            flag = false;
        } else {
            char[] Arr1 = str1.toCharArray();
            char[] Arr2 = str2.toCharArray();

            Arrays.sort(Arr1);
            Arrays.sort(Arr2);

            if (Arrays.equals(Arr1, Arr2)) {
                flag = true;
            } else
                flag = false;
        }

        if (flag) {
            System.out.println("anagram");
        } else {

            System.out.println("not anagram");
        }
    }

    @Test(description = "reverse each of the words in string")
    public void test36() {
        String str = "My Name is Sudhansu";

        String[] myarr = str.split(" ");
        String temp = "";
        for (String eachElement : myarr) {

            StringBuffer sb = new StringBuffer(eachElement);
            temp = temp + sb.reverse().toString() + " ";


        }
        System.out.println(temp);
    }

    @Test(description = "reverse words")
    public void test37() {
        String str = "east west north south";
        String[] myStrArr = str.split(" ");
        int i = myStrArr.length - 1;
        String temp = "";
        while (i >= 0) {
            System.out.println(myStrArr[i]);
            temp = temp + myStrArr[i] + " ";
            i--;

        }

        System.out.println(temp);
    }

    @Test(description = "capitalize each word")
    public void test38() {
        String str = "this is javatpoint";
        System.out.println(str.toUpperCase());

    }

    @Test(description = "")
    public void test39() {
    }


}








