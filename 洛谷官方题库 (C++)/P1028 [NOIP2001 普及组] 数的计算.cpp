#include"bits/stdc++.h"
#include"algorithm"
//#include"windows.h"
  ///The following are macro definitions/
int f[1001],n;
using namespace std;
  ///The following are globle varieations definitions/

  ///The following are declarations of all the functions in program/
void read(int &data);
void read_test();
void input();
void al_ ();
void print();
  ///The following are definition of all the functions in program/
void read(int &data) {//function which can input integer faster
	int sign=1;data=0;char pos=getchar();
	while(pos<'0'||pos>'9')//if input isn't number
	  if(pos=='-') sign=-1,pos=getchar();//if input is negative number
	while(pos>='0'&&pos<='9')//if input is number
	  data=(data<<3)+(data<<1)+(pos-'0'),pos=getchar();//last data*10+new pos-'0'
	data*=sign;
}
void read_test() {//functions that can test function"read"
	int test;read(test);printf("%d",test);
}
//
void input() {//input data
	scanf("%d",&n);
}
//
void al_ () {//calculate
	f[0]=f[1]=1;
	for(int i=2;i<=n;i++) {
		if(i%2==0) f[i]=f[i-1]+f[i/2];
		else f[i]=f[i-1];
	}
}
//
void print() {//output data
	printf("%d",f[n]);
}
  ///MAIN--------------------------------------------------------------------MAIN
int main() {
	//MessageBox(NULL,"Programe designed by:M0_White.","Notice!",MB_OK);
	//read_test();
	input();
	al_();
	print();
	return 0;
}
