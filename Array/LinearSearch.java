
public class LinearSearch {

public static int search(int num[], int key){

for (int i = 0; i < num.length; i++) {
    if(num[i] == key){
        return i;
    }
   
}
return -1;
}

    public static void main(String[] args) {
        int num[] = {2,4,6,8,7,1,0,12,25,6,82,5,40};
        int key = 5;
        
        int index = search(num, key);
        if (index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}
