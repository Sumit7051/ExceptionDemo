public class Division extends Exception {
    public int divide(int a, int b)
    {
        int div =0;
        try
        {
            if(b==0)
            {
                throw new RuntimeException("Zero se Divide nai Hota!");
            }
            div = a/b;
        }catch (Throwable e)
        {

//            e.printStackTrace();
            System.out.print(e.getMessage());
        }
        return div;
    }

    public int[] arr()
    {
        int nums[] = {1,2,3,4,5,6};
        try{
            System.out.println("Element at the entered index: " +nums[1]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return nums;
    }
}
