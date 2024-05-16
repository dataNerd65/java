//Using recursion in methods to simplify an operation that would otherwise be tedious.
//Here is getting sum of the numbers up to the specified number k
public class RecurMethod{
    public static void main(String[] args){
        int result = sum(10);

        System.out.println(result);
    }
    public static int sum(int k){
        if (k > 0){
            return k + sum(k - 1);
        }else{
            return 0;
        }
    }
}