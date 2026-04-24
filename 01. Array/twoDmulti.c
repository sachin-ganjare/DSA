#include <stdio.h>
int main(){
      int r1 = 3, c1 = 3, r2 = 3, c2 = 2;
    int r_res = r1, c_res = c2;
   int sum;
    

    //declare arrays
     // fixed-size arrays can be initialized
    int array1[3][3] = {
        {5, 4, 3},
        {10, 9, 5},
        {3, 4, 5}
    };
    int array2[3][2] = {
        {7, 8},
        {10, 9},
        {3, 4}
    };
    int result[3][2];
   
    //multiplication
    
    //we have to sum the product of all r1s with respective r2s -> i will be same of elements
    for(int pointer_rows1 = 0; pointer_rows1 < r1; pointer_rows1++){
    for(int pointer_cols2 = 0; pointer_cols2 < c2; pointer_cols2++) {
        sum = 0;
        for (int k = 0; k < r2; k++ ){
            sum += array1[pointer_rows1][k] * array2[k][pointer_cols2];
        }
        result[pointer_rows1][pointer_cols2] = sum ;
    }
    };

    //row major order
    for(int i = 0; i < r1; i++){
        for (int j = 0; j < c1; j++){
    printf( "%d " , array1[i][j]);
    }printf("\n");
    };
     printf("Array1 above: \n \n");

    for(int i = 0; i < r2; i++){
        for (int j = 0; j < c2; j++){
    printf( "%d " , array2[i][j]);
    }printf("\n");
    };
    printf("Array2 above: \n \n");

    for(int i = 0; i < r_res; i++){
        for (int j = 0; j < c_res; j++){
    printf( "%d " , result[i][j]);
    } printf("\n");
    };
    printf("Result above: \n");

    /*
    to multiply two arrays,
    no. of columns of first array must be equal to 
    no. of rows of second array.
    */
    /*
    result: 
    matrix with no. of rows of first arrray and
                no. of columns of second array
    */

    return 0;
}