#include <bits/stdc++.h>
using namespace std;

void merge(vector<int> &arr , int low , int mid , int high){
    vector <int> temp; // Creating a temporary array
    int left = low;
    int right = mid+1;

    while (left <= mid && right <= high)
    {
        if(arr[left] <= arr[right]){
            temp.push_back(arr[left]);
            left++;
        }else{
            temp.push_back(arr[right]);
            right++;
        }
    }


    //Remaining elements from the left part

    while(left <= mid){
        temp.push_back(arr[left]);
        left++;
    }

    //Remaining elements of the right part

    while (right <= high )
    {
        temp.push_back(arr[right]);
        right++;
    }

    //copying elements from temp to main array
    
    for (int i = low; i <= high; i++)
    {
        /* code */

        arr[i] = temp[i-low];
    }
      
}

void mergeSort(vector <int> &arr , int low , int high){
    if(low >= high) return;

    int mid = (high + low)/2;
    mergeSort(arr , low , mid);
    mergeSort(arr , mid+1 , high);
    merge(arr , low , mid , high);
}



int main(){

    vector <int> A = {1 , 6 , 3 , 6 , 8 , 10 , 0 , 4 , 9};
    
    mergeSort(A , 0 , A.size() -1);

    for(int i = 0 ; i < A.size() ; i++){
        cout << A[i] << " ";
    }

    cout << endl;

    return 0;
}