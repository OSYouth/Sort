public class SelectionSortJava {

    public static void main(String[] args){
        System.out.println("一般的示例");
        int[] arrayExample = {38, 65, 97, 76, 13, 27, 49};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(arrayExample);
        for (int item : arrayExample){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("当后面有一项的值与第一项想等，而在这两项后面还有（2）比这个值更小的时候");
        int[] unstableArrayExample = {5, 65, 5, 97, 76, 2, 13, 27, 49};
        SelectSort unstableSelectSort = new SelectSort();
        unstableSelectSort.selectSort(unstableArrayExample);
        for (int item : unstableArrayExample){
            System.out.print(item + " ");
        }
    }
}

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
