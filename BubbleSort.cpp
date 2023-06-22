#include <bits/stdc++.h>
using namespace std;

void bubbleSort(int A[] , int size){
    for(int i = 0 ; i < size ; i++){
        for(int j = 0 ; j < size-i ; j++){
            if(A[j] > A[j+1]){
                //swapping
                int cpy = A[j];
                A[j] = A[j+1];
                A[j+1] = cpy;
            }
        }
    }

    for (int i = 0; i < size; i++)
    {
        cout << A[i] << " ";
    }
    
}

int main(){

    int Arr[7] = {4 , 1 , 7 , 9 , 3 , 2 , 8};
    bubbleSort(Arr , 7);
    cout << endl;

    return 0;
}
