// BinarySearch.java
//  Created on December 10, 2004
//  Created by Shahein Tajmir
//	This class implements a recursive Binary Search that will search using
// integer bounds of an array for a given string

public class BinarySearch
{

    /*
     * public static void main(String[] args) { String[] data = {"Shahein",
     * "Abena", "Ryan", "John"};
     * 
     * MergeSort.sort(data, 0, data.length );
     * 
     * int a = BinarySearch.search("Shahein", data, data.length, 0);
     * System.out.println(a); }
     */

    //  The search method is located below. As arguments, it takes the text to
    // sought after, the array to look inside, the upper limit, and the lower
    // limit.
    //***********************************************************************
    //  THIS SEARCH WAS MODIFIED TO SUPPORT STRINGS FROM AN ORIGINAL
    // IMPLEMENTATION I WROTE FOR INTEGERS. THE ORIGINAL CODE HAS BEEN COMMENTED
    // OUT
    //***********************************************************************
    //public static int search(int num, int[] array, int upper, int lower)
    public static int search(String text, Book[] array, int upper, int lower,
                    int type)
    {
        //if (array[(upper + lower) / 2] == num)
        // Sort array
        //MergeSort.sort(array, 0, array.length);
        if(type == 0)
        {
            if(array[(upper + lower) / 2].getCatalogNum().equals(text))
                return ((upper + lower) / 2);

            //if (lower == upper && num != array[(upper + lower) / 2])

            if(lower == upper
                    && (!text.equals(array[(upper + lower) / 2].getCatalogNum())))
                return -1;

            //if (array[(upper + lower) / 2] > num
            //|| array[(upper + lower) / 2] < num)

            //  Assignment of variables for testing of string lexicography
            boolean before = false, after = false, equal = false;

            //If string at middle of search area is after the search string
            if(array[(upper + lower) / 2].getCatalogNum().compareTo(text) > 0)
                after = true;
            //If string at the middle is before the search string
            else if(array[(upper + lower) / 2].getCatalogNum().compareTo(text) < 0)
                before = true;
            //If string is the same as the search string
            else
                equal = true;

            // If either before or after
            if(after || before)
            {
                if(after)
                    upper = (upper + lower) / 2;
                else
                    lower = (upper + lower) / 2;
            }
            if(upper - lower == 1) // if the search area contains only two
                                   // elements
            {
                if(array[upper].getCatalogNum().equals(text))
                    return upper;
                else if(array[lower].getCatalogNum().equals(text))
                    return lower;
                else
                    return -1;
            }
        }
        
        else if(type == 1)
        {
            if(array[(upper + lower) / 2].getAuthor().equals(text))
                return ((upper + lower) / 2);

            //if (lower == upper && num != array[(upper + lower) / 2])

            if(lower == upper
                            && (!text.equals(array[(upper + lower) / 2].getAuthor())))
                return -1;

            //if (array[(upper + lower) / 2] > num
            //|| array[(upper + lower) / 2] < num)

            //  Assignment of variables for testing of string lexicography
            boolean before = false, after = false, equal = false;

            //If string at middle of search area is after th  search string
            if(array[(upper + lower) / 2].getAuthor().compareTo(text) > 0)
                after = true;
            //If string at the middle is before the search string
            else if(array[(upper + lower) / 2].getAuthor().compareTo(text) < 0)
                before = true;
            //If string is the same as the search string
            else
                equal = true;

            // If either before or after
            if(after || before)
            {
                if(after)
                    upper = (upper + lower) / 2;
                else
                    lower = (upper + lower) / 2;
            }
            if(upper - lower == 1) // if the search area contains only two
                                   // elements
            {
                if(array[upper].getAuthor().equals(text))
                    return upper;
                else if(array[lower].getAuthor().equals(text))
                    return lower;
                else
                    return -1;
            }
        }
        else if(type == 2)
        {
            if(array[(upper + lower) / 2].getTitle().equals(text))
                return ((upper + lower) / 2);

            //if (lower == upper && num != array[(upper + lower) / 2])

            if(lower == upper
                            && (!text.equals(array[(upper + lower) / 2].getTitle())))
                return -1;

            //if (array[(upper + lower) / 2] > num
            //|| array[(upper + lower) / 2] < num)

            //  Assignment of variables for testing of string lexicography
            boolean before = false, after = false, equal = false;

            //If string at middle of search area is after the search string
            if(array[(upper + lower) / 2].getTitle().compareTo(text) > 0)
                after = true;
            //If string at the middle is before the search string
            else if(array[(upper + lower) / 2].getTitle().compareTo(text) < 0)
                before = true;
            //If string is the same as the search string
            else
                equal = true;

            // If either before or after
            if(after || before)
            {
                if(after)
                    upper = (upper + lower) / 2;
                else
                    lower = (upper + lower) / 2;
            }
            if(upper - lower == 1) // if the search area contains only two
                                   // elements
            {
                if(array[upper - 1].getTitle().equals(text))
                    return upper - 1;
                else if(array[lower].getTitle().equals(text))
                    return lower;
                else
                    return -1;
            }
        }
        return search(text, array, upper, lower, type); // recursive call

    }
}