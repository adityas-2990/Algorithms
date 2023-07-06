#include <bits/stdc++.h>
using namespace std;


 int recursiveBinarySearch(vector<int> &arr , int high , int low , int key){
    int mid = (high + low)/2;

    if(arr[mid] == key) return mid;

    if(arr[mid] < key){
        recursiveBinarySearch(arr , high , mid+1 , key);
    }else{
        recursiveBinarySearch(arr , mid-1 , low , key);
    }
}


int binarySearch(vector<int> &arr , int key){
    return recursiveBinarySearch(arr , arr.size() - 1 , 0 , key);
}

int main(){

    vector<int> arr = {3 , 5 , 6 , 8 , 9 , 10 , 12 , 15 , 16 , 18};
    cout<< binarySearch(arr , 8) << endl;

    return 0;
}