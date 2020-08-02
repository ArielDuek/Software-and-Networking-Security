#include <stdio.h>
#include <stdlib.h>

int address()
{
    int *ptr = (int*) malloc(sizeof(20)); //make new array
    free(ptr); // free the memory
    ptr[1]=1; //try add to array that already free!!
    printf("-----------Address-test-------------\n");
    return 0;
}

int bounds (){
    int arr[100]; // new array
    arr[100]=1; // Out-of-Bounds of Array Access
    printf("-------------Bound-test-------------\n");
    return 0;
}

int leak()
{
    int * ptr = (int *) calloc (20, sizeof(int)); 	// allocating 80 bytes
    // free(ptr);       // make free to ptr2
    printf("--------------leak-test-------------\n");
    return 0;    //leak problem ,the program is finish and we have memory that we dont free
}



int null( int * x)
{
    if(*(x) == 1) return 1; //assert with null value
    printf("--------------null-test-------------\n\n\n\n\n\n\n\n");
    return  0;
}

int main() {
    printf("\n\n\n**************** NEW *******************\n");
    address();
    bounds();
    leak();
//    int y = 5;
//    int* pt = &y;
//    null(pt);
    int * x=NULL;
    null(x);
    return 0;
}