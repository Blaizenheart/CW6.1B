public class MyArrayTestClass
{
    public static void main(String[] args)
    {
        int[] arrOfInts = {1,2,3,4,5};
        System.out.println("-------- First Output --------");
        for (int i: arrOfInts)
        {
            System.out.print(i + " ");
        }

        addToNums(arrOfInts);

        System.out.println();
        System.out.println("-------- Second Output --------");
        for (int i: arrOfInts)
        {
            System.out.print(i + " ");
        }

        addToNums(arrOfInts);

        System.out.println();
        System.out.println("-------- Shayla's Third Output --------");
        for (int i: arrOfInts)
        {
            System.out.print(i + " ");
        }
    }

    public static void addToNums(int arr1[])
    {
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] += 2;
        }
    }
}