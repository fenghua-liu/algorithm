package algorithm.test.sort;
//冒泡排序
public class Bubble {
    public static void sort(Comparable[] a){
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                //比较索引j和j+1的值大小，判断是否交换
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }
    }

    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    private static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

