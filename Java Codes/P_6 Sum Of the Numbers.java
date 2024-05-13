class SumOfNos
{
    public static void main(String[] args)
    {
        int sum = 0;
        int arr[] = new int[args.length];
        for(int i = 0; i<args.length; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i = 0; i<args.length; i++)
        {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
    System.out.println("Sum of elements = "+ sum);
    }
}