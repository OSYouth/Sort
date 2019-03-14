/*
    从小到大排序的实现
    {38, 65, 97, 76, 13, 27, 49};
 */
class BubbleSort{
    public void bubbleSort(int[] arr){
        //这个i
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
//                如果需要实现从大到小排序，将">"修改成"<"即可               
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}