package org.codewars.utils;

import com.beust.ah.A;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.math.BigInteger;
import java.util.NoSuchElementException;


public class ReaderTest {

    private InputStream sysIn;
    private PrintStream sysOut;

    @BeforeMethod
    public void setup() {
        sysIn = System.in;
        sysOut = System.out;
    }

    @AfterMethod
    public void tearDown() {
        System.setIn(sysIn);
        System.setOut(sysOut);
    }

    @DataProvider(name = "readIntTestData")
    private Object[][] readIntTestData() {
        return new Object[][]{
                {"-2147483648", -2147483648},
                {"0", 0},
                {"67", 67},
                {"2147483647", 2147483647},
        };
    }
    @Test(dataProvider = "readIntTestData")
    public void testReadInt(String input, int expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        int actual = reader.readInt();
        Assert.assertEquals(actual, expected);
    }
    @DataProvider(name = "readIntTestDataInvalid")
    private Object[][] readIntTestDataInvalid() {
        return new Object[][]{
                {"@#$%\n1", 1, "An invalid integer was entered. Attempt again:\n"},
                {"3.4e-38\n38", 38, "An invalid integer was entered. Attempt again:\n"},
                {"9.1\n91", 91, "An invalid integer was entered. Attempt again:\n"},
                {"  \n477", 477, "An invalid integer was entered. Attempt again:\n"},
                {"six\n6", 6, "An invalid integer was entered. Attempt again:\n"},
                {"sda\ngjklpu scfhte566gtu asd\n7", 7, "An invalid integer was entered. Attempt again:\nAn invalid integer was entered. Attempt again:\n"}
        };
        };
    @Test(dataProvider = "readIntTestDataInvalid")
    public void testReadIntInvalid(String input, int expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        int actual = reader.readInt();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readBigIntegerTestData")
    private Object[][] readBigIntegerTestData() {
        return new Object[][]{
                {"0", new BigInteger("0")},
                {"1", new BigInteger("1")},
                {"-225", new BigInteger("-225")},
                {"34778324257332478453", new BigInteger("34778324257332478453")},
        };
    }
    @Test(dataProvider = "readBigIntegerTestData")
    public void testReadBigInteger(String input, BigInteger expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        BigInteger actual = reader.readBigInteger();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readBigIntegerTestDataInv")
    private Object[][] readBigIntegerTestDataInv() {
        return new Object[][]{
                {"1rhqewjeqwjk", new BigInteger("1"), "No line found"}
        };
    }
    @Test(dataProvider = "readBigIntegerTestDataInv")
    public void testReadBigIntegerInv(String input, BigInteger expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        try {
            BigInteger actual = reader.readBigInteger();
            Assert.assertEquals(actual, expected);
        } catch (NoSuchElementException e) {
            Assert.assertEquals(e.getMessage(), expectedOut);
        }
    }

    @DataProvider(name = "readDoubleTestData")
    private Object[][] readDoubleTestData() {
        return new Object[][] {
                {"7", 7.0},
                {"0", 0.0},
                {"-2,54", -2.54},
                {",666666660", 0.66666666}
        };
    }
    @Test(dataProvider = "readDoubleTestData")
    public void testReadDouble(String input, double expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        double actual = reader.readDouble();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readDoubleTestDataInvalid")
    private Object[][] readDoubleTestDataInvalid() {
        return new Object[][] {
                {"@#$%\n1", 1.0, "Your value is invalid. Try again\n"},
                {"\n-14.25\n18,58480", 18.5848, "Your value is invalid. Try again\n"},
                {"six point eight\nnew one\n05,29", 5.29, "Your value is invalid. Try again\nYour value is invalid. Try again\n"},
                {"18.180.48\n18,54,49\n-54", -54.0, "Your value is invalid. Try again\nYour value is invalid. Try again\n"}
        };
    }
    @Test(dataProvider = "readDoubleTestDataInvalid")
    public void testReadDoubleInvalid(String input, double expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        double actual = reader.readDouble();
        Assert.assertEquals(out.toString().replaceAll("\r", ""), expectedOut);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readFloatTestData")
    private Object[][] readFloatTestData() {
        return new Object[][]{
                {"10", 10f},
                {"0", 0.0f},
                {"53,08", 53.08f},
                {"-23453,9999999999", -23453.9999999999f},
                {",9", 0.9f},
                {"13,", 13.0f},
                {"   45,3", 45.3f},
                {"23     ", 23.0f},
                {"   567,444335", 567.444335f},
                {"   9,8 kg nluon klk ,lkjj", 9.8f}
        };
    }
    @Test(dataProvider = "readFloatTestData")
    public void testReadFloat(String input, float expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        float actual = reader.readFloat();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readFloatTestDataInv")
    private Object[][] readFloatTestDataInv() {
        String errMsg = "Your value is invalid. Try again\n";
        return new Object[][]{
                {"sdadqw\n2,1", 2.1f, errMsg.repeat(1)},
                {"sda\nadwqwdcsd sdqwqwwqe12qwdc xcsd\n20,39", 20.39f, errMsg.repeat(2)},
                {"wqeqwe2\nwr23\nwer3.r\nwere3,1\n340,6", 340.6f, errMsg.repeat(4)},
                {"2flfd;\n23wr\n3.rffs\n3,1sdqw\n56,7", 56.7f, errMsg.repeat(4)},
                {"13.2\n123,4e\nw265,5\n,9",.9f,errMsg.repeat(3)},
                {"a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n" +
                        "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz\n,9",.9f,errMsg.repeat(26*50)}
        };
    }
    @Test(dataProvider = "readFloatTestDataInv")
    public void testReadFloatInv(String input, float expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        float actual = reader.readFloat();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readLongTestDataValid")
    private Object[][] readLongTestDataValid() {
        return new Object[][]{
                {"1234567890", 1234567890L},
                {"-9876543210", -9876543210L},
                {"0", 0L},
                {"  12345  ", 12345L},
                {"  -999  ", -999L},
                {"999999999999999", 999999999999999L},
                {"-123", -123L},
                {"  0  ", 0L},
        };
    }

    @Test(dataProvider = "readLongTestDataValid")
    public void testReadLong(String input, long expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Reader reader = new Reader();
        long actual = reader.readLong();
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "readLongTestDataInvalid")
    private Object[][] readLongTestDataInv() {
        return new Object[][]{
                {"qwerty\nqwertyqwerty\n1234567890", 1234567890L, "Your value is invalid. Try again\nYour value is invalid. Try again\n"},
                {"qwerty\n1234567890", 1234567890L, "Your value is invalid. Try again\n"},
        };
    }

    @Test(dataProvider = "readLongTestDataInvalid")
    public void testReadLongInvalid(String input, long expected, String expectedOut) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        long actual = reader.readLong();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadString() {
    }

    @Test
    public void testReadArrInt() {
    }

    @DataProvider(name = "testReadArrDoubleData" )
    private Object[][] testReadArrDoubleData(){
        return new Object[][]{
                {".666666660 2.2 -3.34 0.4 5.0 2.777", new double[]{0.66666666, 2.2, -3.34, 0.4, 5.0, 2.777}},
                {"2.0 5.4 .2 4.33333 8.1 0.2", new double[]{2.0, 5.4, 0.2, 4.33333, 8.1, 0.2}}
        };
    }
    @Test(dataProvider = "testReadArrDoubleData")
    public void testReadArrDouble(String str, double[] expectedValue) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        Reader reader = new Reader();
        double[] actualValue = reader.readArrDouble();
        Assert.assertEquals(actualValue, expectedValue);
    }


    @DataProvider(name = "testReadArrDoubleDataInvalid" )
    private Object[][] testReadArrDoubleDataInvalid(){
        return new Object[][]{
                {".666666660 two -3.34 0.4 5.0 2.777\n.666666660 2.2 -3.34 0.4 5.0 2.777", new double[]{0.66666666, 2.2, -3.34, 0.4, 5.0, 2.777}, "Enter double numbers, separated with space: " +
                        "Your value is invalid\nTry again\nEnter double numbers, separated with space: "},
                {"2.0 5.4 zero 4.33333 8.1 0.2\n2.0 5.4 .2 4.33333 8.1 0.2", new double[]{2.0, 5.4, 0.2, 4.33333, 8.1, 0.2}, "Enter double numbers, separated with space: " +
                        "Your value is invalid\nTry again\nEnter double numbers, separated with space: "}
        };
    }

    @Test(dataProvider = "testReadArrDoubleDataInvalid")
    public void testReadArrDoubleInvalid(String str, double[] expectedValue, String expectedOut) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        double[] actualValue = reader.readArrDouble();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actualValue, expectedValue);
    }


    @Test
    public void testReadArrString() {
    }

    @DataProvider(name = "testReadArrLongData" )
    private Object[][] testReadArrLongData(){
        return new Object[][]{
                {"1 2 3 4 5 2", new long[]{1, 2, 3, 4, 5, 2}},
                {"2 5 2 4 8 2", new long[]{2, 5, 2, 4, 8, 2}}
        };
    }
    @Test(dataProvider = "testReadArrLongData")
    public void testReadArrLong(String str, long[] expectedValue) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        Reader reader = new Reader();
        long[] actualValue = reader.readArrLong();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @DataProvider(name = "testReadArrLongDataInvalid" )
    private Object[][] testReadArrLongDataInvalid(){
        return new Object[][]{
                {"s 5 2 4 8 2\n2 5 2 4 8 2", new long[]{2, 5, 2, 4, 8, 2}, "Enter numbers, separated with space: " +
                        "Your value is invalid\nTry again\nEnter numbers, separated with space: "},
                {"1 2 3 4 5 six\n1 2 3 4 5 6", new long[]{1, 2, 3, 4, 5, 6}, "Enter numbers, separated with space: " +
                        "Your value is invalid\nTry again\nEnter numbers, separated with space: "}
        };
    }

    @Test(dataProvider = "testReadArrLongDataInvalid")
    public void testReadArrLongInvalid(String str, long[] expectedValue, String expectedOut) {
        System.setIn(new ByteArrayInputStream(str.getBytes()));
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Reader reader = new Reader();
        long[] actualValue = reader.readArrLong();
        Assert.assertEquals(out.toString().replace("\r", ""), expectedOut);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testReadBoolean() {
    }
}
