// The sorting would work as long as the
// value 0 is NOT part of the values to sort. 

import java.util.Arrays;

public class InsertionSort {
      
      
      public static int[] InsertionSortAlg(int[] Array) {
            
            int lenArray = Array.length;
            
            int[] SortedArray = new int[lenArray];
            
            
            
            for (int Loop = 0; Loop < lenArray; Loop = Loop + 1) {
                  
                  //Remove comments of line below to see array getting sorted little by little
                  //System.out.println("Sorting in progres... " + Arrays.toString(SortedArray));
                  
                  int CurrentNum = Array[Loop]; // The number to insert in SortedArray
                  int Position = 0; // Position in SortedArray where CurrentNum will be inserted
                  
                  // We look for the position where to insert the CurrentNum
                  while (SortedArray[Position] != 0 && SortedArray[Position] <= CurrentNum) {
                           Position = Position + 1;
                  } // While 
                  
                  
                  // At this stage we know where to insert CurrenNum in SortedArray
                  
                  //We look for the position of "0" at the most left
                  int IsZero = 0;
                  while (SortedArray[IsZero] != 0) {
                        IsZero = IsZero + 1;
                  } // while
                  
                  
                  //We now have to move that 0 to the left until it matches Position
                  while (IsZero > Position) {
                        
                        int TempVar = SortedArray[IsZero - 1]; 
                        SortedArray[IsZero] = TempVar;
                        SortedArray[IsZero - 1] = 0;
                        IsZero = IsZero - 1;
                        
                  } // while
                  
                  // Iserting CurrentNum where 0 was positioned
                  SortedArray[IsZero] = CurrentNum;
                  
            } // For Loop in range(lenArray)
            
            return SortedArray;
            
      } // public static int[] InsertionSortAlg
      
      
      
      public static void main(String[] args) {
            
            int[] Array = {3, 2, 1, 4, 5, 14, 22, 63, 53, 22, 12, 45, 213, 53, 233, 41, 98};
            
            int[] SortedArray = InsertionSortAlg(Array); 
            
            System.out.println("Original array: " + Arrays.toString(Array));
            System.out.println("The sorted array is: " + Arrays.toString(SortedArray));
            
      } // Public Static Void Main
      
} // Public Class InsertionSort


