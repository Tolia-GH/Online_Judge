#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
	int n,i,x,y;
	scanf("%d",&n);
	int a[10010],b[10010],g[10010],k[10010];
	for(i=1;i<=n;i++)
	 scanf("%d%d%d%d",&a[i],&b[i],&g[i],&k[i]);
	
	scanf("%d%d",&x,&y);
	for(i=n;i>=1;i--)
	{
		if(a[i]<=x&&x<=a[i]+g[i]&&b[i]<=y&&y<=b[i]+k[i])
		 break;
	}
	if(i==0) printf("-1");
	else printf("%d",i);
	return 0;
}
