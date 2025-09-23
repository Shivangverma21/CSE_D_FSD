// #include <iostream>
// using namespace std;
// int main() {
//     string a;
//     //cin>> a;
//     getline(cin,a);
//     cout<< a << " a student";
//     return 0;
// }

// #include <iostream>
// using namespace std;
// int main() {
//     string a;
//     cin>> a;
//     //getline(cin,a);
//     cout<< a << " a student";
//     return 0;
// }

// #include <iostream>
// using namespace std;
// int main() {
//     cout<< "Shivang" << " a student";
//     return 0;
// }


// #include <iostream>
// using namespace std;
// int main() {
//     string name;
//     int age,roll;
//     cout<< "enter name ";
//     getline(cin,name);
//     cout<< "enter age ";
//     cin>> age;
//     cout<< "enter roll ";
//     cin>> roll;
//     cout<< name << " " << age << " " << roll ;
//     return 0;
// }

// #include <iostream>
// using namespace std;
// int main() {
//     int num;
//     cin >> num;
//     cout<< num * 3 ;
//     return 0;
// }


// #include <iostream>
// using namespace std;
// int main() {
//     int n;
//     cout << "Enter size of array: ";
//     cin >> n;
//     int arr[n];
//     cout << "Enter " << n << " elements:\n";
//     for(int i = 0; i < n; i++) {
//         cin >> arr[i];
//     }
//     for(int i = 0; i < n; i++) {
//         int nextGreater = 0;  
//         for(int j = i + 1; j < n; j++) {
//             if(arr[j] > arr[i]) {
//                 nextGreater = arr[j];
//                 break; 
//             }
//         }
//         cout << nextGreater << " ";
//     }
//     return 0;
// }

#include<iostream>
using namespace std;
int main(){
    int arr[5]={1,5,2,3,1};
    int maxi=INT_MIN;
    int mini=INT_MAX;
    for(int i=0;i<5;i++){
        maxi=max(arr[i],maxi);
        mini=min(arr[i],mini);
    }
    cout<<maxi-mini;
    return 0;
}

