#include"cstdio"
#include"algorithm"
using namespace std;
int m,n;
int square[51][51],dp[51][51][51][51];
int ans;
void input() {
	scanf("%d%d",&m,&n);
	for(int i=1;i<=m;i++) 
		for(int j=1;j<=n;scanf("%d",&square[i][j++])) {}
}
void DP() {
	for(int i=1;i<=m;i++)
        for(int j=1;j<=n;j++)
            for(int k=1;k<=m;k++)
                for(int l=j+1;l<=n;l++) 
                    dp[i][j][k][l]=max(max(max(
					dp[i][j-1][k-1][l],
					dp[i-1][j][k][l-1]),
					dp[i][j-1][k][l-1]),
					dp[i-1][j][k-1][l])
					+square[i][j]+square[k][l];
	ans=dp[m][n-1][m-1][n];
}
int main() {
	input();
	DP();
	printf("%d",ans);
	return 0;
}
