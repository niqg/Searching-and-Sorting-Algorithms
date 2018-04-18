public static void improvedBubbleSort(Integer [] array)
{
        int size = array.length;
        int totalSwaps = 0;
        int comparisons = 0;
        int swaps = -1;

        while(size > 1 && swaps != 0)
        {
                swaps = 0;

                for(int i = 0 , j = 1 ; j < size ; i++ , j++, comparisons++)
                {

                        if(array[i] > array[j])
                        {

                        totalSwaps++;
                        swaps++;
                        Integer temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;

                        }
                }

                System.out.println("Swaps this round: " + swaps);
                size--;
        }

        System.out.println("# of total swaps: " + totalSwaps + " # of Comparisons: " + comparisons + "\n");

}
