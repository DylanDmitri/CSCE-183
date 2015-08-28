#include <stdio.h>
#include <math.h>

int main() {

	double m, H, y;

	printf("Enter the inputs\n");
	scanf("%lf %lf %lf", &m, &H, &y);

	double r = m * pow(.5, y / H);

	printf("Starting with %lfkg of an isotope with a half-life of %lf years, after %lf years you would have %lf kilograms left.",
			m, H, y, r);

	return 0;
}

// 10 28.79 2
