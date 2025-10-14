package problem2;

public class IntegerList
{
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
            numberOfElements++;
        }
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numberOfElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    // 1)-----------------------------------------------------
    // double the size of the array
    // -------------------------------------------------------
    private int numberOfElements = 0;
    public void increaseSize() {
        int newSize = list.length * 2;
        int[] newList = new int[newSize];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }

    // 2)-----------------------------------------------------
    // add an element to the end of the array
    // -------------------------------------------------------
    public void addElement(int element) {
        if (numberOfElements == list.length) {
            increaseSize();
        }
        list[numberOfElements] = element;
        numberOfElements++;
    }

    // 3)-----------------------------------------------------
    // remove the first occurrence of an element
    // -------------------------------------------------------
    public void removeFirstOccurrence(int element) {
        for (int i = 0; i < numberOfElements; i++) {
            if (list[i] == element) {
                for (int j = i; j < numberOfElements - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[numberOfElements - 1] = 0; // clear the last element
                numberOfElements--;
            }
        }
    }

    // 4)-----------------------------------------------------
    // remove all occurrences of an element
    // -------------------------------------------------------
    public void removeAll(int element) {
        int i = 0;
        while (i < numberOfElements) {
            if (list[i] == element) {
                for (int j = i; j < numberOfElements - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[numberOfElements - 1] = 0; // clear the last element
                numberOfElements--;
            } else {
                i++;
            }
        }
    }
}