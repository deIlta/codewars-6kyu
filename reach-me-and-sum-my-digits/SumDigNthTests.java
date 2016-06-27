import org.junit.Assert;
import org.junit.Test;

/**
 * Created by comp on 27.06.2016.
 */
public class SumDigNthTests {

    private static void testing(long act, long exp) {
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test1() {
        System.out.println("Basic Tests **** sumDigNthTerm");
        testing(SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 6), 10);
        testing(SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 15), 10);
        testing(SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 50), 9);
        testing(SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 78), 10);
        testing(SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 157), 7);
    }
}
