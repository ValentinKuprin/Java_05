import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Possitive Happy path
    // if (start <= end)
    //return array

    //2. Negative testing
    // if (start > end)
    // return String[0]

    @Test
    //start < end
    public void testStartLessThanEnd_HappyPath() {
        ///AAA
        //1. arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //2. act
//        способ прошлого потока !
//        FizzBuzz fizzBuzz = new FizzBuzz(); //( тип данных название переменной = создание нового объекта FizzBuzz() )- конструктор по умолчанию
//        String[] actualResult = fizzBuzz.fizzBuzz();

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // Объект класса в котором лежит метод с параметрами (int, int)

        //3. Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    // start == end
    public void testStartEqualsEnd_HappyPath() {

        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // Объект класса в котором лежит метод с параметрами (int, int)

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    // start < end
    public void testStartLessEndAreNegative_HappyPath() {

        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17", "-16", "FizzBuzz", "-14", "-13",
                "Fizz", "-11", "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4", "Fizz", "-2", "-1"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // Объект класса в котором лежит метод с параметрами (int, int)

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    //Negative testing
    // start > end
    public void testStartGreaterThanEndNegative() {

        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end); // Объект класса в котором лежит метод с параметрами (int, int)

        Assert.assertEquals(actualResult, expectedResult);
    }

}
