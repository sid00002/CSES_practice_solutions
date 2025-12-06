#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
	ll n;
	cin>>n;
	set<ll>st;
	for(int i=0; i<n; i++){
	    ll x;
	    cin>>x;
	    st.insert(x);
	}
	cout<<st.size()<<endl;
	return 0;

}
