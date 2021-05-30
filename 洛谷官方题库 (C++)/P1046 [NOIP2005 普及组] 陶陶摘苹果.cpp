#include<cstdio>
using namespace std;
int main() {
	int high[12];
	int hei,sum=0;
	for(int i=1;i<=10;i++)
	  scanf("%d",&high[i]);
	scanf("%d",&hei);
	for(int i=1;i<=10;i++) {
		if(high[i]<=(hei+30))
		sum++;
	}
	printf("%d",sum);
	return 0;
}
