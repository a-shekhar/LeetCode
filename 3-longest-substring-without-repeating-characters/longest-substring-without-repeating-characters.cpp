class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        	int n = s.size();

	int l = 0,r = 0;
	map<char,bool>mp;

	string ans = "";
	int i=0,j=0;
	while(r<n){
		if(mp[s[r]]==true){
			while(l<r && mp[s[r]]==true){
				mp[s[l]]=false;
				l++;
			}
		}
		mp[s[r]]=true;
		if(j-i<r-l){
			i = l;j = r;
		}
		r++;
	}
	ans = s.substr(i,(j-i+1));
    return ans.length();
    }
};