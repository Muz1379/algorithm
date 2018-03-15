/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.12
 * @decription: 快速排序
 */
public class Sort
    {
        /**
         * 快速排序
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
                    array[i] = array[j];
                    while (array[i] <= key && i < j)
                    {
                        i++;
                    }
                    array[j] = array[i];
                }
                array[i] = key;
                quickSort(array, start, i - 1);
                quickSort(array, i + 1, end);
                return array;
            }
        
        /**
         * 选择排序，升序
         *
         * @param array
         * @param start
         * @param end
         *
         * @return
         */
        public static int[] selSort(int[] array, int start, int end)
            {
                int temp;
                int tempPos ;
                for (int i = start; i <= end - 1; i++)
                {
                    temp = array[i];
                    tempPos=i;
                    for (int j = i + 1; j <= end; j++)
                    {
                        if (temp > array[j])
                        {
                            temp = array[j];
                            tempPos = j;
                        }
                    }
                    array[tempPos] = array[i];
                    array[i] = temp;
                }
                return array;
            }
    
    
        /**
         * 冒泡排序
         *
         * @param array
         * @param start
         * @param end
         *         数组结束下标
         *
         * @return
         */
        public static int[] bubbleSort(int[] array, int start, int end)
            {
                int temp;
                for (int i = start; i < end; i++)
                {
                    for (int j = start; j < end - i; j++)
                    {
                        if (array[j]>array[j+1])
                        {
                            temp=array[j];
                            array[j]=array[j+1];
                            array[j+1]=temp;
                        }
                    }
                }
                return array;
            }
            
    }
