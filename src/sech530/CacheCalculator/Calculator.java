package sech530.CacheCalculator;

public interface Calculator{
    /**
     * Расчет факториала числа.
     * @param number
     */
    @Metric
    int calc (int number);
}