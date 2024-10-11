// Java code for linearly searching x in arr[]. If x
// is present, then return its location, otherwise
// return -1.
package linearsearch;

// Name: Meran Awadh Al-Daadi
// ID: 445005774
public class LinearSearch {

    // This function returns the index of element x in arr[]
    // Parameters:
    // arr[] - the array where the search is performed
    // n - the number of elements in the array
    // x - the element being searched for
    static int search(int arr[], int n, int x) {
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // If the element is found, return its index
            if (arr[i] == x) {
                return i;
            }
        }
        // Return -1 if the element is not found
        return -1;
    }

    // The main function to execute the search
    public static void main(String[] args) {
        // Define an array of integers
        int[] arr = {3, 4, 1, 7, 5};

        // Calculate the length of the array
        int n = arr.length;

        // The element we are searching for
        int x = 5;

        // Call the search function and store the index
        int index = search(arr, n, x);

        // Check if the element is present in the array
        if (index == -1) {
            System.out.println("Element is not present in the array");
        } else // Output the index of the element if found
        {
            System.out.println("Element found at position " + index);
        }
    }
}
