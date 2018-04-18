public static void insertionSort(Integer [] array)
{
        int size = array.length;
        int swaps = 0;
        int comparisons = 0;
        int source = 1;

        while(size > source)
        {
            for(int i = 0; i < source ; i++ , comparisons++)
            {
                if(array[i] > array[source])
                {
                    for(int j = source ; j > i ; j--)
                    {
                        int temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                        swaps++;
                    }
                }
            }

            source++;
        }

        System.out.println("# of swaps: " + swaps + " # of Comparisons: " + comparisons + "\n");
}
