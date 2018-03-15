import java.util.Random;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.12
 * @decription:
 */

public class ArrayTool
    {
        public static int[] getRandArray(int length,int bound)
            {
                if (length == 0)
                {
                    return null;
                }
                int[] result = new int[length];
                Random ran = new Random();
                for (int i = 0; i < result.length; i++)
                {
                    result[i] = ran.nextInt(bound);
                }
                return result;
            }
    }
