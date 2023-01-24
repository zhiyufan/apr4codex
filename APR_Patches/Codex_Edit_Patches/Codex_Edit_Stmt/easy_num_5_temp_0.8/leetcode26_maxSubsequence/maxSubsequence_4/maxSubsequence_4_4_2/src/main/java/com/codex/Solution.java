package com.codex;

import java.util.*;

public class Solution {
    // Include
    #include <bits/stdc++.h>
    using namespace std;
    
    //Macros
    #define PI 3.14159265359
    #define all(v) v.begin(),v.end()
    #define sortva(v) sort(all(v))
    #define sortvd(v) sort(v.rbegin(),v.rend())
    #define sortaa(a,n) sort(a,a+n)
    #define sortad(a,n) sort(a,a+n),reverse(a,a+n)
    #define sfi1(v) scanf("%d",&v)
    #define sfi2(v1,v2) scanf("%d %d",&v1,&v2)
    #define sfi3(v1,v2,v3) scanf("%d %d %d",&v1,&v2,&v3)
    #define sfll1(v) scanf("%I64d",&v);
    #define sfll2(v1,v2) scanf("%I64d %I64d",&v1,&v2)
    #define sfll3(v1,v2,v3) scanf("%I64d %I64d %I64d",&v1,&v2,&v3)
    #define sfstr(v) scanf("%s", v);
    #define sz(v) (int)v.size()
    #define ndl puts("")
    #define SS stringstream
    #define F first
    #define S second
    #define pb push_back
    #define mp make_pair
    #define loop(i,a,b) for (int i = a; i < b; i++)
    #define prec setprecision(n)
    
    //Short code
    typedef long long ll;
    typedef vector<int> vi;
    typedef pair<int,int> pi;
    typedef unsigned long long ull;
    typedef long double ld;
    
    //Useful code
    #define mem(a,n) memset(a,n,sizeof(a));
    #define MAX 10000001
    const int mod = 1e9+7;
    //=========================================


    int main ()
    {
        #ifndef ONLINE_JUDGE
            freopen("input.txt", "r", stdin);
            //freopen("output.txt", "w", stdout);
        #endif
        int t;
        sfi1(t);
        while(t--){
            int n, k;
            sfi2(n, k);

            int a[n];
            for(int i = 0; i < n; ++i){
                sfi1(a[i]);
            }

            int dp[k + 1][n + 1];
            for(int i = 0; i <= n; ++i){
                dp[0][i] = 1;
            }

            for(int i = 1; i <= k; ++i){
                for(int j = 1; j <= n; ++j){
                    dp[i][j] = dp[i][j - 1];
                    if(j - a[j - 1] >= 0){
                        dp[i][j] = (dp[i][j] % mod + dp[i - 1][j - a[j - 1]] % mod) % mod;
                    }
                }
            }

            cout << dp[k][n] << endl;
        }
        
        //#ifndef ONLINE_JUDGE
            //cout<<"\nTime Elapsed: " << 1.0*clock() / CLOCKS_PER_SEC << " sec\n";
        //#endif
        return 0;
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        
        int n = nums.length;

        if(n < k){
            return new int[0];
        }

        int[] prefixSum = new int[n + 1];
        for(int i = 1; i <= n; ++i){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int[] dp = new int[k + 1];
        int[] index = new int[k + 1];

        for(int i = 1; i <= k; ++i){
            int last = index[i - 1];
            while(last < i - 1 && dp[i - 1] - prefixSum[last] >= prefixSum[i] - prefixSum[last + 1]){
                last++;
            }
            dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last]);
            index[i] = last;
        }
        int[] ans = new int[k];
        int start = index[k];
        for(int i = k - 1; i >= 0; --i){
            while(start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]){
                start++;
            }
            ans[i] = k - start;
            k = start;
        }

        return ans;
    }
}