// #include<iostream>
// using namespace std;
// int main(){
//     for(int i=1;i<=10;i++){
//         cout<<i<<endl;
//     }
// }


// #include<iostream>
// using namespace std;
// int main(){
// int n;
// cin>>n;
// int arr[n];
// for(int i=0;i<n;i++){
// cin>>arr[i];
// }
// if(n>=4){
// cout<<arr[0]+arr[1]<<endl;
// cout<<arr[n-1]+arr[n-2];
// }else{
// cout<<"Need at least 2 numbers.";
// }
// return 0;
// }


// #include<iostream>
// #include <iomanip>
// using namespace std;
// int main(){
//     float a = 20.9898;
//     cout << fixed << setprecision(6) << 10.45 << " ";
//     return 0;
// }


// #include<iostream>
// using namespace std;
// int main(){
//     int a=3;
//     int b=3;
//     int c=3;
//     if((a+b)/2 >= c){
//         cout<<"true";
//     }else{
//         cout<<"false";
//     }
//     return 0;
// }


// #include<iostream>
// using namespace std;
// int main(){
//     string s="shi#an&";
//     if(s.length()%2==0){
//         cout<<"true";
//     }else{
//         cout<<"false";
//     }
//     return 0;
// }

// #include <iostream>
// using namespace std;
// int main() {
//     int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//     int n = sizeof(arr)/sizeof(arr[0]);
//     int evenCount = 0, oddCount = 0;
//     for(int i = 0; i < n; i++) {
//         if(arr[i] % 2 == 0)
//             evenCount++;
//         else
//             oddCount++;
//     }
//     if(evenCount > oddCount)
//         cout << "even";
//     else if(oddCount > evenCount)
//         cout << "odd";
//     else
//         cout << "tie";

//     return 0;
// }

// #include <iostream>
// #include <vector>
// #include <algorithm>
// using namespace std;
// int main() {
//     int n;
//     cout << "Enter number of elements: ";
//     cin >> n;
//     vector<int> arr(n);
//     cout << "Enter array elements: ";
//     for (int i = 0; i < n; i++) {
//         cin >> arr[i];
//     }
//     int a = count(arr.begin(), arr.end(), 1);
//     cout << "Number of 1's: " << a << endl;
//     auto it = find(arr.begin(), arr.end(), 1);
//     if (it != arr.end()) {
//         arr.erase(it);
//     }
//     cout << "Array after erasing first occurrence of 1: ";
//     for (int i = 0; i < arr.size(); i++) {
//         cout << arr[i] << " ";
//     }
//     cout << endl;
//     return 0;
// }

#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int>v1={2,6,1,3,9};
    vector<int>v2={5,1,8,7,0,4,1,2};
    for(int i=0;i<v1.size();i++){
        for(int j=0;j<v2.size();j++){
            if(v1[i]>v2[j]){
                cout<<v1[i];
            }else{
                cout<<j;
            }
        }
        return 0;
    }
}



