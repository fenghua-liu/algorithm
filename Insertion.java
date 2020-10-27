package algorithm.test.sort;
//插入排序  未排序元素中第一个和已排序元素中各元素比较插入合适位置
public class Insertion {

    public static void sort(Comparable[] a){
        for(int i=1;i<a.length;i++){
            for(int j=i;j>=0;j--){
                //比较索引j-1和索引j处的值，如果j-1
                //比j大，则交换数据
                if(greater(a[j-1],a[j])){
                    exch(a,j-1,j);
                }else {
                    break;
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
