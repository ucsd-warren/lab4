package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        //return this;
        return null;
    }

    @Override
    public Temperature toFahrenheit() {
        float val;
        val = this.getValue()*(9/5) + 32;
        //return new Fahrenheit(val);
        return null;
    }


    public String toString()
        {
            // TODO: Complete this method
            return "";
        }
}
