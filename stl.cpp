#include<iostream>
#include<math.h>
#include<string.h>
using namespace std;
void print(){
    cout<<"raj";
}
int sum(int a, int b){
    return a+b;
}
int main(){
    print();
    int s=sum(1,5);
    // prints 6
    cout<<s;
    return 0;
}




/* 
 Algorithms
 containers
 functions
 iterators
 */






//Pairs
void explainPair(){
    pair<int,int>p={1,3};
    cout<<p.first<<" "<<p.second;
    pair<int,pair<int,int>>p={1,{3,4}};
    cout<<p.first<<" "<<p.second.second<<" "<<p.second.first;
    pair<int,int>arr[]={{1,2},{2,5},{5,1}};
    cout<<arr[1].second;
} 






void explainVector(){
    vector<int> v;
    v.push_back(1);
    v.emplace_back(2);
    vector<pair<int,int>>vec;
    v.push_back({1,2});
    v.emplace_back(1,2);
    vector<int> v(5,100);
    vector<int> v(5);
    vector<int> v1(5,20);
    vector<int> v2(v1);
    
    
    
    vector<int>::iterator it=v.begin();
    it++;
    cout<<*(it)<<" ";
    it=it+2;
    cout<<*(it)<<" ";
    vector<int>::iterator it=v.end();
    vector<int>::iterator it=v.rend();
    vector<int>::iterator it=v.rbegin();
    cout<<v[0]<<" "<<v.at(0);
    cout<<v.back()<<" ";
    for(vector<int>::iterator it=v.begin(); it!=v.end(); it++){
        cout<<*(it)<<" ";
    }
    for(auto it=v.begin(); it!=v.end(); it++){
        cout<<*(it)<<" ";
    }
    for(auto it:v){
        cout<<it<<" ";
    }
    //{10,20.12,23}
    v.erase(v.begin()+1);
    //{10,20,12,23,35}
    v.erase(v.begin()+2,v.begin()+4); // // {10,20,35} [start,end)
    
    
    //Insert function
    
    
    vector<<int>v(2,100); //{100,100}
    v.insert(v.begin(),300); //{300,100,,100};
    v.insert(v.begin()+1,2,10); //{300,10,10,100,100}
    vector<int>copy(2,50); //{50,50}
    v.insert(v.begin(),copy.begin(),copy.end()); //{50,50,300,10,10,100,100}
    //{10,20}
    cout<<v.size(); //2
    //{10,20}
    v.pop_back(); //{10}
    //v1->{10,20}
    //v2->{30,40}
    v1.swap(v2); //v1->{30,40},v2->{10,20}
    v.clear(); //erases the entire vector
    cout<<v.empty();
}



void explainList(){
    list<int> ls;
    ls.push_back(2); //{2}
    ls.emplace_back(4); //{2,4}
    ls.push_front(5); //{5,2,4}
    ls.emplace_front(); //{2,4}

    //rest functions same as vector
    //begin,,end,,rbegin,rend,clear,insert,size,swap
}




void explainDeque(){
    deque<int>dq;
    dq.push_back(1); //{1}
    dq.emplace_back(2); //{1,2}
    dq.push_front(4); //{4,1,2}
    dq.emplace_front(3); //{3,4,1,2}
    dq.pop_back(); //{3,4,1}
    dq.pop_front(); //{4,1}
    dq.back();
    dq.front();

    //rest functions same as vector
    //begin,end,rbegin,rend,clear,insert,size,swap
}




void explainStack(){                   //  (LIF0)
    stack<int> st;
    st.push(1); //{1}
    st.push(2); //{2,1}
    st.push(3); //{3,2,1}
    st.push(3); //{3,3,2,1}
    st.emplace(5); //{5,3,3,2,1}
    cout<<st.top(); //prints 5 "** st[2] is invalid **"
    st.pop(); //st looks like {3,3,2,1}
    cout<<st.top(); // 3
    cout<<st.size(); // 4
    cout<<st.empty();
    stack<int>st1,st2;
    st1.swap(st2);
}




