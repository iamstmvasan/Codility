import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NestedListDemo {
    List<List> rowList = new ArrayList();
    int row, col;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col : ");
        row = sc.nextInt();
        col = sc.nextInt();

        for(int i=0;i<row;i++){
            List<Integer> colList = new ArrayList<>();
            for(int j=0;j<col;j++)
                colList.add(sc.nextInt());
            rowList.add(colList);
        }
    }
    public void process(){

    }
    public void output(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print(rowList.get(i).get(j)+"\t");
            System.out.println();
        }
    }

}
class NestedListDemoTesting{
    public static void main(String[] args) {
        NestedListDemo nestedListDemo = new NestedListDemo();
        nestedListDemo.input();
        nestedListDemo.output();
    }
}

