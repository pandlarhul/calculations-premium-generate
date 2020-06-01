#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int singleNonDuplicateUtil(int arr[],int start, int end) {
        //cout<<"start : "<<start<<" End : "<<end<<endl;
        while (start <= end){
            int mid = start + (end - start) / 2;


/*            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;*/

            if (arr[mid] != arr[mid+1] && arr[mid]!=arr[mid-1])
                return mid;

            if (arr[mid] == arr[mid-1] && mid%2==0)
                end = mid - 1;
//                return singleNonDuplicateUtil(nums, start, mid - 1);

            if (arr[mid] == arr[mid-1] && mid%2==1)
                start = mid+1;
//                return singleNonDuplicateUtil(nums, mid+1, end);


            if (arr[mid] == arr[mid+1] && mid%2==0)
                start = mid+1;
//                return singleNonDuplicateUtil(nums, mid+1, end);

            if (arr[mid] == arr[mid+1] && mid%2==1)
                end = mid-1;
//                return singleNonDuplicateUtil(nums, start, mid - 1);
        }
        return -1;

    }
    int singleNonDuplicate(vector<int>& nums) {
        int *arr = new int[nums.size()];
        for(int i=0;i<nums.size(); i++) {
            arr[i] = nums[i];
        }
        int end = (int)nums.size()-1,start =0;

        return singleNonDuplicateUtil(arr,start,end);
    }
};
int main() {
    vector<int> arr {1,3,3,7,7,10,10,11,11,12,12};
    Solution solution;
    cout<<arr.at(solution.singleNonDuplicate(arr));

    return 0;
}

