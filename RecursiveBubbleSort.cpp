#include <bits/stdc++.h>
using namespace std;

void recBubbleSort(int arr[] , int size){

    if(size == 1) return;

    for(int j = 0 ; j < size-1 ; j++){
        if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }

    recBubbleSort(arr , size -1);
}

int main(){

    int Arr[7] = {4 , 1 , 7 , 9 , 3 , 2 , 8};
    recBubbleSort(Arr , 7);


    for(int i = 0 ; i < sizeof(Arr)/sizeof(int) ; i++){
        cout << Arr[i] << " ";
    }

    cout << endl;


    return 0;
}