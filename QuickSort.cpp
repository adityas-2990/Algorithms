#include <bits/stdc++.h>
using namespace std;

int partition(vector<int> &arr , int low , int high){
    int pivot = arr[low];
    int i = low;
    int j = high;
    while(i < j){
        while(arr[i] <= pivot && i <= high -1){
            i++;
        }

        while (arr[j] > pivot && j >= low +1){
            j--;
        }

        if(i <j){
            swap(arr[i] , arr[j]);
        }
        
    }

    swap(arr[low] , arr[j]);
    return j;
}

void qs(vector<int> &arr , int low , int high){
    if(low < high){
        int partitionInx = partition(arr , low , high);
        qs(arr , low , partitionInx - 1);
        qs(arr , partitionInx + 1 , high);
    }
}

vector<int> quickSort(vector<int> arr){
    qs(arr , 0 , arr.size() -1);
    return arr;
}

int main(){

    vector<int> Arr = {4 , 1 , 7 , 9 , 3 , 2 , 8};
    Arr = quickSort(Arr);
    for(int i = 0 ; i < Arr.size() ; i++){
        cout<< Arr[i] << " ";
    }
    cout << endl;

    return 0;
}