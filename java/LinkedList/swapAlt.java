package java.LinkedList;

// Java implementation of the above approach
class swapAlt
{
    static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static void UpdateArr(int arr[], int n)
    {

        int i = 0, j = n - 1;

        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i += 2;
            j -= 2;
        }

        printArr(arr, n);
    }


    public static void main (String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        UpdateArr(arr, n);
    }
}


