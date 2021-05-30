#include<cstdio>
using namespace std;

int main() {
	int n=1,k;
	scanf("%d",&k);
	for(double Sn=1;Sn<=k;n++,Sn+=1.0/n) {
		//printf("%lf\n",Sn);
	}
	printf("%d",n);
	return 0;
}
