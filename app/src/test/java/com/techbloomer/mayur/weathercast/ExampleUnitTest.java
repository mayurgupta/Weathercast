package com.techbloomer.mayur.weathercast;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //@Test
    public void addition_isCorrect( int values) throws Exception {
        //assertEquals(4, 2 + 2);
        System.out.println("number is "+values);
        calc(42);
        System.out.println("and now the number is "+values);
        //assertTrue("yes the variable is changed and its value is " +values,values==22);
    }
    private void calc(int values) {
        values=22;
    }
public static void main(String[] args) throws Exception {
    ExampleUnitTest ut=new ExampleUnitTest();
    int val=42;
    ut.addition_isCorrect(val);
    System.out.println("here is the number"+val);
}

}