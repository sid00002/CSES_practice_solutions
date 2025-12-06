#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
	ll n;
	cin>>n;
	
	vector<pair<int, int>> ans;
	ll x = n;
	while(x--){
	    ll a, b;
	    cin>>a>>b;
	    
	    ans.push_back({a, 1});
	    ans.push_back({b, -1});
	}
	
	sort(ans.begin(), ans.end());
	ll res = 0;
	ll temp = 0;
	for(int i=0; i<ans.size(); i++){
	    temp+= ans[i].second;
	    res = max(res, temp);
	}
	cout<<res<<endl;
    return 0;


}
