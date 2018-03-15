#include <stdio.h>
#include <conio.h>
int main(void)
{
	char ch, str[79 + 1];
	int x, y, z, p, l, o;
	float a, b, c;
	double A, B, C;
	printf("\n\t Entera symbol");
	ch = getchar();
	_flushall();
	printf("\n\ Enter a string\n");
	gets_s(str, 79);
	printf("\t The string is:%s\n", str);
	scanf_s("%f%f", &a, &b);
	c = a * b;
	printf("%f=%f*%f",c,a,b);
	A = 12.369876405;
	B = 13.48998908;
	C = A + B;
	printf("\n\ Enter a string\n");
	printf("%f", C);
	x = 7;
	y = 8;
	z = x*y;
	printf("\n\ Enter a string\n");
	printf("%d", z);
	p = 30;
	l = 10;
	o = p / l;
	printf("\n\ Enter a string\n");
	printf("%d", o);

	_getch();
	return 0;
}