import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static class LinkedList{
        static class llNode{
            int data;
            llNode next;

            public llNode(int data){
                this.data = data;
                this.next = null;
            }
        }    
        
        llNode head;
        
        public void append(int data){
            llNode temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            llNode newNode = new llNode(data);
            temp.next = newNode;
        }
    }
    
    public static int[] sortFreq(int [] array){
        //making the freqArray having freq corresponding to all the elements in array
        int [] freqArray = new int [60];
        for(int i = 0;i < array.length;i++){
            freqArray[array[i]]+=1;
        }
        //finding the maxFreq
        int maxFreq = 0;
        for(int i = 0;i < freqArray.length;i++){
            if(freqArray[i] > maxFreq){
                maxFreq = freqArray[i];
            }
        }
        //making an array of linkedlist which has freq node followed by the element types
        LinkedList [] llarray = new LinkedList [maxFreq];
        for(int i = 0;i < maxFreq;i++){
            llarray[i] = new LinkedList();
        }

        for(int i = 0;i < maxFreq;i++){
            for(int j = 0;j < freqArray.length;i++){
                if(freqArray[j] == i){
                    llarray[i].append(freqArray[j]);
                    llarray[i].append(j);
                }
            }
        }
        //sorting the array of linkedlist
        Arrays.sort(llarray);
        //putting the values in answer array
        int arrayIndex = 0;
        for(int i = 0;i < maxFreq;i++){
            while(llarray[i].data = i){
                for(int k = 0;k < llarray[i].data;k++){
                    array[arrayIndex] = llarray[i].next.data;
                    arrayIndex++;
                    if(arrayIndex > array.length){
                        System.out.println("The loop encountered a problem");
                    }
                }
            }
        }
    }
    
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T > 0){
		    int N = s.nextInt();
		    int [] array = new int [N];
		    for(int i = 0;i < N;i++){
		        array[i] = s.nextInt();
		    }
            array = sortFreq(array);
            for(int i = 0;i < array.length;i++){
                System.out.println(array[i]+" ");
            }
		    T--;
		}
	}
}