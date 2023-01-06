import java.util.*;
public class OptimizedPrintAllPermutation
{

    public static void recurPermute(List<Integer> inp_list, List<List<Integer>> out,int index){
      if(index==inp_list.size()){
      	out.add(new ArrayList<>(inp_list));
      	return;
      }

      for(int i=index;i<inp_list.size();i++){
      	Collections.swap(inp_list,index,i);
      	recurPermute(inp_list,out,index+1);
      	Collections.swap(inp_list,index,i);
      }
    }

    public static List<List<Integer>> permute(List<Integer> inp_list){
       List<List<Integer>> out = new ArrayList<>();
       recurPermute(inp_list,out,0);
       return out;
    }

	public static void main(String [] args){
       int [] inp_arr ={1,2,3};
       List<Integer> inp_list = new ArrayList<>();
       for(int i:inp_arr){
       	inp_list.add(i);
       }
       System.out.println(permute(inp_list));
	}
}