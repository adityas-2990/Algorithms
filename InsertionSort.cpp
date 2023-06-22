#include <bits/stdc++.h>
using namespace std;

void insertionSort(int A[] , int size){
    for (int i = 0; i < size ; i++)
    {
        int j = i;
        while(j > 0 && A[j-1] > A[j]){
            int temp = A[j-1];
            A[j-1] = A[j];
            A[j] = temp;

            j--;
        }
    }

    for (int i = 0; i < size; i++)
    {
        cout << A[i] << " ";
    }
    
    
}

int main(){

    int Arr[7] = {4 , 1 , 7 , 9 , 3 , 2 , 8};
    insertionSort(Arr , 7);
    cout << endl;

    return 0;
}