#include"cstdio"
#include"cstring"
using namespace std;
char ca[10100],cb[10100];
int a[10100],b[10100],lenc=0,jiew,c[10100]={0};
int judge(char c[],char cb[]) {
	if(strlen(ca)<strlen(cb)) {
		printf("-");
		return 1;
	}
	if(strlen(cb)<strlen(ca)) return 0;
	if(strlen(ca)==strlen(cb)) {
		for(int i=0;i<strlen(ca);i++) {
			if(ca[i]<cb[i]) {
				printf("-");
				return 1;
			}
			if(ca[i]>cb[i]) return 0;
		}
	}//*/
}
void redplus(char ca[],char cb[]) {
	if(strcmp(ca,cb)==0) {
		printf("0"); return;
	}
	if(judge(ca,cb)) {
		char temp[5000];
		strcpy(temp,cb);
		strcpy(cb,ca);
		strcpy(ca,temp);
	}
    for(int i=0;i<strlen(ca);i++)
      a[strlen(ca)-i]=ca[i]-'0';
    for(int i=0;i<strlen(cb);i++)
      b[strlen(cb)-i]=cb[i]-'0';
    while(lenc<=strlen(ca)||lenc<=strlen(cb)) {
        lenc++;
        if(a[lenc]-b[lenc]<0) {
        	jiew+=10;
        	a[lenc+1]--;
		}
		c[lenc]=a[lenc]+jiew-b[lenc];
		c[lenc]%=10;
    }
    while(c[lenc]==0) lenc--;
    for(int i=lenc;i>=1;i--) printf("%d",c[i]);
}
int main() {
	scanf("%s%s",&ca,&cb);
	//for(int i=0;i<strlen(ca);i++) printf("%c",ca[i]);
    redplus(ca,cb);
    return 0;
}
