/*
    从小到大排序的实现
 */
class InsertSort{
    public void insertSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
//                如果需要实现从大到小排序，将"<"修改成">"即可               
                if( arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}