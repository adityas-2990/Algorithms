#include <bits/stdc++.h>
using namespace std;

int binarySearch(vector<int> &arr , int key){
    int high = arr.size() - 1;
    int low = 0;

    while(low <= high){
        int mid = (low + high)/2;

        if(arr[mid] == key) return mid;

        if(arr[mid] < key){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }

    return -1;
}
int main(){


    vector<int> arr = {3 , 5 , 6 , 8 , 9 , 10 , 12 , 15 , 16 , 18};
    cout<< binarySearch(arr , 8) << endl;
    
    return 0;
}