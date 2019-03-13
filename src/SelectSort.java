/*
    从小到大排序的实现
 */
class SelectSort {

    public void selectSort(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
//                如果需要实现从大到小排序，将">"修改成"<"即可
                if( array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