void explainQueue(){              //  (FIFO)
    queue<int>q;
    q.push(1); //{1}
    q.push(2); //{1,2}
    q.emplace(4); //{1,2,4}
    q.back()+=5
    cout<<q.back(); //prints 9
    //Q is {1,2,9}
    cout<<q.front(); //prints 1
    q.pop(); //{2,9}
    cout<<q.front(); //prints 2

    //size swap empty same as stack
}




void explainPQ(){
    priority_queue<int>pq;
    pq.push(5); //{5}
    pq.push(2); //{5,2}
    pq.push(8); //{8,5,2}
    pq.emplace(10); //{10,8,5,2}
    cout<<pq.top(); //prints 10
    pq.pop(); //{8,5,2}
    cout<<pq.top(); //prints 8

    //size swap empty function same as others

    //Minimum Heap
    priority_queue<int,vector<int>,greater<int>> pq;
    pq.push(5); //{5}
    pq.push(2); //{5,2}
    pq.push(8); //{2,5,8}
    pq.emplace(10); //{2,5,8,10}
    cout<<pq.top(); //prints 2
}



void explainSet(){
    set<int>st;
    st.insert(1); //{1}
    st.emplace(2); //{1,2}
    st.insert(2); //{1,2}
    st.insert(4); //{1,2,4}
    st.insert(3); //{1,2,3,4}

    //Functionality of insert in vector
    //can be used also, that only increases
    //efficiency

    //begin(), end(), rbegin(), rend(), size(),
    //empty() and swap() are same as those of above

    //{1,2,3,4,5}
    auto it=st.find(3);

    //{1,2,3,4,5}
    auto it=st.find(6);

    //{1,4,5}
    st.erase(5); //erases 5 //takes logarithmic time

    int cnt=st.count(1);

    auto it=st.find(3);
    st.erase(it); //it takes constant time

    //{1,2,3,4,5}
    auto it1=st.find(2);
    auto it2=st.find(4);
    st.erase(it1,it2); //after erase {1,4,5} [first,last)

    //lower_bound() and upper_bound() function works in the same way
    //as in vector it does

    //This is the syntax
    auto it=st.lower_bound(2);
    auto it=st.upper_bound(3);
}



void explainMultiset(){
    //Everything is same as set
    //only stores duplicate elements also

    multiset<int>ms;
    st.insert(1); //{1}
    st.insert(1); //{1,1}
    st.insert(1); //{1,1,1}
    ms.erase(1); //all 1's erased
    int cnt=ms.count(1);

    //only a single 1 erased
    ms.erase(ms.find(1));

    ms.erase(ms.find(1),ms.find(1)+2);
    
    //rest all functions same as set
}



void explainUset(){
    unordered set<int>st;
    //lower_bound and upper_bound function
    //does not works,rest all functions are same
    //as above,it does not stores in any
    //particular order it has a better complexity
    //than set in most cases,except some when collision happens
}



void explainMap(){
   map<int,int>mpp;
   map<int,pair<int,int>>mpp;
   map<pair<int,int>,int>mpp;
   mpp[1]=2;
   mpp.emplace({3,1});
   mpp.insert({2,4});
   mpp[{2,3}]=10;
   {
    {1,2}
    {2,4}
    {3,1}
   } 
   for(auto it:mpp) {
    cout<<it.first<<" "<<it.second<<endl;
   }
   cout<<mpp[1];
   cout<<mpp[5];

   auto it=mpp.find(3);
   cout<<*(it).second;

   auto it=mpp.find(5);

   //This is the syntax
   auto it=mpp.lower_bound(2);
   auto it=mpp.lower_bound(3);

   //erase,swap,size,empty are same as above
}



void explainMultimap() {
    //everything same as map,only it can store multiple keys
    //only mpp[key] cannot be used here
}



void explainUnorderedMap() {
    //same as set and unordered_set difference.
}


bool comp(pair<int,int>p1,pair<int,int>p2){
     if(p1.second<p2.second) return true;
     if(p1.second>p2.second) return false;
     //they are same
     if(p1.first>p2.first) return true;
     return false;
}    

