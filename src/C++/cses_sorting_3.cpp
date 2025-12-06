#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
	int n, x;
	cin>>n>>x;
	
    vector<int> a(n);
    for(int i=0; i<n; i++) cin>>a[i];
    
    sort(a.begin(), a.end());
    int cnt = 0;
    int l = 0, r = n-1;
    while(l<=r){
        ll sum = a[l] + a[r];
        if(sum <= x){
            cnt++;
            l++;
            r--;
        } else {
            cnt++;
            r--;
        }
    }
	cout<<cnt<<endl;
	return 0;

}
