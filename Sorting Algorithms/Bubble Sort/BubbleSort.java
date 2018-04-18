public static void bubbleSort(Integer [] array)
        {
            int size = array.length;
            int swaps = 0;
            int comparisons = 0;


            while(size > 1)
            {

                for(int i = 0 , j = 1 ; j < size ; i++ , j++, comparisons++)
                {

                    if(array[i] > array[j])
                    {

                    swaps++;
                    Integer temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                    }
                }

                size--;

            }

            System.out.println("# of swaps: " + swaps + " # of Comparisons: " + comparisons + "\n");
        }