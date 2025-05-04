//java program to check the equality of two arrays
public class EqualityArrays {
    public static void main(String[] args) {
        int arr1[] = {2,5,1,7,4};
        int arr2[] = {2,5,1,8,4};

        boolean equalOrNot = true;

        if(arr1.length == arr2.length){
            for(int i=0 ; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    equalOrNot = false;
                }
            }
        }else{
            equalOrNot = false;
            
        }

        if(equalOrNot){
            System.out.println("Two arrays are equal");
        }else{
            System.out.println("Two arrays are not equal");
        }
    }
}

// String[] s1 = {"java", "j2ee", "struts", "hibernate"};
  
// String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
  
// String[] s3 = {"java", "j2ee", "struts", "hibernate"};
  
// System.out.println(Arrays.equals(s1,s2));        //Output : false
  
// System.out.println(Arrays.equals(s1, s3));    