import java.util.*;  
public class BruteForcePrintAllPermutation
{
	public static void recurPermute(int [] inp_arr,List<Integer> temp_ds,List<List<Integer>> out,boolean [] picked){

    if(temp_ds.size()==inp_arr.length){
      out.add(new ArrayList<>(temp_ds));
      return;
    }
    for(int i=0;i<inp_arr.length;i++){
     	if(!picked[i]){
          temp_ds.add(inp_arr[i]);
          picked[i]=true;
          recurPermute(inp_arr,temp_ds,out,picked);
          temp_ds.remove(Integer.valueOf(inp_arr[i]));
          picked[i]=false;
     	}
      }    
	}
	public static List<List<Integer>> permute(int [] inp_arr){
	List<List<Integer>> out = new ArrayList<>();
	List<Integer> temp_ds = new ArrayList<>();
    boolean [] picked = new boolean[inp_arr.length];
    recurPermute(inp_arr,temp_ds,out,picked);
    return out;
	}
	public static void main(String[] args){  
     int [] inp_arr = {1,2,3};
     System.out.println(permute(inp_arr));
	}  
}