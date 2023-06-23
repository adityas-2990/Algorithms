#include <bits/stdc++.h>
using namespace std;

void recInsertionSort(int arr[] , int i , int size){
    if(i == size) return;

    int j = i;
    while(j > 0 && arr[j-1] > arr[j]){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;

        j--;
    }

    recInsertionSort(arr , i+1 , size);
}

int main(){

    int Arr[7] = {4 , 1 , 7 , 9 , 3 , 2 , 8};
    recInsertionSort(Arr , 0 ,7);

    for(int i = 0 ; i < sizeof(Arr)/sizeof(int); i++){
        cout << Arr[i] << " ";
    }

    cout << endl;

    return 0;
}