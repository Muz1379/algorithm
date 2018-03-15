/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.12
 * @decription: 快速排序
 */
public class Sort
    {
        /**
         * 快速排序算法
         *
         * @param array
         *         待排序数组
         * @param start
         *         起始位置
         * @param end
         *         结束位置
         *
         * @return
         */
        public static int[] quickSort(int[] array, int start, int end)
            {
                if (start >= end)
                {
                    return array;
                }
                int i = start;
                int j = end;
                
                int key = array[start];
                /**
                 * 下面while循环分割待排序数组
                 */
                while (i < j)
                {
                    while (array[j] >= key && i < j)
                    {
                        j--;
                    }
                    array[i]=array[j];
                    while (array[i] <= key && i < j)
                    {
                        i++;
                    }
                    array[j]=array[i];
                }
                array[i]=key;
                quickSort(array, start, i-1);
                quickSort(array, i+1, end);
                return array;
            }
    }
