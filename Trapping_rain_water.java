package Array;

public class Trapping_rain_water {
  public static void main(String args []){
  int height [] = {4,2,0,6,3,2,5};
  int left [] = new int[height.length];
  left[0] = height[0];
  for(int i = 1; i<height.length; i++){
      left[i]= Math.max(left[i-1],height[i]);
  }
  int right [] = new int[height.length];
  right[height.length-1] = height[height.length-1];
  for(int i = height.length-2; i>=0; i--){
      right[i] = Math.max(right[i+1], height[i]);
  }
  int trp = 0;
  for(int i = 0; i<height.length; i++){
      int waterlevel = Math.min(left[i], right[i]);
      trp+=waterlevel-height[i];
  }
      System.out.println(trp);
  }
}
