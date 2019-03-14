public class SortMain {

    public static void main(String[] args){
       
        System.out.println("20190312 选择排序 一般的示例");
        int[] selectSortArray = {38, 65, 97, 76, 13, 27, 49};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(selectSortArray);
        for (int item : selectSortArray){
            System.out.print(item + " ");
        }        
        System.out.println();
        System.out.println("    当后面有一项的值与第一项想等，而在这两项后面还有（2）比这个值更小的时候");
        int[] unstableArrayExample = {5, 65, 5, 97, 76, 2, 13, 27, 49};
        selectSort.selectSort(unstableArrayExample);
        System.out.print("    ");
        for (int item : unstableArrayExample){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("20190313 插入排序 一般的示例");
        int[] insertSortArray = {38, 65, 97, 76, 13, 27, 49};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(insertSortArray);
        for (int item : insertSortArray){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("20190314 冒泡排序 一般的示例");
        int[] bubbleSortArray = {38, 65, 97, 76, 13, 27, 49};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(bubbleSortArray);
        for (int item : bubbleSortArray){
            System.out.print(item + " ");
        }
        System.out.println();

    }
}
