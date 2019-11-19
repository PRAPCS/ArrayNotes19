class Main {
  public static void main(String[] args) {
    // Declare an array
    int[] arr1 = new int[10];
    // Decalre and initialize
    int[] arr2 = { 4, 5, 6, 20, 100, 42 };
    arr1[1] = 50;
    arr1[5] = 10;
    arr1[arr1.length - 1] = arr1[1] + arr1[5];
    arr1[0]++;
    arr1[2]--;
    int sum =0;


    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
    System.out.println("====ARR2========");
    
    for(int i=0; i<arr2.length; i++){
      //System.out.print(arr2[i]+"\t");
      if(arr2[i]%2==0)
       System.out.print(arr2[i]+"\t");
      sum +=arr2[i];

    }
    System.out.println();
    System.out.println(sum);
  }
}