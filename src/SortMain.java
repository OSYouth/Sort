public class SortMain {

    public static void main(String[] args){
        int[] arrayExample = {38, 65, 97, 76, 13, 27, 49};

        System.out.println("20190312 选择排序 一般的示例");
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(arrayExample);
        for (int item : arrayExample){
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
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(arrayExample);
        for (int item : arrayExample){
            System.out.print(item + " ");
        }
        System.out.println();

    }
}
