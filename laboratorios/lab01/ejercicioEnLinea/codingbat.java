    
public class codingbat
{
     //RECURSION 1

public int countHi(String str) {
  int count = 0;
  if (str.length()<2)return count; //C1
  String x = str.substring(str.length()-2, str.length()); //C2
  if (x.equals("hi"))count++; //C3
  return count + countHi(str.substring(0, str.length()-1)); // T(n)= C4 + T(n-1)
}
//Resolviendo en Wolfram nos queda T(n)= C4 + Cn
//T(n) es O(C4 + C4n) por definicion de O
//T(n) es O(C4n) por regla de la suma
//T(n) es O(n) por regla de la multiplicacion

public int countX(String str) {
  int count = 0;
  if(str.length()==0)return count;//C1
  String x = str.substring((str.length()-1), (str.length())); 
  if(x.equals("x")) count++; //C2
  return count + countX(str.substring(0, str.length()-1)); //T(n)=C3 + T(n-1)
}
//Resolviendo en Wolfram nos queda T(n)= C3 + Cn
//T(n) es O(C3 + Cn) por definicion de O
//T(n) es O(C3n) por regla de la suma
//T(n) es O(n) por regla de la multiplicacion

public int powerN(int base, int n) {
  if (n==1)return base;//C1
  return base*powerN(base, n-1); //T(n)= C2*T(n-1)
}
//Resolviendo en Wolfram nos queda T(n)= C2*C^n-1
//T(n) es O(C2*C^n-1) por definicion de O
//T(n) es O(C^n-1) por regla de la multiplicacion


public int count7(int n) {
  int count = 0;
 if (n%10==7) count++;//C1
 if (n/10==0) return count; //C2
 return count+count7(n/10); //T(n)= C3 + T(n/10)
}
// Resolviendo en Wolfram T(n) = c3*log10 n
// T(n) es O(c3*log10 n), Definición O
// T(n) es O(log n), Regla de la multiplicacion

public int sumDigits(int n) {
  if (n/10==0)return n; //C1
  else return (n%10) + sumDigits(n/10); //T(n)=C2+ T(n/10)
}
// Resolviendo en Wolfram T(n) = c2*log10 n
// T(n) es O(c2*log10 n), Definición O
// T(n) es O(log n), Regla de la multiplicacion

//RECURSION 2

public boolean groupSum6(int start, int[] nums, int target) {
  if (start >= nums.length) return (target == 0); //C1
  if(nums[start] == 6) return(groupSum6(start +1, nums, target - 6)); //T(n)=T(n-6)
  else return ((groupSum6(start + 1, nums, target - nums[start]))||(groupSum6(start + 1, nums, target))); T(n)=T(n-)+T(n)
}
 
public boolean groupNoAdj(int start, int[] nums, int target) {
  if(start >= nums.length) return (target == 0);//C1
  else return ((groupNoAdj(start+2, nums, target-nums[start]))||(groupNoAdj(start+1, nums, target)));//T(n)=T(n-x)+T(n)
}
 
public boolean groupSum5(int start, int[] nums, int target) {
  if (start >= nums.length) //C1
    return (target == 0);
  if((start<nums.length-1)&&(nums[start]%5 == 0)&&(nums[start+1]==1)) //C2
    return groupSum5(start + 2, nums, target - nums[start]); //
  if((start<nums.length-1)&&(nums[start]%5 == 0)&&(nums[start+1]!=1))
    return groupSum5(start + 1, nums, target - nums[start]);
  else
    return groupSum5(start + 1, nums, target - nums[start])||(groupSum5(start + 1, nums, target));
}
 
public boolean groupSumClump(int start, int[] nums, int target) {
  if(start>=nums.length)  return(target==0);
  int aux = start;
  int cont = 0;
  while((aux<nums.length)&&(nums[aux] == nums[start])){
    aux++;
    cont++;
  }
  return ((groupSumClump(start+cont, nums, target-(nums[start]*cont)))||(groupSumClump(start+cont, nums, target)));
}

public boolean splitArray(int[] nums) {
  return splitArrayAux(0, nums, 0, 0);
}
public boolean splitArrayAux(int i, int[] nums, int group1, int group2){
  if(i >= nums.length)  return (group1 == group2);
  else return((splitArrayAux(i + 1, nums, group1 + nums[i], group2))||(splitArrayAux(i + 1, nums, group1, group2 + nums[i])));
}
}
