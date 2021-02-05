#include<bits/stdc++.h>
using namespace std;
const int MAXN=10001;
int a[MAXN]={0};
int main()
{
	int l,m,x,y,sum=0;
	scanf("%d%d",&l,&m);
	for(int i=1;i<=m;i++)
	{
		scanf("%d%d",&x,&y);
		for(int j=x;j<=y;j++) a[j]=1;
    }
    for(int i=0;i<=l;i++)
    if(a[i]==0) sum++;
    printf("%d\n",sum);
    return 0;
}
