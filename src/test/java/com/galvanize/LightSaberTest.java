package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void setChargeShouldUpdateCharge() {
        //Setup
        LightSaber saber = new LightSaber(10);

        //Enact
        float expected = 50.0f;
        saber.setCharge(50.0f);
        float actual = saber.getCharge();
        System.out.println("running test");

        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void setColorShouldUpdateColor(){
        //Setup
        LightSaber saber = new LightSaber(10);

        //Enact
        String expected = "blue";
        saber.setColor("blue");
        String actual = saber.getColor();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getJediSerialNumberShouldReturnSerialNumber(){
        //Setup
        LightSaber saber = new LightSaber(10);

        //Enact
        long expected = 10L;
        long actual = saber.getJediSerialNumber();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getMinutesRemainingShouldReturnMinutesRemaining(){
        //Setup
        LightSaber saber = new LightSaber(10);

        //Enact
        float expected = 300;
        float actual = saber.getRemainingMinutes();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void useShouldUpdateCharge(){
        //Setup
        LightSaber saber = new LightSaber(10);

        //Enact
        float expected = 90.0f;
        saber.use(60);
        float actual = saber.getCharge();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void rechargeShouldSetChargeTo100(){
        //Setup
        LightSaber saber = new LightSaber(10);

        //Enact
        float expected = 100.0f;
        saber.use(10);
        saber.recharge();
        float actual = saber.getCharge();

        // Assert
        assertEquals(expected, actual);
    }

}
