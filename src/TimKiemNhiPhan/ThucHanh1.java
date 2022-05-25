package TimKiemNhiPhan;

import sun.reflect.generics.tree.Tree;

public class ThucHanh1 {
    public static int binarySearch(int list[],int key){
        int low=0;
        int height =list.length-1;
        while (height>=low){
            int mid = (low+height)/2;
            if(key<list[mid]){
                height=mid-1;
            }
            else if (key==list[mid]){
                return mid;
            }
            else
                low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        double start = System.currentTimeMillis();
        System.out.println("Thoi gian bat dau :"+start);
        int list []= {2,4,6,8,9,12,14,16,20,25,28,80,100};
        System.out.println("Vi tri can tim la:"+binarySearch(list,16));
        double end= System.currentTimeMillis();
        System.out.println("thoi gian ket thuc:"+end);
        System.out.println("Thoi gian thuc hien :"+(end-start));
    }
}
