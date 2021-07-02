#include"cstdio"
#include"cstring"
using namespace std;
char ca[5000],cb[5000];
int a[5000],b[5000],lenc=0,jinw,c[5000]={0};
void addplus() {
    scanf("%s%s",&ca,&cb);
    for(int i=0;i<strlen(ca);i++)
      a[strlen(ca)-i]=ca[i]-'0';
    for(int i=0;i<strlen(cb);i++)
      b[strlen(cb)-i]=cb[i]-'0';
    while(lenc<=strlen(ca)||lenc<=strlen(cb)) {
        lenc++;
        c[lenc]=a[lenc]+b[lenc]+jinw;
        jinw=c[lenc]/10;
        c[lenc]%=10;
    }
    if(c[lenc]==0) lenc--;
    for(int i=lenc;i>=1;i--) printf("%d",c[i]);
}
int main() {
    addplus();
    return 0;
}
