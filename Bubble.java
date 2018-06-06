class Bubble {
    public static void main(String[] args) {
        int nums[] = {10,55,34,76,12,54,90,88,5,0};
        int size = 10;

        System.out.print("Элементы массива:");
        for (int i = 0; i < size; i++)
            System.out.print(" "+nums[i]);
        System.out.println();

/*
        for (int a = 1; a < size; a++)
            for(int b = size - 1; b >=a; b--){
            if (nums[b-1]>nums[b] ){
                int t = nums[b-1];
                nums[b-1] = nums[b];
                nums[b] = t;
            }

            }
            */
         for (int a = size -1; a>=0;a--)
             for(int b = 1; b<=a;b++){
             if(nums[b-1]>nums[b]){
                 int t = nums[b-1];
                 nums[b-1] = nums[b];
                 nums[b] = t;
             }
             }




        System.out.print("Отсортированный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" "+nums[i]);
        System.out.println();


    }
}