void explainExtra() {
    sort(a,a+n);
    sort(v.begin(),v.end());
    sort(a+2,a+4);
    sort(a,a+n,greater<int>);
    pair<int,int>a[]={{1,2},{2,1},{4,1}};

    //sort it according to second element
    //if second element is same ,then sort
    //if according to first element but in descending

    sort(a,a+n,comp);
    //{4,1},{2,1},{1,2};

    int num=7;
    int cnt=__builtin_popcount();
    long long num=165786578687;
    int cnt=__builtin_popcountll();
    string s="123";
    do{
        cout<<s<<endl;
    }while(next_permutation(s.begin(),s.end()));
    int maxi=*max_element(a,a+n);
}

int main(){
    return 0;
}


 // Largest element in an array :
 largest=a[0]
 for ( i = 0; i < n; i++)
 {
    if(a[i]>largest)
    largest=a[i];
 }
 print(largest)

 //Second largest element in an aaray :
 slargest=-1
 for ( i = 0; i < n; i++)
 {
    if(arr[i]>slargest && arr[i]!=largest)
    slargest=arr[i]
 }
 print(slargest)

 //check if the array is sorted :
 for ( i = 1; i < n; i++)
 {
    if (arr[i]>=arr[i-1])
    {
        
    }
    else{
        return false;
    }
    return true;
 }

 //Left rotate the array by one place :
 temp=arr[0]{
    for ( i = 1; i < n; i++)
    {
        arr[i-1]=arr[i];
    }
    arr[n-1]=temp;
 }
 
//Left rotate the array by D place :
temp[]=[1,2,3]
for ( i = d; i < n; i++)     //Shifting
{
    a[i-d]=a[i];
}

j=0
for(i=n-d;i<n;i++){
    a[i]=temp[i-(n-d)];    //put back temp
    j++;
}

//Move all zeros to the end of the array :
temp[]             //Step 1
for(i=0->n)
{
    if(arr[i]!=0)
    temp.add(arr[i]);
}
for ( i = 0; i < temp.size(); i++)      //Step 2
{
    arr[i]=temp[i]
    no. of non zeros=temp.size
}
for ( i = non zeros; i < n; i++)       //Step 3
{
    arr[i]=0;
}

//Linear search :
for ( i = 0; i < n; i++)
{
    if(arr[i]==num)
    return i;
}
return -1;

//Union of two sorted arrays :
set<int>st           //Step 1
for ( i = 0; i < n1; i++)
{
    st.insert(a[i])
}
for ( i = 0->n2)
{
    st.insert(a2[i])
}
union[st.size()]
i=0;
for(auto it:st)
union[i++]=it;
union.add(it)

//Intersection of two sorted array :
ans->[];  vis[n2]=[0];
for(j=0->n1){
    for(j=0->n2){
        if(a[i]==b[j] && vis[j]==0){
            ans.add(a[i])
            vis[j]=1;
            break;
        }
        if(b[j]>a[i]) break;
    }
}

//Missing number :
for ( i = 1; i < N; i++)
{
    flag=0
    for ( j = 0; j<n-1; j++)
    {
        if(arr[j]==i)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
    return i;
}

//Maximum consecutive ones :

//Find the no. that appears once,and the others twice :
map<long long,int>
for(i=0->n)
mpp[arr[i]]++;
for(auto it:mpp){
    if(it.second==1)
    return it.first;
}

//Longest subarray with sum k [positions] :
for ( i = 0; i < n; i++)
{
    for ( j = i; i < n; j++)
    {
        s=0
        for(k=i->j)
        s+=a[k]
        if(s==k) len=max(len,j-i+1)
    }
}
print(len);

//Two sum :


//Sort an array of 0's,1's and 2's :
a[mid]==0      swap(a[low],a[mid])
                low++,mid++
a[mid]==1       mid++
a[mid]==2        swap(a[mid],a[high])    
                 high--;          

//Majority element (>N/2 times) :

//Maximum subarray sum :

//Best time to buy and sell stock :

//Rearrange array elements by sign :

//Next permutation :
if(index==-1)
reverse(arr)

//Leaders in an array :

//Longest consecutive sequence :

//Set matrix zeroes :

//Rotate image :

//Spiral matrix :

//Number of subarrays with sum k :

//Pascal triangle :

//Majority element 2 :

//3 sum :

//4 sum :

//Count subarrays with xor as k :

//Merge overlapping subintervals :

//Merge 2 sorted arrays without extra space :

//Reverse pairs :

//Maximum product subarray :


 
 
