public static void improvedInsertionSort(Integer [] array)
{
        int size=array.length;
        int swaps=0;
        int comparisons=0;
        int source=1;
        int temp=-1;

        while(size>source)
        {
                int start=0;
                int end=source-1;
                int midpoint=end/2;
                temp=array[source];

                while(end>start)
                {
                        midpoint=(end+start)/2;
                        comparisons++;

                        if(array[source]<array[midpoint])
                        {
                                end=midpoint;
                        }
                        else
                        {
                                start=midpoint+1;
                        }
                }

                for(int i=source;i>midpoint;i--)
                {

                array[i]=array[i-1];
                swaps++;

                }

                array[midpoint]=temp;
                source++;
        }

        System.out.println("# of swaps: "+swaps+" # of Comparisons: "+comparisons+"\n");
}


