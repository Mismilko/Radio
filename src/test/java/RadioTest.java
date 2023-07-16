import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //ПРОВЕРКА ЗНАЧЕНИЙ СТАНЦИЙ

    @Test
    public void setCorrectStationTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
// тестирование нижних граничных значений -1,0,1
    @Test
    public void setWithoutLowerLimitTest() {
        Radio radio = new Radio ();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setStation0Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(6);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStation1Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    //тестирование верхних граничных значений 8,9,10
    @Test
    public void setStation8Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setStation9Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setStation10Test() {
        Radio radio = new Radio ();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    //ПРОВЕРКА ЗНАЧЕНИЙ ЗВУКА



}