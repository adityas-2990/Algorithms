#include <bits/stdc++.h>
using namespace std;

void selectionSort(int A[] , int n){
    
    for(int i = 0 ; i < n ; i++){
        int minEle = INT32_MAX;
        int minIndx = i;

        //Finding Minimum element
        for(int j = i ; j < n ; j++){
            
            if(A[j] < minEle){
                minEle = A[j];
                minIndx = j;
            }
        }

        //Swap
        int cpy = A[i];
        A[i] = minEle;
        A[minIndx] = cpy;
    }

    for(int i = 0 ; i < n ; i++){
        cout << A[i] << " ";
    }
}

int main(){

    int Arr[7] = {4 , 1 , 7 , 9 , 3 , 2 , 8};
    selectionSort(Arr , 7);
    cout << endl;

    return 0;
}



