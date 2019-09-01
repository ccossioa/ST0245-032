

public class codingbatLab2
{
    //Array 2
public boolean sum28(int[] nums) {
  boolean sum = false;
  int a = 0;
  if(nums.length>0){
    for(int i = 0; i<nums.length; i++){
      if(nums[i]==2)
        a+=2;
    }
    if(a==8)
      sum = true;
  }
  return sum;
}

public boolean more14(int[] nums) {
  int a = 0;
  int b = 0;
  for(int i = 0; i<nums.length; i++){
    if(nums[i]==1)
      a++;
    else if(nums[i]==4)
      b++;
  }
  if(a>b)
    return true;
  return false;
}

public int[] fizzArray(int n) {
  int [] nums = new int[n];
  for(int i = 0; i<nums.length; i++)
    nums [i] = i;
  return nums;
}

public boolean only14(int[] nums) {
  for(int i = 0; i<nums.length; i++){
    if(nums[i]!=1 && nums[i]!=4)
      return false;
  }
  return true;
}

public String[] fizzArray2(int n) {
  String [] a = new String[n];
  for(int i = 0; i<a.length; i++){
    a[i] = ""+i+"";
  }
  return a;
}

//Array 3

public int maxSpan(int[] nums) {
  if (nums.length == 0)return 0;
  if (nums.length == 1)return 1;
  int span = 0;
  for (int i = 0; i < nums.length; i++){
    for (int j = nums.length-1; j >= 0; j--){
      if (nums[i]==nums[j]){
        if ((j-i)>span)span = j-i;
      }
    }
  }
  return span+1;
}


public int[] fix34(int[] nums) {
  
  for (int i = 0; i < nums.length-1; i++){
    if (nums[i]==3){
      for (int j =nums.length-1 ; j>=0 ; j--){
        if (nums[j]==4 && nums[j-1]!=3){
          nums[j]=nums[i+1];
          nums[i+1]=4;
        }
      }
    }
  }
  return nums;
}


public int[] fix45(int[] nums) {
  for(int i = 0; i<nums.length; i++){
    if(nums[i] == 4){
      int n = nums[i+1];
      if (n!=5){
        for(int j = 0; j < nums.length; j++){
          if(nums[j] == 5 && j>0){
            if(nums[j-1]!=4){
              nums[i+1] = 5;
              nums[j] = n;
              break;
            }
          }
          else if(nums[j] == 5 && j==0){
            nums[i+1] = 5;
            nums[j] = n;
            break;
          }
        }
      }
    }
  }
  return nums;
}

public boolean canBalance(int[] nums) {
  int a = 0;
  int b = 0;
  for(int i = 0; i<nums.length; i++){
    b = 0;
    for(int j = i+1; j<nums.length; j++){
      b+= nums[j];
    }
    a+=nums[i];
    if (a == b) 
      return true;
  }
  return false;
}

public boolean linearIn(int[] outer, int[] inner) {
  boolean x = false;
  int contador=0;
  for (int i = 0; i < inner.length;i++){
    for (int j = 0; j<outer.length;j++){
      if(outer[j]==inner[i]){
        contador++;
        break;
      }
    }
  }
  return contador>=inner.length;
}



}    