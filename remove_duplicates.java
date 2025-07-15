public class Removeduplicate {
    public static int removeduplicate(int[] num){
        int i=0;
        for(int j=i+1;j<num.length;j++){
            if(num[j]!=num[i]){
                num[i+1]=num[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] num={1,1,4,4,5,6,9};
        int result=removeduplicate(num);
        System.out.print("Unique elements: ");
        for (int i = 0; i < result; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\nTotal unique elements: " + result);
    }
}
