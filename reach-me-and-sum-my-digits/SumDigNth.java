/**
 * Created by comp on 27.06.2016.
 */


public class SumDigNth {

    public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
        // your code

        long val = initval;
        long terms = 0;
        long nth = 0;

        for (int i = 1; i < nthterm + 1; i++, val += terms) {
            terms = patternl[(i - 1) % patternl.length];
            if(nthterm == i)
               nth = val;


        }
        return sumOfBits(nth);
    }


    private static long sumOfBits(long number)
    {
        String num = Long.toString(number);

        int length = num.length();

        char[] chars = num.toCharArray();

        long result = 0;

        for (int i = 0; i < length; i++)
        {
            result += Character.getNumericValue(chars[i]);
        }
        return result;
    }
}
