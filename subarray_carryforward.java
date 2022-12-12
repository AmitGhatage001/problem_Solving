package DSA_Array;

public class subarray_carryforward {

    // handling two edge cases
        if(A.size()==1)
                return 1;
        if(A.size()==2)
                return 2;
    // fiunding min 7 max in a array
    int max=A.get(0);
    int min=A.get(0);
        for(int i=0;i<A.size();i++){
        if(A.get(i)>max)
            max=A.get(i);
        if(A.get(i)<min)
            min=A.get(i);
    }

        if(min==max)
            return 1;

    // now finding length of subarrays in which min is at one of the end of subarray and max is to it's closest

    int ans=Integer.MAX_VALUE;
    int length=0;
      for(int i=0;i<A.size();i++){
        if(A.get(i)==min){
            for(int j=i+1;j<A.size();j++){
                if(A.get(j)==max){
                    length=j-i+1;
                    if(length<ans){
                        ans=length;   // logic to get smallest length subarray
                    }
                }
            }
        }
        else if(A.get(i)==max){
            for(int j=i+1;j<A.size();j++){
                if(A.get(j)==min){
                    length=j-i+1;
                    if(length<ans){
                        ans=length;   // logic to get smallest length subarray
                    }
                }
            }
        }
    }

      return ans;
}
