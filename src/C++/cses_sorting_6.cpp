#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main()
{
 
    int n;
    cin>>n;
    vector<pair<int, int>> v(n);
 
    for(int i=0; i<n; i++)
    {
        cin>>v[i].first>>v[i].second;
 
    }
    sort(v.begin(), v.end(), sortbysec);
    int count=0;
   int i=0;
   int endTime=-1;
   while(i<n)
   {
       if(v[i].first>=endTime)
       {
           count++;
           endTime= v[i].second;
           i++;
       }
       else
       {
           i++;
       }
   }
    cout<<count<<endl;
    return 0;
}

